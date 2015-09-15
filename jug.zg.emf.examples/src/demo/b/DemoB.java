package demo.b;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import demo.AbstractDemo;
import demo.Address;
import demo.DemoPackage;
import demo.Member;

public class DemoB extends AbstractDemo {

	public static void main(String[] args) {
		new DemoB().demo();
	}

	private EditingDomain domain;

	public DemoB() {
		domain = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(), new BasicCommandStack());
	}

	@Override
	public void demo() {
		Address address = createAddress("foo@bar.pl");
		Member member = createMember("Pawel");

		System.out.println(member.getAddress());
		addAddressToMember(address, member);
		System.out.println(member.getAddress());
		
		callUndoRedo(member);
	}

	@Override
	public void addAddressToMember(Address address, Member member) {
		// AddCommand, MoveCommand, ReplaceCommand, RemoveCommand, DeleteCommand etc.
		Command command = SetCommand.create(domain, member, DemoPackage.Literals.MEMBER__ADDRESS, address);
		domain.getCommandStack().execute(command);
	}
	
	private void callUndoRedo(Member member){
		CommandStack commandStack = domain.getCommandStack();
		commandStack.undo();
		System.out.println(member.getAddress());
		commandStack.redo();
		System.out.println(member.getAddress());
		
		System.out.println("Can undo: " + commandStack.canUndo());
		System.out.println("Can redo: " + commandStack.canRedo());
		commandStack.flush();
		
		System.out.println();
		System.out.println("Can undo: " + commandStack.canUndo());
		System.out.println("Can redo: " + commandStack.canRedo());
	}
}
