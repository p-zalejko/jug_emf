package demo.c;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import demo.AbstractDemo;
import demo.c.swt.SimpleUiComposite;

public class DemoC_DataBinding extends AbstractDemo {

	public static void main(String[] args) {
		new DemoC_DataBinding().demo();
	}

	@Override
	public void demo() {
		Display display = Display.getDefault();
		Realm.runWithDefault(DisplayRealm.getRealm(display), new Runnable() {
			public void run() {
				Display display = Display.getDefault();
				Shell shell = new Shell(display);
				shell.setSize(600, 300);
				shell.setLayout(new FillLayout());
				new SimpleUiComposite(shell, SWT.NONE);

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
