package net.sf.psstools.lang.ui.views.graph;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.GraphElabResult;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;

public class GraphContentProvider implements IStructuredContentProvider,
		IGraphEntityContentProvider {
	private GraphElabResult				fElabResult;
	private GraphViewNode				fRoot;
	private Object						fNullResult[] = new Object[0];
	private List<GraphViewNode>			fElements = new ArrayList<GraphViewNode>();

	@Override
	public Object[] getConnectedTo(Object obj) {
		System.out.println("getConnectedTo: " + obj);
		if (obj instanceof GraphViewNode) {
			return ((GraphViewNode)obj).getConnected().toArray();
		}

		return fNullResult;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof GraphElabResult) {
			fElabResult = (GraphElabResult)newInput;
			fRoot = GraphViewNodeFactory.build(fElabResult.getGraph().getRootRule()).first();
			fElements.clear();
			collect_nodes(fRoot, fElements);
		} else {
			fElabResult = null;
			fRoot = null;
		}
	}
	
	private static void collect_nodes(GraphViewNode n, List<GraphViewNode> nodes) {
		nodes.add(n);
		for (GraphViewNode s : n.getConnected()) {
			collect_nodes(s, nodes);
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (fRoot != null) {
			// return new Object[] {fRoot};
			System.out.println("getElements: " + fElements.size());
			return fElements.toArray();
		}

		return fNullResult;
	}

	

}
