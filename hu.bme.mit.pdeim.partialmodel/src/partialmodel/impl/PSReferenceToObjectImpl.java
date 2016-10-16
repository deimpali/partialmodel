/**
 */
package partialmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import partialmodel.PSObject;
import partialmodel.PSReferenceToObject;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Reference To Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PSReferenceToObjectImpl#getTargetObject <em>Target Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSReferenceToObjectImpl extends PSReferenceImpl implements PSReferenceToObject {
	/**
	 * The cached value of the '{@link #getTargetObject() <em>Target Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected PSObject targetObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSReferenceToObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PS_REFERENCE_TO_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSObject getTargetObject() {
		if (targetObject != null && targetObject.eIsProxy()) {
			InternalEObject oldTargetObject = (InternalEObject)targetObject;
			targetObject = (PSObject)eResolveProxy(oldTargetObject);
			if (targetObject != oldTargetObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT, oldTargetObject, targetObject));
			}
		}
		return targetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSObject basicGetTargetObject() {
		return targetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetObject(PSObject newTargetObject) {
		PSObject oldTargetObject = targetObject;
		targetObject = newTargetObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT, oldTargetObject, targetObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT:
				if (resolve) return getTargetObject();
				return basicGetTargetObject();
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
			case PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT:
				setTargetObject((PSObject)newValue);
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
			case PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT:
				setTargetObject((PSObject)null);
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
			case PartialmodelPackage.PS_REFERENCE_TO_OBJECT__TARGET_OBJECT:
				return targetObject != null;
		}
		return super.eIsSet(featureID);
	}

} //PSReferenceToObjectImpl
