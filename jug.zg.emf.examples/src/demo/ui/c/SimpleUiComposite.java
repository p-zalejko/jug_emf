package demo.ui.c;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import demo.Address;
import demo.DemoFactory;
import demo.Member;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.ENamedElement;

import demo.DemoPackage.Literals;

public class SimpleUiComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private Member member;
	private Address address;

	private Text memberNameText;
	private Text addressText;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SimpleUiComposite(Composite parent, int style) {
		super(parent, style);

		initModel();

		setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpMember = new Group(this, SWT.NONE);
		grpMember.setText("Member");
		GridLayout gl_grpMember = new GridLayout(2, false);
		grpMember.setLayout(gl_grpMember);

		Label memberNameLabel = new Label(grpMember, SWT.NONE);
		memberNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		memberNameLabel.setText("Name:");

		memberNameText = new Text(grpMember, SWT.BORDER);
		memberNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label addressLabel = new Label(grpMember, SWT.NONE);
		addressLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		addressLabel.setText("E-mail:");

		addressText = new Text(grpMember, SWT.BORDER);
		addressText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpMember, SWT.NONE);

		Button saveButton = new Button(grpMember, SWT.NONE);
		saveButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		saveButton.setText("Save");
		new Label(grpMember, SWT.NONE);
		
		Button loadDataButton = new Button(grpMember, SWT.NONE);
		loadDataButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		loadDataButton.setText("Load example data");

		saveButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.printf("Member: %s\n", member.getName());
				System.out.printf("Address: %s\n", address.getEmail());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		
		loadDataButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				member.setName("foo");
				address.setEmail("foo@bar.pl");
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		m_bindingContext = initDataBindings();
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextMemberNameTextObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(memberNameText);
		IObservableValue memberNameObserveValue = EMFObservables.observeValue(member, Literals.MEMBER__NAME);
	
		UpdateValueStrategy targetToModel =null;
		UpdateValueStrategy modelToTarget =null;
		bindingContext.bindValue(observeTextMemberNameTextObserveWidget, memberNameObserveValue, targetToModel, modelToTarget);
		//
		IObservableValue observeTextAddressTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(addressText);
		IObservableValue addressEmailObserveValue = EMFObservables.observeValue(address, Literals.ADDRESS__EMAIL);
		bindingContext.bindValue(observeTextAddressTextObserveWidget, addressEmailObserveValue, null, null);
		//
		return bindingContext;
	}

	private void initModel() {
		member = DemoFactory.eINSTANCE.createMember();
		address = DemoFactory.eINSTANCE.createAddress();
		member.setAddress(address);
		
		ExampleAdapter adapter = new ExampleAdapter();
		member.eAdapters().add(adapter);
		address.eAdapters().add(adapter);
	}
}

class ExampleAdapter extends AdapterImpl {

	@Override
	public void notifyChanged(Notification msg) {
		if (msg.getEventType() == Notification.SET) {
			ENamedElement element = (ENamedElement) msg.getFeature();
			System.out.printf("Set a new value for the '%s' attribute: %s\n", element.getName(), msg.getNewStringValue());
		}
	}
}
