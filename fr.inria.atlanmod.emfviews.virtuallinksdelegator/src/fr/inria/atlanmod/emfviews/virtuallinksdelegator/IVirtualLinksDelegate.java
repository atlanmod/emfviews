package fr.inria.atlanmod.emfviews.virtuallinksdelegator;


import java.util.List;



import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.URI;
public interface IVirtualLinksDelegate
{
	
	public void createVirtualMetamodelLinks(String linksDslFile, URI linksModel)throws Exception;
	
	public void createVirtualModelLinks(String linksDslFile, URI linksModelURI ,List<Resource> inputModels)throws Exception;

}
