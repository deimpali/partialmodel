/**
 */
package partialmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import partialmodel.PSOtherAttribute;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Other Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PSOtherAttributeImpl#getRefferedClass <em>Reffered Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSOtherAttributeImpl extends PSAttributeImpl implements PSOtherAttribute {
	/**
	 * The cached value of the '{@link #getRefferedClass() <em>Reffered Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefferedClass()
	 * @generated
	 * @ordered
	 */
	protected EClass refferedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSOtherAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PS_OTHER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefferedClass() {
		if (refferedClass != null && refferedClass.eIsProxy()) {
			InternalEObject oldRefferedClass = (InternalEObject)refferedClass;
			refferedClass = (EClass)eResolveProxy(oldRefferedClass);
			if (refferedClass != oldRefferedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS, oldRefferedClass, refferedClass));
			}
		}
		return refferedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRefferedClass() {
		return refferedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefferedClass(EClass newRefferedClass) {
		EClass oldRefferedClass = refferedClass;
		refferedClass = newRefferedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS, oldRefferedClass, refferedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS:
				if (resolve) return getRefferedClass();
				return basicGetRefferedClass();
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
			case PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS:
				setRefferedClass((EClass)newValue);
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
			case PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS:
				setRefferedClass((EClass)null);
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
			case PartialmodelPackage.PS_OTHER_ATTRIBUTE__REFFERED_CLASS:
				return refferedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //PSOtherAttributeImpl
