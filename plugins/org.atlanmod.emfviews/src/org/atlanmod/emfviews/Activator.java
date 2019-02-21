package org.atlanmod.emfviews;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.atlanmod.emfviews.core.ViewResource;

import fr.inria.atlanmod.neoemf.resource.PersistentResource;

public class Activator implements BundleActivator {

  @Override
  public void start(BundleContext bundleContext) throws Exception {
    // Make sure to close NeoEMF resources opened by various Ecore browsers.
    // Since ViewResource is in charge of opening NeoEMF resources, we must
    // also close them, otherwise the NeoEMF resource is locked and will fail
    // to be opened again.
    //
    // Problem: the Resource API has no way to know when a browser viewing it is
    // closing.
    //
    // Solution: register a global PartListener that will know when *any*
    // workbench part is closed. If it's an Ecore browser we care about (Sample
    // Ecore Editor, MoDisco, ...), and it's looking at a ViewResource, then we
    // close any NeoEMF resource it may hold.

    PlatformUI.getWorkbench().getDisplay().asyncExec(() -> {
      PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(new IPartListener2() {

        @Override
        public void partActivated(IWorkbenchPartReference partRef) {}

        @Override
        public void partBroughtToTop(IWorkbenchPartReference partRef) {}

        @Override
        public void partClosed(IWorkbenchPartReference partRef) {
          IWorkbenchPart part = partRef.getPart(true);

          // MoDisco's EcoreBrowser is not public API, but this still works.
          if (part instanceof EcoreBrowser) {
            EcoreBrowser browser = ((EcoreBrowser) part);
            for (Resource r : browser.getResourceSet().getResources()) {
              if (r instanceof ViewResource) {
                for (Resource rr : ((ViewResource) r).getView().getContributingModels()) {
                  if (rr instanceof PersistentResource) {
                    ((PersistentResource) rr).close();
                  }
                }
              }
            }
          }
        }

        @Override
        public void partDeactivated(IWorkbenchPartReference partRef) {}

        @Override
        public void partOpened(IWorkbenchPartReference partRef) {}

        @Override
        public void partHidden(IWorkbenchPartReference partRef) {}

        @Override
        public void partVisible(IWorkbenchPartReference partRef) {}

        @Override
        public void partInputChanged(IWorkbenchPartReference partRef) {}
      });
    });

  }

  @Override
  public void stop(BundleContext context) throws Exception {}
}
