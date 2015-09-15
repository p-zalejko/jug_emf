package demo.a;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import demo.AbstractDemo;
import demo.Address;
import demo.Member;

public class DemoA_EObject_Content extends AbstractDemo {

	public static void main(String[] args) {
		new DemoA_EObject_Content().demo();
	}

	@Override
	public void demo() {
		Member member = createMember("Pawel");
		Address address = createAddress("foo@bar.pl");

		// before adding
		printEContents(member);
		printEContainer(address);
		
		addAddressToMember(address, member);
		
		// after adding
		printEContents(member);
		printEContainer(address);
	}
	
	private void printEContents(EObject object){
		System.out.printf("eContents of %s:\n", object.toString());

		EList<EObject> eContents = object.eContents();
		eContents.forEach(System.out::println);
		
		System.out.println();
	}
	
	private void printEContainer(EObject object){
		System.out.printf("eContainer of %s:\n", object.toString());
		
		System.out.println(object.eContainer()); // eContainer returns an EObject instance, or null.
		
		System.out.println();
	}

}
