package net.sf.psstools.lang.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import net.sf.psstools.lang.ui.contentassist.AbstractPSSProposalProvider;

public class PSSProposalProvider extends AbstractPSSProposalProvider {

	@Override
	public void complete_primary(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
//		System.out.println("complete_primary: " + model + " " + ruleCall);
		// TODO Auto-generated method stub
		super.complete_primary(model, ruleCall, context, acceptor);
	}
	
	
}
