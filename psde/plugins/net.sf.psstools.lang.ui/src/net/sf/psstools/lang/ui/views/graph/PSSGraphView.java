package net.sf.psstools.lang.ui.views.graph;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;

public class PSSGraphView extends ViewPart implements IZoomableWorkbenchPart,
		SelectionListener {
	private GraphViewer					fGraphViewer;

	public PSSGraphView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		createGraphViewer(parent);

	}
	
	public void setInput(Object input) {
		System.out.println("setInput: " + input);
	}
	
	private void createGraphViewer(Composite parent) {
		parent.setLayout(new GridLayout());
		fGraphViewer = new GraphViewer(parent, SWT.BORDER);
		
		fGraphViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		System.out.println("widgetSelected: " + e);
		// TODO Auto-generated method stub

	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public AbstractZoomableViewer getZoomableViewer() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
