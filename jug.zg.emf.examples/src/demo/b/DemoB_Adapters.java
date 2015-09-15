package demo.b;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import demo.AbstractDemo;
import demo.Address;
import demo.DemoPackage;

public class DemoB_Adapters extends AbstractDemo {

	public static void main(String[] args) {
		new DemoB_Adapters().demo();
	}

	private EditingDomain domain;
	
	public DemoB_Adapters() {
		domain = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(), new BasicCommandStack());
	}
	
	@Override
	public void demo() {
		Address address = createAddress("foo@bar.pl");
		address.eAdapters().add(new ExampleAdapter());

		address.setEmail("foo");
		address.setEmail(null);
		
		Command setEmailCommand = SetCommand.create(domain, address, DemoPackage.Literals.ADDRESS__EMAIL, "example@address.pl");
		domain.getCommandStack().execute(setEmailCommand);
	}
}

class ExampleAdapter extends AdapterImpl {
	
	@Override
	public void notifyChanged(Notification msg) {
		// SET,UNSET, ADD, REMOVE etc.
		int eventType = msg.getEventType();
		Object feature = msg.getFeature();
		Object newValue = msg.getNewValue();
		// Object oldValue = msg.getOldValue();

		if (feature instanceof ENamedElement) {
			System.out.printf("Edited '%s'.\n", ((ENamedElement) feature).getName());
		} else {
			System.out.println("Edited " + feature);
		}
		
		if (eventType == Notification.SET) {
			System.out.println("Set a new value: " + newValue);
		}
		
		System.out.println();
	}
}
