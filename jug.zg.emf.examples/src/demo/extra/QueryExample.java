package demo.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferenceValueCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferencerCondition;
import org.eclipse.emf.query.conditions.strings.StringValue;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import demo.AbstractDemo;
import demo.Calendar;
import demo.DemoPackage;
import demo.Meeting;
import demo.Member;

public class QueryExample extends AbstractDemo {

	private static final int COUNT = 25;

	public static void main(String[] args) {
		new QueryExample().demo();
	}

	@Override
	public void demo() {
		Calendar calendar = createExampleCalendar();
		String name = calendar.getMembers().get(0).getName();

		// example 1
		printResult(findMeetingsByMember(calendar, name));

		// example 2
		List<EObject> list = new ArrayList<EObject>();
		list.addAll(calendar.getMeetings());
		list.addAll(calendar.getMembers());
		printResult(findMeetingsByMember(list, name));

		// example 3
		List<EObject> list2 = new ArrayList<EObject>();
		list2.add(EcoreUtil.copy(calendar));
		list2.add(EcoreUtil.copy(calendar));
		printResult(findMeetingsByMember(list2, name));

		// example 4
		Member member = calendar.getMembers().get(0);
		printResult(findAllReferencesTo(calendar, member));
	}

	protected void printResult(Collection<EObject> collection) {
		if (collection.isEmpty()) {
			System.out.println("Not found.");
		} else {
			collection.forEach(obj -> System.out.println(obj));
			System.out.println("Count: " + collection.size());
		}
		System.out.println();
	}

	protected Collection<EObject> findMeetingsByMember(Collection<? extends EObject> eObjects, String name) {
		return findMeetingsByMember(new FROM(eObjects), name);
	}

	protected Collection<EObject> findMeetingsByMember(EObject object, String name) {
		return findMeetingsByMember(new FROM(object), name);
	}

	protected Collection<EObject> findMeetingsByMember(FROM from, String name) {
		DemoPackage einstance = DemoPackage.eINSTANCE;

		// 1. Object type: Meeting (EClass)
		EObjectCondition typeCondition = new EObjectTypeRelationCondition(einstance.getMeeting());

		// 2. Where: meeting.getMembers()
		EReference referenceToBeTested = einstance.getMeeting_Members();

		// 3. What value: member.getName().equals(name)
		EAttribute nameAttribute = einstance.getMember_Name();
		StringValue expectedValue = new StringValue(name);
		EObjectCondition valueCondition = new EObjectAttributeValueCondition(nameAttribute, expectedValue);

		// @formatter:off
		EObjectCondition condition = new EObjectReferenceValueCondition(
				typeCondition,
				referenceToBeTested,
				valueCondition);
		// @formatter:on

		SELECT statement = new SELECT(from, new WHERE(condition));
		// find all meeting objects
		// SELECT statement = new SELECT(from, new WHERE(typeCondition));
		return statement.execute();
	}

	protected Collection<EObject> findAllReferencesTo(Calendar calendar, Member member) {
		EObjectCondition condition = new EObjectReferencerCondition(member);

		SELECT statement = new SELECT(new FROM(calendar), new WHERE(condition));
		return statement.execute();
	}

	protected Calendar createExampleCalendar() {
		// create a calendar, members and meetings
		Calendar calendar = createCalendar();
		EList<Member> members = calendar.getMembers();
		EList<Meeting> meetings = calendar.getMeetings();

		IntStream.range(0, COUNT).mapToObj(idx -> createMember("member " + idx)).forEach(members::add);
		IntStream.range(0, COUNT).mapToObj(idx -> createMeeting("meeting " + idx)).forEach(meetings::add);

		// Get random meetings
		int meetingA_idx = getRandomIndex(0, COUNT, Collections.emptyList());
		int meetingB_idx = getRandomIndex(0, COUNT, Collections.singletonList(meetingA_idx));
		int meetingC_idx = getRandomIndex(0, COUNT, Arrays.asList(meetingA_idx, meetingB_idx));

		Meeting meetingA = meetings.get(meetingA_idx);
		Meeting meetingB = meetings.get(meetingB_idx);
		Meeting meetingC = meetings.get(meetingC_idx);

		// add members to meetings
		IntStream.range(0, 5).forEach(idx -> {
			meetingA.getMembers().add(members.get(idx));
			meetingB.getMembers().add(members.get(idx));
		});

		IntStream.range(5, COUNT).forEach(idx -> {
			meetingC.getMembers().add(members.get(idx));
		});

		System.out.println("Meeting A:" + meetingA.getName());
		System.out.println("Meeting B:" + meetingB.getName());
		System.out.println("Meeting C:" + meetingC.getName());
		System.out.println("");

		return calendar;
	}

	protected int getRandomIndex(int min, int max, List<Integer> exclude) {
		boolean notReady = true;
		int nextInt = -1;
		do {
			nextInt = ThreadLocalRandom.current().nextInt(min, max);
			notReady = exclude.contains(nextInt);
		} while (notReady);

		return nextInt;
	}
}
