package net.sf.psstools.lang.ui.views.graph;

import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.geometry.Rectangle;

public class FigureBranchPoint extends PolygonShape {

	public FigureBranchPoint() {
//		Rectangle rect = new Rectangle(0, 0, 50, 50);
		setBounds(new Rectangle(15, 15, 15, 15));
		Rectangle rect = new Rectangle(0, 0, 15, 15);
		setStart(rect.getTop());
		addPoint(rect.getTop());
		addPoint(rect.getLeft());
		addPoint(rect.getBottom());
		addPoint(rect.getRight());
		addPoint(rect.getTop());
		setEnd(rect.getTop());
		setFill(true);
	}

}
