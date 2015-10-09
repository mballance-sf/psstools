package net.sf.psstools.lang.ui.decorators;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Dispatch;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;

import net.sf.psstools.lang.pSS.extend_stmt;
import net.sf.psstools.lang.ui.PSSUiModule;

public class PSSDecorator implements ILightweightLabelDecorator {
	private List<ILabelProviderListener>		fListeners = 
			new ArrayList<ILabelProviderListener>();

	@Override
	public void addListener(ILabelProviderListener listener) { 
		fListeners.add(listener);
	}

	@Override
	public void dispose() { }

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) { 
		fListeners.remove(listener);
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
//		System.out.println("decorate: " + element);
//		if (element instanceof extend_stmt) {
//			System.out.println("decorate");
//			extend_stmt stmt = (extend_stmt)element;
//			ImageDescriptor d = PSSUiModule.getImageDescriptor("icons/indexed_6x6.gif");
//			System.out.println("Descriptor: " + d);
//			decoration.addOverlay(d);
//	
////			decoration.addOverlay(overlay, quadrant);
////			return PSSUiModule.getPlugin().getImageRegistry().
//		} else if (element instanceof IFile) {
//			ImageDescriptor d = PSSUiModule.getImageDescriptor("icons/indexed_6x6.gif");
//			System.out.println("Descriptor: " + d);
//			decoration.addOverlay(d);
//		}
	}

	private Runnable		fEventRunnable = new Runnable() {
		
		@Override
		public void run() {
			LabelProviderChangedEvent ev = new LabelProviderChangedEvent(PSSDecorator.this);
			for (ILabelProviderListener l : fListeners) {
				l.labelProviderChanged(ev);
			}
		}
	};

}
