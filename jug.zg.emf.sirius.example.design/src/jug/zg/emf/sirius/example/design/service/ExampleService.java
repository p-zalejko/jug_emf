package jug.zg.emf.sirius.example.design.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import demo.Calendar;
import demo.Meeting;
import demo.Member;

public class ExampleService {

	public boolean isMeeting(EObject object) {
		return object instanceof Meeting;
	}

	// see: demo.odesign > ... > Default > Section > Edge .. > Connection Start ...
	public boolean isMember(EObject object) {
		return object instanceof Member;
	}

	
	// see: demo.odesign > ... > Default > memberToMeeting > Target Finder Expression
	public List<EObject> isMeetingMember(EObject eObject) {
		if (eObject instanceof Member) {
			EObject eContainer = eObject.eContainer();
			if (eContainer instanceof Calendar) {
				EList<Meeting> meetings = ((Calendar) eContainer).getMeetings();
				Predicate<Meeting> predicate = m -> m.getMembers().contains((Member) eObject);
				return meetings.stream().filter(predicate).collect(Collectors.toList());
			}
		}

		return Arrays.asList(eObject);
	}
}
