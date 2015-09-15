/**
 */
package demo.impl;

import demo.Address;
import demo.DemoPackage;
import demo.DemoTables;
import demo.Member;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demo.impl.MemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link demo.impl.MemberImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends EObjectImpl implements Member {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.MEMBER__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.MEMBER__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.MEMBER__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.MEMBER__ADDRESS, newAddress, newAddress));
	}

 

	 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAddress(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv checkAddress:
		 *   let severity : Integer[1] = 'Member::checkAddress'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[?] = address <> null and address.email.size() > 0
		 *       in
		 *         'Member::checkAddress'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DemoTables.STR_Member_c_c_checkAddress));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DemoTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_ne;
		        try {
		            final /*@Nullable*/ /*@Thrown*/ Address address = this.getAddress();
		            final /*@Thrown*/ boolean ne = address != null;
		            CAUGHT_ne = ne;
		        }
		        catch (Exception e) {
		            CAUGHT_ne = ValueUtil.createInvalidValue(e);
		        }
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_gt;
		        try {
		            final /*@Nullable*/ /*@Thrown*/ Address address_0 = this.getAddress();
		            if (address_0 == null) {
		                throw new InvalidValueException("Null source for \'\'http://www.jug.zgora.pl/demo\'::Address::email\'");
		            }
		            final /*@Nullable*/ /*@Thrown*/ String email = address_0.getEmail();
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = ClassUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(email));
		            final /*@Thrown*/ boolean gt = ClassUtil.nonNullState(OclComparableGreaterThanOperation.INSTANCE.evaluate(evaluator, size, DemoTables.INT_0).booleanValue());
		            CAUGHT_gt = gt;
		        }
		        catch (Exception e) {
		            CAUGHT_gt = ValueUtil.createInvalidValue(e);
		        }
		        final /*@Nullable*/ /*@Thrown*/ Boolean status = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_gt);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, DemoTables.STR_Member_c_c_checkAddress, this, diagnostics, context, severity_0, CAUGHT_status, DemoTables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv checkName:
		 *   let severity : Integer[1] = 'Member::checkName'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[?] = self.name <> null and self.name.size() > 0
		 *       in
		 *         'Member::checkName'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DemoTables.STR_Member_c_c_checkName));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DemoTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_ne;
		        try {
		            final /*@Nullable*/ /*@Thrown*/ String name = this.getName();
		            final /*@Thrown*/ boolean ne = name != null;
		            CAUGHT_ne = ne;
		        }
		        catch (Exception e) {
		            CAUGHT_ne = ValueUtil.createInvalidValue(e);
		        }
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_gt;
		        try {
		            final /*@Nullable*/ /*@Thrown*/ String name_0 = this.getName();
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue size = ClassUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(name_0));
		            final /*@Thrown*/ boolean gt = ClassUtil.nonNullState(OclComparableGreaterThanOperation.INSTANCE.evaluate(evaluator, size, DemoTables.INT_0).booleanValue());
		            CAUGHT_gt = gt;
		        }
		        catch (Exception e) {
		            CAUGHT_gt = ValueUtil.createInvalidValue(e);
		        }
		        final /*@Nullable*/ /*@Thrown*/ Boolean status = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_gt);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, DemoTables.STR_Member_c_c_checkName, this, diagnostics, context, severity_0, CAUGHT_status, DemoTables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoPackage.MEMBER__ADDRESS:
				return basicSetAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoPackage.MEMBER__NAME:
				return getName();
			case DemoPackage.MEMBER__ADDRESS:
				return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DemoPackage.MEMBER__NAME:
				setName((String)newValue);
				return;
			case DemoPackage.MEMBER__ADDRESS:
				setAddress((Address)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DemoPackage.MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DemoPackage.MEMBER__ADDRESS:
				setAddress((Address)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DemoPackage.MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DemoPackage.MEMBER__ADDRESS:
				return address != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DemoPackage.MEMBER___CHECK_ADDRESS__DIAGNOSTICCHAIN_MAP_11:
				return checkAddress((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DemoPackage.MEMBER___CHECK_NAME__DIAGNOSTICCHAIN_MAP_11:
				return checkName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
