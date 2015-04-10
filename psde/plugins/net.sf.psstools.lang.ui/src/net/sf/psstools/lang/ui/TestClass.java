package net.sf.psstools.lang.ui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TestClass {

	public static void main(String args[]){
		Display d = new Display();
		final Shell shell = new Shell(d);
		shell.setSize(400, 400);
		shell.setText("UMLClassFigure Test");
		LightweightSystem lws = new LightweightSystem(shell);
		Figure contents = new Figure();
//		DelegatingLayout contentsLayout = new DelegatingLayout();
		FlowLayout contentsLayout = new FlowLayout(false);
//		XYLayout contentsLayout = new XYLayout();
		LayoutManager m;
		contents.setLayoutManager(contentsLayout);

		Font classFont = new Font(null, "Arial", 12, SWT.BOLD);
//		Label classLabel1 = new Label("Table", new Image(d, 
//				UMLClassFigureTest.class.getResourceAsStream("class_obj.gif")));
		Label classLabel1 = new Label("Table");
		classLabel1.setFont(classFont);

//		Label classLabel2 = new Label("Column", new Image(d, 
//				UMLClassFigureTest.class.getResourceAsStream("class_obj.gif")));
		Label classLabel2 = new Label("Column");
		classLabel2.setFont(classFont);

		final UMLClassFigure classFigure = new UMLClassFigure(classLabel1);
		final UMLClassFigure classFigure2 = new UMLClassFigure(classLabel2);
		CompartmentFigure f = new CompartmentFigure();
//		LabeledContainer f = new LabeledContainer();
//		f.setLabel("Compartment");
		f.setLayoutManager(new ToolbarLayout(false));
		Label l = new Label("Compartment");
//		f.add(new Label("Compartment"), );
		f.add(l);
		CompartmentFigure f2 = new CompartmentFigure();
		f.add(f2);

		f2.setLayoutManager(new GridLayout(2, true));
		final IFigure classFigure3_1 = buildFigure1();
		final IFigure classFigure3_2 = buildFigure2();
		f2.add(classFigure3_1);
		f2.add(classFigure3_2);
		f2.setConstraint(classFigure3_1, new GridData(SWT.FILL, SWT.CENTER,  true,  true));
		f2.setConstraint(classFigure3_2, new GridData(SWT.FILL, SWT.CENTER,  true,  true));
	    f.setBorder(new LineBorder(ColorConstants.black,1));
		

//		Label attribute1 = new Label("columns: Column[]", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("field_private_obj.gif")));
//		Label attribute2 = new Label("rows: Row[]", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("field_private_obj.gif")));
//		Label attribute3 = new Label("columnID: int", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("field_private_obj.gif")));
//		Label attribute4 = new Label("items: List", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("field_private_obj.gif")));
		Label attribute1 = new Label("columns: Column[]");
		Label attribute2 = new Label("rows: Row[]");
		Label attribute3 = new Label("columnID: int");
		Label attribute4 = new Label("items: List");

		classFigure.getAttributesCompartment().add(attribute1);
		classFigure.getAttributesCompartment().add(attribute2);
		classFigure2.getAttributesCompartment().add(attribute3);
		classFigure2.getAttributesCompartment().add(attribute4);

//		Label method1 = new Label("getColumns(): Column[]", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
//		Label method2 = new Label("getRows(): Row[]", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
//		Label method3 = new Label("getColumnID(): int", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
//		Label method4 = new Label("getItems(): List", new Image(d, 
//				UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
		Label method4 = new Label("getItems(): List");
		Label method3 = new Label("getColumnID(): int");
		Label method2 = new Label("getRows(): Row[]");
		Label method1 = new Label("getColumns(): Column[]");

		classFigure.getMethodsCompartment().add(method1);
		classFigure.getMethodsCompartment().add(method2);
		classFigure2.getMethodsCompartment().add(method3);
		classFigure2.getMethodsCompartment().add(method4);

//		contentsLayout.setConstraint(classFigure, new Rectangle(10,10,-1,-1));
//		contentsLayout.setConstraint(classFigure2, new Rectangle(200, 200, -1, -1));
		contentsLayout.setConstraint(classFigure, new RelativeLocator(classFigure2, PositionConstants.EAST_WEST));
		contentsLayout.setConstraint(classFigure2, new RelativeLocator(classFigure, PositionConstants.EAST_WEST));
		contentsLayout.setConstraint(f, new RelativeLocator(classFigure2, PositionConstants.EAST_WEST));
//
//		/* Creating the connection */
//		PolylineConnection c = new PolylineConnection();
//		ChopboxAnchor sourceAnchor = new ChopboxAnchor(classFigure);
//		ChopboxAnchor targetAnchor = new ChopboxAnchor(classFigure2);
//		c.setSourceAnchor(sourceAnchor);
//		c.setTargetAnchor(targetAnchor);
//
//		/* Creating the decoration */
//		PolygonDecoration decoration = new PolygonDecoration();
//		PointList decorationPointList = new PointList();
//		decorationPointList.addPoint(0,0);
//		decorationPointList.addPoint(-2,2);
//		decorationPointList.addPoint(-4,0);
//		decorationPointList.addPoint(-2,-2);
//		decoration.setTemplate(decorationPointList);
//		c.setSourceDecoration(decoration);
//
//		/* Adding labels to the connection */
//		ConnectionEndpointLocator targetEndpointLocator = 
//				new ConnectionEndpointLocator(c, true);
//		targetEndpointLocator.setVDistance(15);
//		Label targetMultiplicityLabel = new Label("1..*");
//		c.add(targetMultiplicityLabel, targetEndpointLocator);
//
//		ConnectionEndpointLocator sourceEndpointLocator = 
//				new ConnectionEndpointLocator(c, false);
//		sourceEndpointLocator.setVDistance(15);
//		Label sourceMultiplicityLabel = new Label("1");
//		c.add(sourceMultiplicityLabel, sourceEndpointLocator);
//
//		ConnectionEndpointLocator relationshipLocator = 
//				new ConnectionEndpointLocator(c,true);
//		relationshipLocator.setUDistance(10);
//		relationshipLocator.setVDistance(-20);
//		Label relationshipLabel = new Label("contains");
//		c.add(relationshipLabel,relationshipLocator);
//
		contents.add(classFigure);
		contents.add(classFigure2);
		contents.add(f);
//		contents.add(c);

		lws.setContents(contents);
		shell.open();
		while (!shell.isDisposed())
			while (!d.readAndDispatch())
				d.sleep();
	}
	
	private static IFigure buildFigure1() {
		Font classFont = new Font(null, "Arial", 12, SWT.BOLD);
		Label classLabel1 = new Label("Table");
		UMLClassFigure classFigure = new UMLClassFigure(classLabel1);
		classLabel1.setFont(classFont);
		
		Label attribute1 = new Label("columns: Column[]");
		Label attribute2 = new Label("rows: Row[]");

		classFigure.getAttributesCompartment().add(attribute1);
		classFigure.getAttributesCompartment().add(attribute2);
		
		Label method2 = new Label("getRows(): Row[]");
		Label method1 = new Label("getColumns(): Column[]");

		classFigure.getMethodsCompartment().add(method1);
		classFigure.getMethodsCompartment().add(method2);
	
		return classFigure;
	}
	
	private static IFigure buildFigure2() {
		Font classFont = new Font(null, "Arial", 12, SWT.BOLD);
		Label classLabel2 = new Label("Column");
		classLabel2.setFont(classFont);
		UMLClassFigure classFigure2 = new UMLClassFigure(classLabel2);
		
		Label attribute3 = new Label("columnID: int");
		Label attribute4 = new Label("items: List");
		
		classFigure2.getAttributesCompartment().add(attribute3);
		classFigure2.getAttributesCompartment().add(attribute4);
		
		Label method4 = new Label("getItems(): List");
		Label method3 = new Label("getColumnID(): int");
		classFigure2.getMethodsCompartment().add(method3);
		classFigure2.getMethodsCompartment().add(method4);
	
		return classFigure2;
	}
}
