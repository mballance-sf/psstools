package net.sf.psstools.lang.elaborator;

public class GraphInterfacePort {
	private String				fName;
	private String				fTypename;
	private boolean				fIsExport;
	
	public GraphInterfacePort(String name, String typename, boolean is_export) {
		fName = name;
		fTypename = typename;
		fIsExport = is_export;
	}

}
