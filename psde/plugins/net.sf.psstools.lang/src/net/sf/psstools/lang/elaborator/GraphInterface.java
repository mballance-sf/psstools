package net.sf.psstools.lang.elaborator;

public class GraphInterface {
	private String							fName;
	private InterfaceDeclaration			fInterfaceDecl;
	private boolean							fIsExport;
	
	public GraphInterface(String name, InterfaceDeclaration decl, boolean is_export) {
		fName = name;
		fInterfaceDecl = decl;
		fIsExport = is_export;
	}
	
	public String getName() {
		return fName;
	}
	
	public InterfaceDeclaration getInterfaceDecl() {
		return fInterfaceDecl;
	}
	
	public String getInterfaceTypeName() {
		return (fInterfaceDecl != null)?fInterfaceDecl.getName():null;
	}
	
	public boolean isExport() {
		return fIsExport;
	}

}
