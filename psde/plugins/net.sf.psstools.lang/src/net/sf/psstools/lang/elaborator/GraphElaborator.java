package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_or_struct_declaration;
import net.sf.psstools.lang.pSS.portable_stimulus_description;
import net.sf.psstools.lang.pSS.struct_declaration;

public class GraphElaborator {
	private List<Model>			fModelList;
	
	public GraphElaborator() {
		fModelList = new ArrayList<Model>();
	}
	
	public void addModel(Model m) {
		fModelList.add(m);
	}
	
	public GraphInstance elaborate(String name) throws ElabException {
		graph_or_struct_declaration gs = find_graph_or_struct(name);
		
		if (!(gs instanceof graph_declaration)) {
			error("Not instanceof graph");
		}
	
		graph_declaration g = (graph_declaration)gs;
		
		System.out.println("gs=" + gs);
		return null;
	}
	
	private graph_or_struct_declaration find_graph_or_struct(String name) {
		for (Model m : fModelList) {
			for (portable_stimulus_description d : m.getRoot()) {
				if (d instanceof graph_declaration) {
					if (((graph_declaration)d).getName().equals(name)) {
						return (graph_declaration)d;
					}
				} else if (d instanceof struct_declaration) {
					if (((struct_declaration)d).getName().equals(name)) {
						return (struct_declaration)d;
					}
				}
			}
		}
		
		return null;
	}
	
	private void error(String msg) throws ElabException {
		throw new ElabException();
	}

}
