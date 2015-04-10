package net.sf.psstools.lang.ui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class UMLClassFigure extends Figure {
	  public static Color classColor = new Color(null,255,255,206);
	  private CompartmentFigure attributeFigure = new CompartmentFigure();
	  private CompartmentFigure methodFigure = new CompartmentFigure();
	  public UMLClassFigure(Label name) {
	    ToolbarLayout layout = new ToolbarLayout();
	    setLayoutManager(layout);	
	    setBorder(new LineBorder(ColorConstants.black,1));
	    setBackgroundColor(classColor);
	    setOpaque(true);
		
	    add(name);	
	    add(attributeFigure);
	    add(methodFigure);
	  }
	  
	  public UMLClassFigure(String name, IFigure f1, IFigure f2) {
//		  ToolbarLayout layout = new ToolbarLayout(true);
		  FlowLayout layout = new FlowLayout(true);
		  setLayoutManager(layout);
		  add(new Label(name));
		  setOpaque(true);
	      setBorder(new LineBorder(ColorConstants.black,1));
		  
		  add(f1);
		  add(f2);
	  }
	  
	  public CompartmentFigure getAttributesCompartment() {
	    return attributeFigure;
	  }
	  public CompartmentFigure getMethodsCompartment() {
	    return methodFigure;
	  }
}
