package armines.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.adapter.EMFModelAdapter;
import org.eclipse.m2m.atl.engine.emfvm.adapter.IModelAdapter;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import emfviews.dsl.generator.VpdlGenerator;

public class RunTransfoJava {
	
	public static String ID="vpdl.dsl";
	
	public void runTransformation(String pMetamodel, String pMetamodel2, String pTransformation, String pInputModel, String pOutputModel){
		try {
			/*
			 * Initializations
			 */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			/*
			 * Load metamodel 1
			 */
			IReferenceModel metamodel1 = modelFactory.newReferenceModel();
			injector.inject(metamodel1, pMetamodel);
			/*
			 * Load metamodel 2
			 */
			//Register virtuallinks mm (we only have the .ecore file)
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
				ResourceSet rs = new ResourceSetImpl();
				// enable extended metadata
				final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
				rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,extendedMetaData);

				Resource r = rs.getResource(URI.createURI("platform:/resource/EMFViewsSQLTest/metamodels/VirtualLinksMM2.ecore"), true);
				EObject eObject = r.getContents().get(0);
				if (eObject instanceof EPackage) {
				    EPackage p = (EPackage)eObject;
				    EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
				}
			
			
			
			
			IReferenceModel metamodel2 = modelFactory.newReferenceModel();
			injector.inject(metamodel2, pMetamodel2);
			
			/*
			 * Run transformation
			 */
			IModel inputModel = modelFactory.newModel(metamodel1);
			injector.inject(inputModel, pInputModel);
			IModel outputModel = modelFactory.newModel(metamodel2);
			
			IModelAdapter modelAdapter = new EMFModelAdapter();
			modelAdapter.setAllowInterModelReferences(true); //$NON-NLS-1$ //$NON-NLS-2$
			
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(inputModel, "IN", "SQL");
			transformationLauncher.addOutModel(outputModel, "OUT", "VL");
			InputStream is_transf = null;
			try {
				is_transf = VpdlGenerator.class.getResource(pTransformation).openStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				is_transf);
			
			extractor.extract(outputModel, pOutputModel);
			
			/*
			 * Unload all models and metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) outputModel);
			emfModelFactory.unload((EMFReferenceModel) metamodel1);
			emfModelFactory.unload((EMFReferenceModel) metamodel2);
			System.out.println("Finished transformation");
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RunTransfoJava rtj = new RunTransfoJava();
		//metamodels, transformation, input model, output model
		rtj.runTransformation("metamodels/Sqlview.ecore", "metamodels/VirtualLinksMM2.ecore", "transformations/SQL2VirtualLinks.asm",
				"models/view2.xmi","models/myEAviewpoint.xmi");
		//rtj.runTransformation(args[0], args[1], args[2], args[3],args[4]);
	}
}