package demo;

import demo.Address;
import demo.DemoFactory;
import demo.Meeting;
import demo.Member;

public abstract class AbstractDemo {

	public abstract void demo();

	public Calendar createCalendar( ) {
		return DemoFactory.eINSTANCE.createCalendar();
	}
	
	public Member createMember(String name) {
		Member member = DemoFactory.eINSTANCE.createMember();
		member.setName(name);
		return member;
	}

	public Meeting createMeeting(String name) {
		Meeting meeting = DemoFactory.eINSTANCE.createMeeting();
		meeting.setName(name);
		return meeting;
	}

	public Address createAddress(String email) {
		Address address = DemoFactory.eINSTANCE.createAddress();
		address.setEmail(email);
		return address;
	}

	public void addAddressToMember(Address address, Member member) {
		member.setAddress(address);
	}

	public void addToMeeting(Meeting meeting, Member member) {
		System.out.println("Before adding: " + meeting.howManyMembers());
		meeting.getMembers().add(member);
		System.out.println("After adding: " + meeting.howManyMembers());
	}
}
