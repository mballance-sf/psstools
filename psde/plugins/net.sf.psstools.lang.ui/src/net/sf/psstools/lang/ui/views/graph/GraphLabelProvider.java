package net.sf.psstools.lang.ui.views.graph;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IFigureProvider;

public class GraphLabelProvider extends LabelProvider implements
		IFigureProvider, IConnectionStyleProvider {
	

	@Override
	public String getText(Object element) {
		if (element instanceof GraphViewNode) {
			return ((GraphViewNode)element).toString();
		} else if (element instanceof EntityConnectionData) {
			return "";
		} else {
			System.out.println("getText: " + element);
		}
		// TODO Auto-generated method stub
		return super.getText(element);
	}

	@Override
	public Color getColor(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getConnectionStyle(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getHighlightColor(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLineWidth(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IFigure getTooltip(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFigure getFigure(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
