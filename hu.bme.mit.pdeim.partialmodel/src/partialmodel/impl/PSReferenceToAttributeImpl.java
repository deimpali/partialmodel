/**
 */
package partialmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import partialmodel.PSAttribute;
import partialmodel.PSReferenceToAttribute;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Reference To Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PSReferenceToAttributeImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSReferenceToAttributeImpl extends PSReferenceImpl implements PSReferenceToAttribute {
	/**
	 * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected PSAttribute targetAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSReferenceToAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PS_REFERENCE_TO_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSAttribute getTargetAttribute() {
		if (targetAttribute != null && targetAttribute.eIsProxy()) {
			InternalEObject oldTargetAttribute = (InternalEObject)targetAttribute;
			targetAttribute = (PSAttribute)eResolveProxy(oldTargetAttribute);
			if (targetAttribute != oldTargetAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
			}
		}
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSAttribute basicGetTargetAttribute() {
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttribute(PSAttribute newTargetAttribute) {
		PSAttribute oldTargetAttribute = targetAttribute;
		targetAttribute = newTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE:
				if (resolve) return getTargetAttribute();
				return basicGetTargetAttribute();
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
			case PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE:
				setTargetAttribute((PSAttribute)newValue);
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
			case PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE:
				setTargetAttribute((PSAttribute)null);
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
			case PartialmodelPackage.PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE:
				return targetAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //PSReferenceToAttributeImpl
