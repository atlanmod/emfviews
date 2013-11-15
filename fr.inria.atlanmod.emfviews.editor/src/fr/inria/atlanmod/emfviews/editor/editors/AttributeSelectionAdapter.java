package fr.inria.atlanmod.emfviews.editor.editors;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TreeItem;


public class AttributeSelectionAdapter extends SelectionAdapter
{
	
	ViewtypeEditor mpe;
	
	public AttributeSelectionAdapter(ViewtypeEditor mpe)
	{
		super();
		this.mpe=mpe;
		
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) 
	{
		TreeItem item=(TreeItem) e.item;
		mpe.updateAttributesToHide(item);
		
	}

	

}
