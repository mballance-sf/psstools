package net.sf.psstools.lang.ui.editor

import org.eclipse.jface.text.source.projection.ProjectionViewer
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider

class PSSFoldingStructureProvider extends DefaultFoldingStructureProvider {
	
	override void initialize() {
		// Disable folding by overriding the initialize method
	}
	
	override void install(XtextEditor editor, ProjectionViewer vieiwer) {
		// Disable
	}
	
	override void uninstall() {
		// Disable
	}
	
}