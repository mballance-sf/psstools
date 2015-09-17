package net.sf.psstools.lang.docbuilder;

public interface IDocRenderer {

	// Ensure a whitespace character exists
	void insertWS();

	// Insert a keyword-treated string
	void keyword(String kw);
	
	// Append general text
	void append(String text);
	
	// Header
	void header(int level, String text);
	
	int length();
}
