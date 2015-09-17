/**
 */
package demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demo.Calendar#getDescription <em>Description</em>}</li>
 *   <li>{@link demo.Calendar#getMeetings <em>Meetings</em>}</li>
 *   <li>{@link demo.Calendar#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see demo.DemoPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see demo.DemoPackage#getCalendar_Description()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.jug.zgora.pl/demo!Calendar!description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link demo.Calendar#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Meetings</b></em>' containment reference list.
	 * The list contents are of type {@link demo.Meeting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meetings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meetings</em>' containment reference list.
	 * @see demo.DemoPackage#getCalendar_Meetings()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.jug.zgora.pl/demo!Calendar!meetings'"
	 * @generated
	 */
	EList<Meeting> getMeetings();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link demo.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see demo.DemoPackage#getCalendar_Members()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.jug.zgora.pl/demo!Calendar!members'"
	 * @generated
	 */
	EList<Member> getMembers();

} // Calendar
