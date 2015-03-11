package net.sf.psstools.lang.ui.views.graph;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
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
import org.eclipse.zest.core.widgets.GraphContainer;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.VerticalLayoutAlgorithm;

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
		if (fGraphViewer != null) {
			fGraphViewer.setInput(input);
		}
	}
	
	private void createGraphViewer(Composite parent) {
		parent.setLayout(new GridLayout());
		fGraphViewer = new GraphViewer(parent, SWT.BORDER);
		fGraphViewer.setContentProvider(new GraphContentProvider());
		fGraphViewer.setLabelProvider(new GraphLabelProvider());
		
		fGraphViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		LayoutAlgorithm m;
		
		fGraphViewer.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
//		fGraphViewer.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		IFigure f;
		LayoutManager l;
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
