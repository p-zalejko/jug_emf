package demo.b;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import demo.AbstractDemo;
import demo.Address;
import demo.DemoPackage;
import demo.Member;

public class DemoB_CompoundCommand extends AbstractDemo{

	public static void main(String[] args) {
		new DemoB_CompoundCommand().demo();
	}

	private EditingDomain domain;

	public DemoB_CompoundCommand() {
		domain = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(), new BasicCommandStack());
	}
	
	@Override
	public void demo() {
		Address address = createAddress("foo@bar.pl");
		Member member = createMember("Pawel");

		// create set commands
		Command setEmailCommand = SetCommand.create(domain, address, DemoPackage.Literals.ADDRESS__EMAIL, "example@address.pl");
		Command addAddressToMemberCommand = SetCommand.create(domain, member, DemoPackage.Literals.MEMBER__ADDRESS, address);
		
		CompoundCommand command = new CompoundCommand();
		command.append(setEmailCommand);
		command.append(addAddressToMemberCommand);
		
		printStatus(address, member);
		
		// execute the CompoundCommand!
		domain.getCommandStack().execute(command);
		
		printStatus(address, member);
		
		// undo changes
		domain.getCommandStack().undo();
		
		printStatus(address, member);
	}
	
	private void printStatus(Address address,Member member ){
		System.out.println(address.getEmail());
		System.out.println(member.getAddress());
		System.out.println();
	}


}
