
package jug.zg.emf.e4.example.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.EditingDomain;

import jug.zg.emf.e4.example.parts.DataProvider;

public class UndoHandler {

	private CommandStack commandStack;

	@Inject
	public UndoHandler(DataProvider dataProvider) {
		EditingDomain editingDomain = dataProvider.getEditingDomain();
		commandStack = editingDomain.getCommandStack();
	}

	@Execute
	public void execute() {
		commandStack.undo();
	}

	@CanExecute
	public boolean canExecute() {
		return commandStack.canUndo();
	}

}