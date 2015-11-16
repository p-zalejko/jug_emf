package jug.zg.emf.e4.example.parts;

import javax.annotation.PostConstruct;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import demo.Address;
import demo.DemoFactory;
import demo.Member;

public class SamplePart {

	@PostConstruct
	public void createComposite(Composite parent) {
		final EObject example = createExampleObject();
		try {
			final Composite content = initComposite(parent);

			final ViewModelContext vmcMember = getViewModel(example);
			ECPSWTViewRenderer.INSTANCE.render(content, vmcMember);
			content.layout();
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
		parent.layout();
	}

	private Composite initComposite(Composite parent) {
		final Composite content = new Composite(parent, SWT.NONE);
		content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
 		content.setLayoutData(GridDataFactory.fillDefaults().create());
		return content;
	}

	private ViewModelContext getViewModel(final EObject obj) {
		VView view = ViewProviderHelper.getView(obj, null);
		return ViewModelContextFactory.INSTANCE.createViewModelContext(view, obj, new DefaultReferenceService());
	}

	private EObject createExampleObject() {
		Address address = DemoFactory.eINSTANCE.createAddress();
		address.setEmail("foo@bar.pl");

		Member member = DemoFactory.eINSTANCE.createMember();
		member.setName("abcdr");
		member.setAddress(address);
		return member;
	}
}