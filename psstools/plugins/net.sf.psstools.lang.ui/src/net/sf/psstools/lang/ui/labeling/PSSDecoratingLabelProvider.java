package net.sf.psstools.lang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;

import net.sf.psstools.lang.ui.PSSUiModule;

public class PSSDecoratingLabelProvider extends DecoratingLabelProvider {

	@Inject
	public PSSDecoratingLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(PSSUiModule.getInstance(PSSLabelProvider.class),
				PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator());
	}

}
