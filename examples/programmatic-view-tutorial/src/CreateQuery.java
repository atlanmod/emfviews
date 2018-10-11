import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.atlanmod.emfviews.core.EmfViewsFactory;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import org.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;
import org.atlanmod.emfviews.virtuallinksepsilondelegate.EclDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.helper.OCLHelper;

public class CreateQuery {
  static String here = new File(".").getAbsolutePath();

  static URI resourceURI(String relativePath) {
    return URI.createFileURI(here + relativePath);
  }

  public static void main(String args[]) throws ParserException, IOException {
    Map<String, Object> map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    map.put("xmi", new XMIResourceFactoryImpl());
    map.put("ecore", new EcoreResourceFactoryImpl());
    map.put("eview", new EmfViewsFactory());
    VirtualLinksPackage.eINSTANCE.eClass();
    VirtualLinksDelegator.register("ecl", new EclDelegate());

    // Initialize OCL
    OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
    OCLHelper oclHelper = ocl.createOCLHelper();

    // Load the view
    Resource view  = new ResourceSetImpl().getResource(resourceURI("/../emfviews-tutorial/views/allChapters.eview"), true);
    view.load(null);

    // Set the query context
    EObject root = view.getContents().get(0);
    EObject context = root.eClass();
    oclHelper.setContext(context);

    // Create the query
    Query query = ocl.createQuery(oclHelper.createQuery("self.bookChapters->collect(c | c.title)"));

    // Evaluate and print result
    System.out.println("Result: " + query.evaluate(root));

    ocl.dispose();
  }
}
