package fr.inria.atlanmod.emfviews.editor.editors;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class AttributeSelectionContentProvider implements ITreeContentProvider
{

	Resource virtualMetamodel;
	ITreeContentProvider emfContentProvider;
	
	public AttributeSelectionContentProvider()
	{
		emfContentProvider = new AdapterFactoryContentProvider(new ReflectiveItemProviderAdapterFactory());
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		if(inputElement instanceof Collection<?>)
		{
			return ((Collection<?>)inputElement).toArray();
		}
		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement)
	{
		Object[] result = new Object[0];
		if(parentElement instanceof Resource)
		{
			Resource r =(Resource)parentElement;
			EList<EObject> contents=r.getContents();
			return contents.toArray();
		}
		else if(parentElement instanceof EPackage)
		{
			EPackage pack= (EPackage)parentElement;
			return pack.getEClassifiers().toArray();
		}
		else if(parentElement instanceof EObject)
		{
			result = emfContentProvider.getChildren(parentElement);
		}
		else if(!hasChildren(parentElement))
		{
			
		}
		
		return result;
		
		
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		if(element instanceof EObject)
			return true;
		return false;
	}

}
