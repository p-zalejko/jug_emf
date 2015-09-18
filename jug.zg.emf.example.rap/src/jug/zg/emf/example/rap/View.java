/**
 * Copyright (c) 2011-2014 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * EclipseSource Munich - initial API and implementation
 */
package jug.zg.emf.example.rap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.spi.EMFDeleteServiceImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.model.VViewFactory;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import demo.Address;
import demo.DemoFactory;
import demo.Member;

/**
 * Example View for displaying a Forms Editor for an EObject.
 */
public class View extends ViewPart {
	/**
	 * View ID.
	 */
	public static final String ID = "TestApp.view"; //$NON-NLS-1$

	private ECPSWTView render;

	private Member getDummyEObject() {
		final Address address = DemoFactory.eINSTANCE.createAddress();
		address.setEmail("foo@bar.pl");

		final Member member = DemoFactory.eINSTANCE.createMember();
		member.setName("abcdr");
		member.setAddress(address);
		return member;
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 *
	 * @param parent the {@link Composite} to render to
	 */
	@Override
	public void createPartControl(Composite parent) {

		final EObject dummyObject = getDummyEObject();

		try {
			parent.getShell().setMaximized(true);
			parent.setLayout(GridLayoutFactory.fillDefaults().equalWidth(true).numColumns(1).create());
			parent.setLayoutData(GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).grab(true, true)
				.create());
			parent.getParent().setLayout(GridLayoutFactory.fillDefaults().equalWidth(true).numColumns(1).create());
			parent.getParent().setLayoutData(
				GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).grab(true, true).create());

			final Composite content = new Composite(parent, SWT.NONE);
			content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
			content.setLayoutData(GridDataFactory.fillDefaults().create());

			final VView view = ViewProviderHelper.getView(dummyObject,
				VViewFactory.eINSTANCE.createViewModelLoadingProperties());
			final ViewModelContext viewModelContext = ViewModelContextFactory.INSTANCE.createViewModelContext(view,
				dummyObject, new DefaultReferenceService(), new EMFDeleteServiceImpl());
			render = ECPSWTViewRenderer.INSTANCE.render(content, viewModelContext);

			content.layout();

		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
		parent.layout();
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void dispose() {
		if (render != null) {
			render.dispose();
		}
	}
}