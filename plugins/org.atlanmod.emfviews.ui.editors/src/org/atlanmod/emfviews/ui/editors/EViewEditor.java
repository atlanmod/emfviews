package org.atlanmod.emfviews.ui.editors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import org.atlanmod.emfviews.core.EmfViewsFactory;

public class EViewEditor extends EditorPart {
  private TreeViewer treeViewer;

  @Override
  public void createPartControl(Composite parent) {
    treeViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

    IFile file = ((IFileEditorInput) getEditorInput()).getFile();
    URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

    // @Refactor: maybe there's a way to use a global resource factory registry instead?
    Resource v = new EmfViewsFactory().createResource(uri);

    try {
      v.load(null);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    treeViewer.setContentProvider(new ITreeContentProvider() {

      @Override
      public Object[] getElements(Object inputElement) {
        if (inputElement instanceof Object[]) {
          return (Object[]) inputElement;
        } else {
          return new Object[0];
        }
      }

      @Override
      public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Resource) {
          return ((Resource) parentElement).getContents().toArray();
        } else if (parentElement instanceof EObject) {
          return ((EObject) parentElement).eContents().toArray();
        } else {
          return new Object[0];
        }
      }

      @Override
      public Object getParent(Object element) {
        if (element instanceof Resource) {
          return null;
        } else if (element instanceof EObject) {
          return ((EObject) element).eContainer();
        } else {
          return null;
        }
      }

      @Override
      public boolean hasChildren(Object element) {
        if (element instanceof Resource) {
          return !((Resource) element).getContents().isEmpty();
        } else if (element instanceof EObject) {
          return !((EObject) element).eContents().isEmpty();
        } else {
          return false;
        }
      }

    });
    treeViewer.setLabelProvider(new LabelProvider() {
      @Override
      public String getText(Object element) {
        if (element instanceof Resource) {
          return ((Resource) element).getURI().toString();
        } else if (element instanceof EObject) {
          EObject o = (EObject) element;
          String className = o.eClass().getName();

          // Use the "name" feature, if it exists and is not empty
          EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
          String shortName = null;
          if (nameFeature != null && nameFeature.getEType() == EcorePackage.Literals.ESTRING) {
            String s = (String) o.eGet(nameFeature);
            if (s != null && !s.isEmpty()) {
              shortName = s;
            }
          }

          // Otherwise, use the first non-empty String-valued attribute
          // @Correctness: this seems to not pick up aliases of EString
          // or subtypes maybe?
          if (shortName != null) {
            Optional<String> stringValue = o.eClass().getEAllStructuralFeatures().stream()
                .filter(feature -> (feature.getEType() == EcorePackage.Literals.ESTRING)
                    && o.eIsSet(feature))
                .map(feature -> (String) o.eGet(feature)).filter(value -> !value.isEmpty())
                .findFirst();

            if (stringValue.isPresent()) {
              shortName = stringValue.get();
            }
          }

          if (shortName == null) {
            shortName = "";
          }

          return String.format("%s %s", className, shortName);
        } else {
          return element.toString();
        }
      }
    });

    treeViewer.setInput(new Object[] { v });
    getEditorSite().setSelectionProvider(treeViewer);

    // Refresh on right-click
    // @Refactor: we should probably use a command for that
    treeViewer.getControl().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseUp(MouseEvent event) {
        if (event.button == 3) {

          // Save the expanded state
          Object[] expandedElements = treeViewer.getExpandedElements();

          Resource r = new EmfViewsFactory().createResource(uri);
          try {
            r.load(null);
          } catch (IOException ex) {
            ex.printStackTrace();
          }

          treeViewer.setInput(new Object[] { r });

          // Restore the expanded state
          // Find the equivalent object in the new resource, and expand it
          for (Object o : expandedElements) {
            // We don't care about Resource (they are at the top-level)
            if (o instanceof EObject) {
              // @Correctness: the object path is not quite accurate for this purpose
              // some objects have no name, but still have children
              String fqn = getEObjectPath((EObject) o);
              // @Optimize: that's a dumb and slow way to do it
              TreeIterator<EObject> it = r.getAllContents();
              while (it.hasNext()) {
                EObject ro = it.next();
                if (fqn.equals(getEObjectPath(ro))) {
                  treeViewer.setExpandedState(ro, true);

                  // Expand only the first match
                  break;
                }
              }
            } else if (o instanceof Resource) {
              treeViewer.setExpandedState(r, true);
            }
          }
        } else if (event.button == 1) {
          // Print the object path on click
          ITreeSelection selection = treeViewer.getStructuredSelection();
          Object o = selection.getFirstElement();
          if (o instanceof EObject) {
            System.out.println(getEObjectPath((EObject) o));
          }
        }
      }
    });
  }

  protected static String getEObjectPath(EObject o) {
    List<String> comps = new ArrayList<>();

    while (o != null) {
      EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
      if (nameFeature != null) {
        comps.add((String) o.eGet(nameFeature));
      }
      o = o.eContainer();
    }

    Collections.reverse(comps);
    return String.join(".", comps);
  }

  @Override
  public <T> T getAdapter(Class<T> adapter) {
    return super.getAdapter(adapter);
  }

  @Override
  public void setFocus() {
    treeViewer.getControl().setFocus();
  }

  @Override
  public void doSave(IProgressMonitor monitor) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void doSaveAs() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    if (!(input instanceof IFileEditorInput))
      throw new PartInitException("Invalid Input: Must be IFileEditorInput");

    setSite(site);
    setInput(input);
    setPartName(input.getName());
  }

  @Override
  public boolean isDirty() {
    return false;
  }

  @Override
  public boolean isSaveAsAllowed() {
    return false;
  }

}
