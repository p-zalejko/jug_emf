/*******************************************************************************
 * Copyright (c) 2010 - 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
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
		final Member member = createMember();
		try {
			final Composite content = initComposite(parent);

			final ViewModelContext vmcMember = getViewModel(member);
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

	private Member createMember() {
		Address address = DemoFactory.eINSTANCE.createAddress();
		address.setEmail("foo@bar.pl");

		Member member = DemoFactory.eINSTANCE.createMember();
		member.setName("abcdr");
		member.setAddress(address);
		return member;
	}
}