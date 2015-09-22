package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;

public class GraphInstance extends DeclScope {

	private String								fName;
	private List<DataField>						fDataFields;
	private RuleProduction						fRootRule;
	private Map<String, InterfaceDeclaration>	fInterfaceMap;
	private List<GraphInterface>				fInterfaceList;
	private Map<String, DataTypeStruct>			fStructMap;
	
	public GraphInstance(String name) {
		fName = name;
		fDataFields = new ArrayList<DataField>();
		fInterfaceMap = new HashMap<String, InterfaceDeclaration>();
		fInterfaceList = new ArrayList<GraphInterface>();
		fStructMap = new HashMap<String, DataTypeStruct>();
	}
	
	public String getName() {
		return fName;
	}
	
//	public void addField(DataField field) {
//		fDataFields.add(field);
//	}
	
	@Override
	public void addVariable(DataField field) {
		fDataFields.add(field);
		super.addVariable(field);
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
	
	public DataTypeStruct findStructType(String name) {
		return fStructMap.get(name);
	}
	
	public void addStructType(DataTypeStruct struct) {
		fStructMap.put(struct.getName(), struct);
	}
	
	public Collection<DataTypeStruct> getStructTypes() {
		return fStructMap.values();
	}
	
	public void addInterface(GraphInterface ifc) {
		fInterfaceList.add(ifc);
	}
	
	public List<GraphInterface> getInterfaces() {
		return fInterfaceList;
	}
}
