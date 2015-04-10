package net.sf.psstools.lang.ui.views.graph;

import net.sf.psstools.lang.elaborator.GraphElabResult;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
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
	private GraphElabResult				fInput;
	private LightweightSystem			fLWS;

	public PSSGraphView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Canvas c = new Canvas(parent, SWT.NONE);
		fLWS = new LightweightSystem(c);
	}
	
	public void setInput(Object input) {
		if (input instanceof GraphElabResult) {
			fInput = (GraphElabResult)input;
			GraphFigureFactory figure_f = new GraphFigureFactory();
			IFigure root = figure_f.build(fInput);
			fLWS.setContents(root);
		}
	}
	
//	private void createGraphViewer(Composite parent) {
//		parent.setLayout(new GridLayout());
//		fGraphViewer = new GraphViewer(parent, SWT.BORDER);
//		fGraphViewer.setContentProvider(new GraphContentProvider());
//		fGraphViewer.setLabelProvider(new GraphLabelProvider());
//		
//		fGraphViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
//		LayoutAlgorithm m;
//		
////		fGraphViewer.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
//		fGraphViewer.setLayoutAlgorithm(new GraphLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
////		fGraphViewer.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
//	}
	
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
