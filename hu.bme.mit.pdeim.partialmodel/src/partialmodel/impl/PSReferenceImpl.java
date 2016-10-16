/**
 */
package partialmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import partialmodel.PSObject;
import partialmodel.PSReference;
import partialmodel.PSType;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PSReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link partialmodel.impl.PSReferenceImpl#getPsType <em>Ps Type</em>}</li>
 *   <li>{@link partialmodel.impl.PSReferenceImpl#getReferredClass <em>Referred Class</em>}</li>
 *   <li>{@link partialmodel.impl.PSReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link partialmodel.impl.PSReferenceImpl#getSourceObject <em>Source Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PSReferenceImpl extends MinimalEObjectImpl.Container implements PSReference {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPsType() <em>Ps Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsType()
	 * @generated
	 * @ordered
	 */
	protected EList<PSType> psType;

	/**
	 * The cached value of the '{@link #getReferredClass() <em>Referred Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredClass()
	 * @generated
	 * @ordered
	 */
	protected EClass referredClass;

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
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected PSObject sourceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PS_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSType> getPsType() {
		if (psType == null) {
			psType = new EObjectContainmentEList<PSType>(PSType.class, this, PartialmodelPackage.PS_REFERENCE__PS_TYPE);
		}
		return psType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferredClass() {
		if (referredClass != null && referredClass.eIsProxy()) {
			InternalEObject oldReferredClass = (InternalEObject)referredClass;
			referredClass = (EClass)eResolveProxy(oldReferredClass);
			if (referredClass != oldReferredClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS, oldReferredClass, referredClass));
			}
		}
		return referredClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetReferredClass() {
		return referredClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredClass(EClass newReferredClass) {
		EClass oldReferredClass = referredClass;
		referredClass = newReferredClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS, oldReferredClass, referredClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSObject getSourceObject() {
		if (sourceObject != null && sourceObject.eIsProxy()) {
			InternalEObject oldSourceObject = (InternalEObject)sourceObject;
			sourceObject = (PSObject)eResolveProxy(oldSourceObject);
			if (sourceObject != oldSourceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT, oldSourceObject, sourceObject));
			}
		}
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSObject basicGetSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(PSObject newSourceObject) {
		PSObject oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialmodelPackage.PS_REFERENCE__PS_TYPE:
				return ((InternalEList<?>)getPsType()).basicRemove(otherEnd, msgs);
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
			case PartialmodelPackage.PS_REFERENCE__TYPE:
				return getType();
			case PartialmodelPackage.PS_REFERENCE__PS_TYPE:
				return getPsType();
			case PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS:
				if (resolve) return getReferredClass();
				return basicGetReferredClass();
			case PartialmodelPackage.PS_REFERENCE__NAME:
				return getName();
			case PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT:
				if (resolve) return getSourceObject();
				return basicGetSourceObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartialmodelPackage.PS_REFERENCE__TYPE:
				setType((String)newValue);
				return;
			case PartialmodelPackage.PS_REFERENCE__PS_TYPE:
				getPsType().clear();
				getPsType().addAll((Collection<? extends PSType>)newValue);
				return;
			case PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS:
				setReferredClass((EClass)newValue);
				return;
			case PartialmodelPackage.PS_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT:
				setSourceObject((PSObject)newValue);
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
			case PartialmodelPackage.PS_REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PartialmodelPackage.PS_REFERENCE__PS_TYPE:
				getPsType().clear();
				return;
			case PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS:
				setReferredClass((EClass)null);
				return;
			case PartialmodelPackage.PS_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT:
				setSourceObject((PSObject)null);
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
			case PartialmodelPackage.PS_REFERENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PartialmodelPackage.PS_REFERENCE__PS_TYPE:
				return psType != null && !psType.isEmpty();
			case PartialmodelPackage.PS_REFERENCE__REFERRED_CLASS:
				return referredClass != null;
			case PartialmodelPackage.PS_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PartialmodelPackage.PS_REFERENCE__SOURCE_OBJECT:
				return sourceObject != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PSReferenceImpl
