/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /jug.zg.emf.model/model/demo.ecore
 * using:
 *   /jug.zg.emf.model/model/demo.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package demo;

import demo.DemoPackage;
import demo.DemoTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DemoTables provides the dispatch tables for the demo for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class DemoTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DemoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_jug_zgora_pl_s_demo = IdManager.getNsURIPackageId("http://www.jug.zgora.pl/demo", null, DemoPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Address = DemoTables.PACKid_http_c_s_s_www_jug_zgora_pl_s_demo.getClassId("Address", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Calendar = DemoTables.PACKid_http_c_s_s_www_jug_zgora_pl_s_demo.getClassId("Calendar", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Meeting = DemoTables.PACKid_http_c_s_s_www_jug_zgora_pl_s_demo.getClassId("Meeting", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Member = DemoTables.PACKid_http_c_s_s_www_jug_zgora_pl_s_demo.getClassId("Member", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_EInt = DemoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_Min2Chars = DemoTables.PACKid_http_c_s_s_www_jug_zgora_pl_s_demo.getDataTypeId("Min2Chars", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_Member_c_c_checkAddress = "Member::checkAddress";
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_Member_c_c_checkName = "Member::checkName";
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Meeting = TypeId.BAG.getSpecializedId(DemoTables.CLSSid_Meeting);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Meeting = TypeId.ORDERED_SET.getSpecializedId(DemoTables.CLSSid_Meeting);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Member = TypeId.ORDERED_SET.getSpecializedId(DemoTables.CLSSid_Member);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DemoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Address = new EcoreExecutorType(DemoPackage.Literals.ADDRESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Calendar = new EcoreExecutorType(DemoPackage.Literals.CALENDAR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Meeting = new EcoreExecutorType(DemoPackage.Literals.MEETING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Member = new EcoreExecutorType(DemoPackage.Literals.MEMBER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Min2Chars = new EcoreExecutorType("Min2Chars", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
			_Address,
			_Calendar,
			_Meeting,
			_Member,
			_Min2Chars
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Address__Address = new ExecutorFragment(Types._Address, DemoTables.Types._Address);
		private static final /*@NonNull*/ ExecutorFragment _Address__OclAny = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Address__OclElement = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Calendar__Calendar = new ExecutorFragment(Types._Calendar, DemoTables.Types._Calendar);
		private static final /*@NonNull*/ ExecutorFragment _Calendar__OclAny = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Calendar__OclElement = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Meeting__Meeting = new ExecutorFragment(Types._Meeting, DemoTables.Types._Meeting);
		private static final /*@NonNull*/ ExecutorFragment _Meeting__OclAny = new ExecutorFragment(Types._Meeting, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Meeting__OclElement = new ExecutorFragment(Types._Meeting, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Member__Member = new ExecutorFragment(Types._Member, DemoTables.Types._Member);
		private static final /*@NonNull*/ ExecutorFragment _Member__OclAny = new ExecutorFragment(Types._Member, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Member__OclElement = new ExecutorFragment(Types._Member, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__Min2Chars = new ExecutorFragment(Types._Min2Chars, DemoTables.Types._Min2Chars);
		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__OclAny = new ExecutorFragment(Types._Min2Chars, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__OclComparable = new ExecutorFragment(Types._Min2Chars, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__OclElement = new ExecutorFragment(Types._Min2Chars, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__OclSummable = new ExecutorFragment(Types._Min2Chars, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _Min2Chars__String = new ExecutorFragment(Types._Min2Chars, OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _ = TypeUtil.createParameterTypes();

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Meeting__howManyMembers = new ExecutorOperation("howManyMembers", Parameters._, Types._Meeting,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Address__email = new EcoreExecutorProperty(DemoPackage.Literals.ADDRESS__EMAIL, Types._Address, 0);
		public static final /*@NonNull*/ ExecutorProperty _Address__Member__address = new ExecutorPropertyWithImplementation("Member", Types._Address, 1, new EcoreLibraryOppositeProperty(DemoPackage.Literals.MEMBER__ADDRESS));

		public static final /*@NonNull*/ ExecutorProperty _Calendar__description = new EcoreExecutorProperty(DemoPackage.Literals.CALENDAR__DESCRIPTION, Types._Calendar, 0);
		public static final /*@NonNull*/ ExecutorProperty _Calendar__meetings = new EcoreExecutorProperty(DemoPackage.Literals.CALENDAR__MEETINGS, Types._Calendar, 1);

		public static final /*@NonNull*/ ExecutorProperty _Meeting__members = new EcoreExecutorProperty(DemoPackage.Literals.MEETING__MEMBERS, Types._Meeting, 0);
		public static final /*@NonNull*/ ExecutorProperty _Meeting__name = new EcoreExecutorProperty(DemoPackage.Literals.MEETING__NAME, Types._Meeting, 1);
		public static final /*@NonNull*/ ExecutorProperty _Meeting__Calendar__meetings = new ExecutorPropertyWithImplementation("Calendar", Types._Meeting, 2, new EcoreLibraryOppositeProperty(DemoPackage.Literals.CALENDAR__MEETINGS));

		public static final /*@NonNull*/ ExecutorProperty _Member__address = new EcoreExecutorProperty(DemoPackage.Literals.MEMBER__ADDRESS, Types._Member, 0);
		public static final /*@NonNull*/ ExecutorProperty _Member__name = new EcoreExecutorProperty(DemoPackage.Literals.MEMBER__NAME, Types._Member, 1);
		public static final /*@NonNull*/ ExecutorProperty _Member__Meeting__members = new ExecutorPropertyWithImplementation("Meeting", Types._Member, 2, new EcoreLibraryOppositeProperty(DemoPackage.Literals.MEETING__MEMBERS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment[] _Address =
		{
			Fragments._Address__OclAny /* 0 */,
			Fragments._Address__OclElement /* 1 */,
			Fragments._Address__Address /* 2 */
		};
		private static final /*@NonNull*/ int[] __Address = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Calendar =
		{
			Fragments._Calendar__OclAny /* 0 */,
			Fragments._Calendar__OclElement /* 1 */,
			Fragments._Calendar__Calendar /* 2 */
		};
		private static final /*@NonNull*/ int[] __Calendar = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Meeting =
		{
			Fragments._Meeting__OclAny /* 0 */,
			Fragments._Meeting__OclElement /* 1 */,
			Fragments._Meeting__Meeting /* 2 */
		};
		private static final /*@NonNull*/ int[] __Meeting = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Member =
		{
			Fragments._Member__OclAny /* 0 */,
			Fragments._Member__OclElement /* 1 */,
			Fragments._Member__Member /* 2 */
		};
		private static final /*@NonNull*/ int[] __Member = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Min2Chars =
		{
			Fragments._Min2Chars__OclAny /* 0 */,
			Fragments._Min2Chars__OclComparable /* 1 */,
			Fragments._Min2Chars__OclElement /* 1 */,
			Fragments._Min2Chars__OclSummable /* 1 */,
			Fragments._Min2Chars__String /* 2 */,
			Fragments._Min2Chars__Min2Chars /* 3 */
		};
		private static final /*@NonNull*/ int[] __Min2Chars = { 1,3,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Address.initFragments(_Address, __Address);
			Types._Calendar.initFragments(_Calendar, __Calendar);
			Types._Meeting.initFragments(_Meeting, __Meeting);
			Types._Member.initFragments(_Member, __Member);
			Types._Min2Chars.initFragments(_Min2Chars, __Min2Chars);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation[] _Address__Address = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Address__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Address__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Calendar__Calendar = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Calendar__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Calendar__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Meeting__Meeting = {
			DemoTables.Operations._Meeting__howManyMembers /* howManyMembers() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Meeting__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Meeting__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Member__Member = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Member__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Member__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__Min2Chars = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__OclAny = {
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Min2Chars__String = {
			OCLstdlibTables.Operations._String___add_ /* _'+'(String[?]) */,
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__at /* at(Integer[?]) */,
			OCLstdlibTables.Operations._String__characters /* characters() */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__concat /* concat(String[?]) */,
			OCLstdlibTables.Operations._String__endsWith /* endsWith(String[?]) */,
			OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String[?]) */,
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
			OCLstdlibTables.Operations._String__matches /* matches(String[?]) */,
			OCLstdlibTables.Operations._String__replaceAll /* replaceAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__replaceFirst /* replaceFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__size /* size() */,
			OCLstdlibTables.Operations._String__startsWith /* startsWith(String[?]) */,
			OCLstdlibTables.Operations._String__substituteAll /* substituteAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substituteFirst /* substituteFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substring /* substring(Integer[?],Integer[?]) */,
			OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
			OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
			OCLstdlibTables.Operations._String__toLower /* toLower() */,
			OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
			OCLstdlibTables.Operations._String__toReal /* toReal() */,
			OCLstdlibTables.Operations._String__toString /* toString() */,
			OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
			OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */,
			OCLstdlibTables.Operations._String__0_tokenize /* tokenize() */,
			OCLstdlibTables.Operations._String__1_tokenize /* tokenize(String[?]) */,
			OCLstdlibTables.Operations._String__2_tokenize /* tokenize(String[?],Boolean[?]) */,
			OCLstdlibTables.Operations._String__trim /* trim() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Address__Address.initOperations(_Address__Address);
			Fragments._Address__OclAny.initOperations(_Address__OclAny);
			Fragments._Address__OclElement.initOperations(_Address__OclElement);

			Fragments._Calendar__Calendar.initOperations(_Calendar__Calendar);
			Fragments._Calendar__OclAny.initOperations(_Calendar__OclAny);
			Fragments._Calendar__OclElement.initOperations(_Calendar__OclElement);

			Fragments._Meeting__Meeting.initOperations(_Meeting__Meeting);
			Fragments._Meeting__OclAny.initOperations(_Meeting__OclAny);
			Fragments._Meeting__OclElement.initOperations(_Meeting__OclElement);

			Fragments._Member__Member.initOperations(_Member__Member);
			Fragments._Member__OclAny.initOperations(_Member__OclAny);
			Fragments._Member__OclElement.initOperations(_Member__OclElement);

			Fragments._Min2Chars__Min2Chars.initOperations(_Min2Chars__Min2Chars);
			Fragments._Min2Chars__OclAny.initOperations(_Min2Chars__OclAny);
			Fragments._Min2Chars__OclComparable.initOperations(_Min2Chars__OclComparable);
			Fragments._Min2Chars__OclElement.initOperations(_Min2Chars__OclElement);
			Fragments._Min2Chars__OclSummable.initOperations(_Min2Chars__OclSummable);
			Fragments._Min2Chars__String.initOperations(_Min2Chars__String);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty[] _Address = {
			DemoTables.Properties._Address__email,
			DemoTables.Properties._Address__Member__address
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Calendar = {
			DemoTables.Properties._Calendar__description,
			DemoTables.Properties._Calendar__meetings
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Meeting = {
			DemoTables.Properties._Meeting__members,
			DemoTables.Properties._Meeting__name,
			DemoTables.Properties._Meeting__Calendar__meetings
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Member = {
			DemoTables.Properties._Member__address,
			DemoTables.Properties._Member__name,
			DemoTables.Properties._Member__Meeting__members
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Min2Chars = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Address__Address.initProperties(_Address);
			Fragments._Calendar__Calendar.initProperties(_Calendar);
			Fragments._Meeting__Meeting.initProperties(_Meeting);
			Fragments._Member__Member.initProperties(_Member);
			Fragments._Min2Chars__Min2Chars.initProperties(_Min2Chars);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DemoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
