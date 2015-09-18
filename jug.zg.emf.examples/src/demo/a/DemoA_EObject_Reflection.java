package demo.a;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import demo.AbstractDemo;
import demo.Address;
import demo.DemoPackage;
import demo.Member;

public class DemoA_EObject_Reflection extends AbstractDemo {

	public static void main(String[] args) {
		new DemoA_EObject_Reflection().demo();
	}

	@Override
	public void demo() {
		Member member = createMember("Pawel");
		Address address = createAddress("foo@bar.pl");
		
		printEclass(member);
		
		addAddressToMember(address, member);
		System.out.println(member.getAddress());
	}
	
	private void printEclass(EObject object){
		System.out.println("Class name: " +object.eClass().getInstanceTypeName());
		EList<EAttribute> attributes = object.eClass().getEAllAttributes();
		
		System.out.println("Attributes: ");
		for(EAttribute attribute: attributes){
			String name = attribute.getName();
			String type = attribute.getEType().getInstanceTypeName();
			System.out.printf("Name: %s, Type: %s\n", name,type);
		}
		System.out.println();
	}
	
	
	@Override
	public void addAddressToMember(Address address, Member member) {
		// super.addAddressToMember(address, member);
		member.eSet(DemoPackage.Literals.MEMBER__ADDRESS, address);
		System.out.println("Added an address via 'eSet' method.");
	}
 

}
