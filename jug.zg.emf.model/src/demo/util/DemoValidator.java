/**
 */
package demo.util;

import demo.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see demo.DemoPackage
 * @generated
 */
public class DemoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DemoValidator INSTANCE = new DemoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "demo";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Address' of 'Member'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMBER__CHECK_ADDRESS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Name' of 'Member'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMBER__CHECK_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Address Set' of 'Address'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS__HAS_ADDRESS_SET = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DemoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DemoPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case DemoPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case DemoPackage.MEETING:
				return validateMeeting((Meeting)value, diagnostics, context);
			case DemoPackage.CALENDAR:
				return validateCalendar((Calendar)value, diagnostics, context);
			case DemoPackage.MIN2_CHARS:
				return validateMin2Chars((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(member, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_checkAddress(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_checkName(member, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkAddress constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_checkAddress(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return member.checkAddress(diagnostics, context);
	}

	/**
	 * Validates the checkName constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_checkName(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return member.checkName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(address, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddress_hasAddressSet(address, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasAddressSet constraint of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress_hasAddressSet(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return address.hasAddressSet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeeting(Meeting meeting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meeting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin2Chars(String min2Chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMin2Chars_MinLength(min2Chars, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Min2 Chars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin2Chars_MinLength(String min2Chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = min2Chars.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DemoPackage.Literals.MIN2_CHARS, min2Chars, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DemoValidator
