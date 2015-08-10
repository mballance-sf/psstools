package net.sf.psstools.lang.ui.views.graph;

import java.io.File;

import net.sf.psstools.lang.PssParseUtils;
import net.sf.psstools.lang.elaborator.DataTypeGraph;
import net.sf.psstools.lang.elaborator.ElabException;
import net.sf.psstools.lang.elaborator.GraphElabResult;
import net.sf.psstools.lang.elaborator.GraphElaborator;
import net.sf.psstools.lang.elaborator.GraphInstance;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResourceSet;

public class TestClass {

	public static void main(String args[]){
		Display d = new Display();
		String graph = null;

		XtextResourceSet rs = PssParseUtils.createXtextResourceSet();
		
		File current_dir = new File(System.getProperty("user.dir"));
//		for (File f : current_dir.listFiles()) {
//			if (f.isFile() && f.getName().endsWith(".pss")) {
//				System.out.println("Adding file: " + f.getAbsolutePath());
//				PssParseUtils.addFile(rs, f);
//			}
//		};
		for (int i=0; i<args.length; i++) {
			if (args[i].charAt(0) == '-') {
				if (args[i].equals("-root")) {
					i++;
					graph = args[i];
				}
			} else {
			File f = new File(args[i]);
			if (!f.isAbsolute()) {
				f = new File(current_dir, args[i]);
			}
			System.out.println("Adding file: " + f.getAbsolutePath());
			PssParseUtils.addFile(rs, f);
			}
		}
		
		EcoreUtil.resolveAll(rs);
		
		GraphElaborator elab = new GraphElaborator(rs.getAllContents());
		
		System.out.println("Elaborating graph " + graph);
		GraphElabResult result = null;
		
		try {
			result = elab.elaborate(graph);
		} catch (ElabException e) {
			e.printStackTrace();
		}
		
		DataTypeGraph inst = result.getGraph();
		GraphFigureFactory figure_factory = new GraphFigureFactory();
		IFigure fig = figure_factory.build(result);
		
		final Shell shell = new Shell(d);
		shell.setSize(400, 400);
		shell.setText("UMLClassFigure Test");
		LightweightSystem lws = new LightweightSystem(shell);
		
		final Figure contents = new Figure();
		GridLayout layout = new GridLayout();
		contents.setLayoutManager(layout);
		contents.add(fig);
		layout.setConstraint(fig, new GridData(SWT.FILL, SWT.FILL, true, true));

		lws.setContents(contents);
		
		contents.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {
				IFigure fig = contents.findFigureAt(me.x, me.y);
				
				System.out.println("fig=" + fig);
				
				if (fig != null) {
					fig.setVisible(!fig.isVisible());
				}
			}
			
		});
		
		shell.open();
		while (!shell.isDisposed()) {
			while (!d.readAndDispatch()) {
				d.sleep();
			}
		}
		
		return;
//		System.out.println("Elaborating graph " + graph);
//		GraphElabResult result = elab.elaborate(graph);
//		
//		
//		
//		Figure contents = new Figure();
//

	}
	
}
