package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;

public class GraphInstance {

	private String								fName;
	private List<DataField>						fDataFields;
	private RuleProduction						fRootRule;
	private Map<String, InterfaceDeclaration>	fInterfaceMap;
	private List<GraphInterface>				fInterfaceList;

	public GraphInstance(String name) {
		fName = name;
		fDataFields = new ArrayList<DataField>();
		fInterfaceMap = new HashMap<String, InterfaceDeclaration>();
		fInterfaceList = new ArrayList<GraphInterface>();
	}
	
	public String getName() {
		return fName;
	}
	
	public void addField(DataField field) {
		fDataFields.add(field);
	}
	
	public List<DataField> getFields() {
		return fDataFields;
	}
	
	public RuleProduction getRootRule() {
		return fRootRule;
	}
	
	public void setRootRule(RuleProduction r) {
		fRootRule = r;
	}
	
	public void addInterfaceDecl(InterfaceDeclaration decl) {
		fInterfaceMap.remove(decl.getName());
		fInterfaceMap.put(decl.getName(), decl);
	}
	
	public InterfaceDeclaration findInterfaceDecl(String name) {
		return fInterfaceMap.get(name);
	}
	
	public Collection<InterfaceDeclaration> getInterfaceDecls() {
		return fInterfaceMap.values();
	}
	
	public void addInterface(GraphInterface ifc) {
		fInterfaceList.add(ifc);
	}
	
	public List<GraphInterface> getInterfaces() {
		return fInterfaceList;
	}
}
