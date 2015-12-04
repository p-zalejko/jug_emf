package jug.zg.emf.e4.example.parts;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.*;
import demo.Address;
import demo.DemoFactory;
import demo.Member;
import org.eclipse.e4.core.services.events.IEventBroker;

@Creatable
@Singleton
public class DataProvider {

	private ResourceSet rs;
	private Resource resource;
	private EditingDomain editingDomain;

	private EObject exampleObject;

	@PostConstruct
	public void init(IEventBroker broker) {
		initEmfResource();

		// create an example object
		exampleObject = createExampleObject(broker);
		// "bind" the object to a Resource and an EditingDomain.
		addToResource(exampleObject);
	}

	public EObject getExampleObject() {
		return exampleObject;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	private EObject createExampleObject(IEventBroker broker) {
		Address address = DemoFactory.eINSTANCE.createAddress();
		address.setEmail("foo@bar.pl");

		Member member = DemoFactory.eINSTANCE.createMember();
		member.setName("abcd");
		member.setAddress(address);

		addAdapters(broker, address, member);

		return member;
	}

	private void addAdapters(IEventBroker broker, EObject... objects) {
		for (EObject obj : objects) {
			obj.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					// refresh Eclipse UI after making a change on the model.
					broker.post(UIEvents.REQUEST_ENABLEMENT_UPDATE_TOPIC, null);
				}
			});
		}
	}

	private void initEmfResource() {
		// create a dummy ResourceSet and dummy Resource object.
		// A resource is a "place" from which the object comes from, for
		// instance if the object were loaded from a file then a resource would
		// point to that file. By saving changes on the Resource level all of
		// them would be persisted to the file.

		rs = new ResourceSetImpl();
		final AdapterFactory factory = new ComposedAdapterFactory(Registry.INSTANCE);
		final BasicCommandStack commandStack = new BasicCommandStack();
		editingDomain = new AdapterFactoryEditingDomain(factory, commandStack, rs);

		rs.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(editingDomain));
		resource = rs.createResource(URI.createURI("VIRTAUAL_URI"));
		// resource.save(options);
	}

	private void addToResource(EObject domainObject) {
		// get the root of the object(top level parent)
		// and add it to the resource.
		final EObject rootObject = EcoreUtil.getRootContainer(domainObject);
		resource.getContents().add(rootObject);
	}
}
