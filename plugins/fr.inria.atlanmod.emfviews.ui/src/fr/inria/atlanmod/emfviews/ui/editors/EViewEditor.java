package fr.inria.atlanmod.emfviews.ui.editors;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import fr.inria.atlanmod.emfviews.core.EmfViewsFactory;

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
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
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
          EObject o = ((EObject) element);

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

    //System.out.println("Adapter is " + Platform.getAdapterManager().getAdapter(v.getContents().get(0), IPropertySource.class));
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
