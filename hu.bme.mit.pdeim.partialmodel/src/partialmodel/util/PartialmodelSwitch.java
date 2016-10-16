/**
 */
package partialmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import partialmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see partialmodel.PartialmodelPackage
 * @generated
 */
public class PartialmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartialmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = PartialmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PartialmodelPackage.PARTIAL_MODEL: {
				PartialModel partialModel = (PartialModel)theEObject;
				T result = casePartialModel(partialModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_REFERENCE: {
				PSReference psReference = (PSReference)theEObject;
				T result = casePSReference(psReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_OBJECT: {
				PSObject psObject = (PSObject)theEObject;
				T result = casePSObject(psObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_ATTRIBUTE: {
				PSAttribute psAttribute = (PSAttribute)theEObject;
				T result = casePSAttribute(psAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_TYPE: {
				PSType psType = (PSType)theEObject;
				T result = casePSType(psType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = casePSType(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.MAY_TYPE: {
				MayType mayType = (MayType)theEObject;
				T result = caseMayType(mayType);
				if (result == null) result = casePSType(mayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.ABS_TYPE: {
				AbsType absType = (AbsType)theEObject;
				T result = caseAbsType(absType);
				if (result == null) result = casePSType(absType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_STRING: {
				PSString psString = (PSString)theEObject;
				T result = casePSString(psString);
				if (result == null) result = casePSAttribute(psString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_INTEGER: {
				PSInteger psInteger = (PSInteger)theEObject;
				T result = casePSInteger(psInteger);
				if (result == null) result = casePSAttribute(psInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_BOOLEAN: {
				PSBoolean psBoolean = (PSBoolean)theEObject;
				T result = casePSBoolean(psBoolean);
				if (result == null) result = casePSAttribute(psBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_OTHER_ATTRIBUTE: {
				PSOtherAttribute psOtherAttribute = (PSOtherAttribute)theEObject;
				T result = casePSOtherAttribute(psOtherAttribute);
				if (result == null) result = casePSAttribute(psOtherAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_REFERENCE_TO_OBJECT: {
				PSReferenceToObject psReferenceToObject = (PSReferenceToObject)theEObject;
				T result = casePSReferenceToObject(psReferenceToObject);
				if (result == null) result = casePSReference(psReferenceToObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE: {
				PSReferenceToAttribute psReferenceToAttribute = (PSReferenceToAttribute)theEObject;
				T result = casePSReferenceToAttribute(psReferenceToAttribute);
				if (result == null) result = casePSReference(psReferenceToAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialModel(PartialModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSReference(PSReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSObject(PSObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSAttribute(PSAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSType(PSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>May Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>May Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMayType(MayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsType(AbsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSString(PSString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSInteger(PSInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSBoolean(PSBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Other Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Other Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSOtherAttribute(PSOtherAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Reference To Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Reference To Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSReferenceToObject(PSReferenceToObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Reference To Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Reference To Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSReferenceToAttribute(PSReferenceToAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PartialmodelSwitch
