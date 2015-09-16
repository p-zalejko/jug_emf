/**
 */
package demo;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demo.Member#getName <em>Name</em>}</li>
 *   <li>{@link demo.Member#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see demo.DemoPackage#getMember()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkAddress checkName'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see demo.DemoPackage#getMember_Name()
	 * @model dataType="demo.Min2Chars"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.jug.zgora.pl/demo!Member!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demo.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see demo.DemoPackage#getMember_Address()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.jug.zgora.pl/demo!Member!address'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link demo.Member#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv checkAddress:\n *   let severity : Integer[1] = \'Member::checkAddress\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : Boolean[?] = address <> null and address.email.size() > 0\n *       in\n *         \'Member::checkAddress\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%demo.DemoTables%>.STR_Member_c_c_checkAddress));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%demo.DemoTables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_ne;\n        try {\n            final /*@Nullable\052/ /*@Thrown\052/ <%demo.Address%> address = this.getAddress();\n            final /*@Thrown\052/ boolean ne = address != null;\n            CAUGHT_ne = ne;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_ne = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n        }\n        /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_gt;\n        try {\n            final /*@Nullable\052/ /*@Thrown\052/ <%demo.Address%> address_0 = this.getAddress();\n            if (address_0 == null) {\n                throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://www.jug.zgora.pl/demo\\\'::Address::email\\\'\");\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.String%> email = address_0.getEmail();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(email));\n            final /*@Thrown\052/ boolean gt = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%>.INSTANCE.evaluate(evaluator, size, <%demo.DemoTables%>.INT_0).booleanValue());\n            CAUGHT_gt = gt;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_gt = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n        }\n        final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> status = <%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_gt);\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%demo.DemoTables%>.STR_Member_c_c_checkAddress, this, diagnostics, context, severity_0, CAUGHT_status, <%demo.DemoTables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean checkAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv checkName:\n *   let severity : Integer[1] = \'Member::checkName\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : Boolean[?] = self.name <> null and self.name.size() > 0\n *       in\n *         \'Member::checkName\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%demo.DemoTables%>.STR_Member_c_c_checkName));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%demo.DemoTables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_ne;\n        try {\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.String%> name = this.getName();\n            final /*@Thrown\052/ boolean ne = name != null;\n            CAUGHT_ne = ne;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_ne = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n        }\n        /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_gt;\n        try {\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.String%> name_0 = this.getName();\n            final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(name_0));\n            final /*@Thrown\052/ boolean gt = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%>.INSTANCE.evaluate(evaluator, size, <%demo.DemoTables%>.INT_0).booleanValue());\n            CAUGHT_gt = gt;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_gt = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n        }\n        final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> status = <%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_gt);\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%demo.DemoTables%>.STR_Member_c_c_checkName, this, diagnostics, context, severity_0, CAUGHT_status, <%demo.DemoTables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean checkName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Member
