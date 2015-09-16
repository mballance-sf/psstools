package net.sf.psstools.lang.ui.editor;

import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;

public class PSSOutlinePage extends OutlinePage {

	@Override
	public void scheduleRefresh() {
		OutlineRefreshJob j = getRefreshJob();
		j.cancel();
		j.schedule(800);
	}
	
	

}
