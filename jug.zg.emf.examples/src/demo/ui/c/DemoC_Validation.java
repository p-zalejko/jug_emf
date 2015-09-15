package demo.ui.c;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import demo.ui.AbstractDemo;

public class DemoC_Validation extends AbstractDemo {

	public static void main(String[] args) {
		new DemoC_Validation().demo();
	}

	@Override
	public void demo() {
		// data bindng
		// validation(OCL, java)

		Display display = Display.getDefault();
		Realm.runWithDefault(DisplayRealm.getRealm(display), new Runnable() {
			public void run() {
				Display display = Display.getDefault();
				Shell shell = new Shell(display);
				shell.setLayout(new FillLayout());
				new SimpleUiCompositeWithValidation(shell, SWT.NONE);

				// shell.pack();
				shell.open();
				while (!shell.isDisposed()) {
					if (!display.readAndDispatch())
						display.sleep();
				}
				display.dispose();
			}
		});

	}

}
