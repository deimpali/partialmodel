/**
 */
package partialmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import partialmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartialmodelFactoryImpl extends EFactoryImpl implements PartialmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartialmodelFactory init() {
		try {
			PartialmodelFactory thePartialmodelFactory = (PartialmodelFactory)EPackage.Registry.INSTANCE.getEFactory(PartialmodelPackage.eNS_URI);
			if (thePartialmodelFactory != null) {
				return thePartialmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartialmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PartialmodelPackage.PARTIAL_MODEL: return createPartialModel();
			case PartialmodelPackage.PS_REFERENCE: return createPSReference();
			case PartialmodelPackage.PS_OBJECT: return createPSObject();
			case PartialmodelPackage.VAR_TYPE: return createVarType();
			case PartialmodelPackage.MAY_TYPE: return createMayType();
			case PartialmodelPackage.ABS_TYPE: return createAbsType();
			case PartialmodelPackage.PS_STRING: return createPSString();
			case PartialmodelPackage.PS_INTEGER: return createPSInteger();
			case PartialmodelPackage.PS_BOOLEAN: return createPSBoolean();
			case PartialmodelPackage.OTHER: return createOther();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PartialmodelPackage.MAY:
				return createMayFromString(eDataType, initialValue);
			case PartialmodelPackage.ABS:
				return createAbsFromString(eDataType, initialValue);
			case PartialmodelPackage.VAR:
				return createVarFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PartialmodelPackage.MAY:
				return convertMayToString(eDataType, instanceValue);
			case PartialmodelPackage.ABS:
				return convertAbsToString(eDataType, instanceValue);
			case PartialmodelPackage.VAR:
				return convertVarToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialModel createPartialModel() {
		PartialModelImpl partialModel = new PartialModelImpl();
		return partialModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSReference createPSReference() {
		PSReferenceImpl psReference = new PSReferenceImpl();
		return psReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSObject createPSObject() {
		PSObjectImpl psObject = new PSObjectImpl();
		return psObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MayType createMayType() {
		MayTypeImpl mayType = new MayTypeImpl();
		return mayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsType createAbsType() {
		AbsTypeImpl absType = new AbsTypeImpl();
		return absType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSString createPSString() {
		PSStringImpl psString = new PSStringImpl();
		return psString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSInteger createPSInteger() {
		PSIntegerImpl psInteger = new PSIntegerImpl();
		return psInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSBoolean createPSBoolean() {
		PSBooleanImpl psBoolean = new PSBooleanImpl();
		return psBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Other createOther() {
		OtherImpl other = new OtherImpl();
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public May createMayFromString(EDataType eDataType, String initialValue) {
		May result = May.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abs createAbsFromString(EDataType eDataType, String initialValue) {
		Abs result = Abs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVarFromString(EDataType eDataType, String initialValue) {
		Var result = Var.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelPackage getPartialmodelPackage() {
		return (PartialmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartialmodelPackage getPackage() {
		return PartialmodelPackage.eINSTANCE;
	}

} //PartialmodelFactoryImpl
