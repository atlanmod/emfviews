import java.io.File;
import java.util.Arrays;
import java.util.Map;

import org.atlanmod.emfviews.core.View;
import org.atlanmod.emfviews.core.Viewpoint;
import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CreateView {
  static String here = new File(".").getAbsolutePath();

  static URI resourceURI(String relativePath) {
    return URI.createFileURI(here + relativePath);
  }

  public static void main(String[] args) {
    Map<String, Object> map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    map.put("xmi", new XMIResourceFactoryImpl());
    map.put("ecore", new EcoreResourceFactoryImpl());

    ResourceSet rs = new ResourceSetImpl();
    EPackage Book = (EPackage) rs.getResource(resourceURI("/../emfviews-tutorial/metamodels/Book.ecore"), true).getContents().get(0);
    EPackage Publ = (EPackage) rs.getResource(resourceURI("/../emfviews-tutorial/metamodels/Publication.ecore"), true).getContents().get(0);

    EPackage.Registry.INSTANCE.put(Book.getNsURI(), Book);
    EPackage.Registry.INSTANCE.put(Publ.getNsURI(), Publ);

    Resource book = rs.getResource(resourceURI("/../emfviews-tutorial/models/book.xmi"), true);
    Resource publ = rs.getResource(resourceURI("/../emfviews-tutorial/models/publication.xmi"), true);

    // 1. Build viewpoint weaving model
    VirtualLinksFactory f = VirtualLinksFactory.eINSTANCE;
    WeavingModel WM1 = f.createWeavingModel();
    WM1.setName("publicationsAndBooks");

    ConcreteConcept source;
    {
      ContributingModel cm = f.createContributingModel();
      WM1.getContributingModels().add(cm);
      cm.setURI("http://publication");
      ConcreteConcept cc = f.createConcreteConcept();
      cm.getConcreteElements().add(cc);
      cc.setPath("Publication");
      source = cc;
    }

    ConcreteConcept target;
    ConcreteElement nbPages;
    {
      ContributingModel cm = f.createContributingModel();
      WM1.getContributingModels().add(cm);
      cm.setURI("http://book");
      ConcreteConcept cc = f.createConcreteConcept();
      cm.getConcreteElements().add(cc);
      cc.setPath("Chapter");
      target = cc;
      ConcreteElement ce = f.createConcreteElement();
      cm.getConcreteElements().add(ce);
      ce.setPath("Chapter.nbPages");
      nbPages = ce;
    }

    {
      VirtualAssociation va = f.createVirtualAssociation();
      WM1.getVirtualLinks().add(va);
      va.setName("bookChapters");
      va.setUpperBound(-1);
      va.setSource(source);
      va.setTarget(target);
    }

    {
      Filter fi = f.createFilter();
      WM1.getVirtualLinks().add(fi);
      fi.setName("nbPages");
      fi.setTarget(nbPages);
    }

    // 2. Build viewpoint
    Viewpoint viewpoint = new Viewpoint(Arrays.asList(Book, Publ), WM1);

    // 3. Build view weaving model
    WeavingModel WM2 = f.createWeavingModel();
    WM2.setName("publicationsAndBooks");

    {
      ContributingModel cm = f.createContributingModel();
      WM2.getContributingModels().add(cm);
      cm.setURI("http://publication");
      ConcreteConcept cc = f.createConcreteConcept();
      cm.getConcreteElements().add(cc);
      cc.setPath(publ.getURIFragment(publ.getContents().get(0)));
      source = cc;
    }

    {
      ContributingModel cm = f.createContributingModel();
      WM2.getContributingModels().add(cm);
      cm.setURI("http://book");
      ConcreteConcept cc = f.createConcreteConcept();
      cm.getConcreteElements().add(cc);
      cc.setPath(book.getURIFragment(book.getContents().get(0).eContents().get(0)));
      target = cc;
    }

    {
      VirtualAssociation va = f.createVirtualAssociation();
      WM2.getVirtualLinks().add(va);
      va.setName("bookChapters");
      va.setSource(source);
      va.setTarget(target);
    }

    // 4. Build view
    View view = new View(viewpoint, Arrays.asList(book, publ), WM2);

    // 5. Navigate the new association in the view
    EObject vpubl = view.getVirtualContents().get(1);
    System.out.println(vpubl.eGet(vpubl.eClass().getEStructuralFeature("title")));

    EStructuralFeature assoc = vpubl.eClass().getEStructuralFeature("bookChapters");
    EObject vchapter = ((EList<EObject>) vpubl.eGet(assoc)).get(0);
    System.out.println(vchapter.eGet(vchapter.eClass().getEStructuralFeature("title")));
  }
}
