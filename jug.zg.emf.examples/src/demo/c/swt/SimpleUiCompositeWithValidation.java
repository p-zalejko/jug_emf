package demo.c.swt;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

public class SimpleUiCompositeWithValidation extends SimpleUiComposite {

	public SimpleUiCompositeWithValidation(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void addAddapters() {
		ExampleValidationAdapter adapter = new ExampleValidationAdapter(member);
		// added to two objects in order to trigger validation
		member.eAdapters().add(adapter);
		address.eAdapters().add(adapter);
	}

	private class ExampleValidationAdapter extends AdapterImpl {

		private EObject toValidate;

		public ExampleValidationAdapter(EObject toValidate) {
			this.toValidate = toValidate;
		}

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getEventType() == Notification.SET) {
				Diagnostic validate = Diagnostician.INSTANCE.validate(toValidate);
				if (validate.getSeverity() == Diagnostic.OK) {
					System.out.printf("The %s is valid.\n", toValidate.toString());
				} else {
					for (Diagnostic diagnostic : validate.getChildren()) {
						System.out.println(diagnostic.getMessage());
					}
				}
			}
		}
	}

}
