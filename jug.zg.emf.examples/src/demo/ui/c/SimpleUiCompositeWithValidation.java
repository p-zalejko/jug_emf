package demo.ui.c;

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
		ExampleValidationAdapter adapter = new ExampleValidationAdapter();
		member.eAdapters().add(adapter);
		address.eAdapters().add(adapter);
	}

	private class ExampleValidationAdapter extends AdapterImpl {

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getEventType() == Notification.SET) {
				EObject notifier = (EObject) msg.getNotifier();
				Diagnostic validate = Diagnostician.INSTANCE.validate(notifier);
				if (validate.getSeverity() == Diagnostic.OK) {
					System.out.printf("The %s is valid.\n", notifier.toString());
				} else {
					for (Diagnostic diagnostic : validate.getChildren()) {
						System.out.println(diagnostic.getMessage());
					}
				}
			}
		}
	}

}
