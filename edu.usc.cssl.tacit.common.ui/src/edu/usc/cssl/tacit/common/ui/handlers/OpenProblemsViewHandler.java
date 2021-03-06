package edu.usc.cssl.tacit.common.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenProblemsViewHandler extends AbstractHandler {

	private static final String ID = "org.eclipse.ui.views.ProblemView";;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			HandlerUtil.getActiveWorkbenchWindowChecked(event).
			getActivePage().showView(ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}
}
