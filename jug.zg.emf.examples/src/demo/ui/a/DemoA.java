package demo.ui.a;

import demo.Address;
import demo.Meeting;
import demo.Member;
import demo.ui.AbstractDemo;

public class DemoA extends AbstractDemo {

	public static void main(String[] args) {
		new DemoA().demo();
	}

	@Override
	public void demo() {
		Meeting meeting = createMeeting("JUG");
		Member member = createMember("Pawel");
		Address address = createAddress("foo@bar.pl");

		addAddressToMember(address, member);
		addToMeeting(meeting, member);
	}

}
