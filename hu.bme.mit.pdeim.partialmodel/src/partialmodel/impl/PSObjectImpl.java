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
import partialmodel.PSAttribute;
import partialmodel.PSObject;
import partialmodel.PSReference;
import partialmodel.PSType;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getPsType <em>Ps Type</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getPackageNsUri <em>Package Ns Uri</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getReferredEClass <em>Referred EClass</em>}</li>
 *   <li>{@link partialmodel.impl.PSObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSObjectImpl extends MinimalEObjectImpl.Container implements PSObject {
	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<PSReference> refs;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<PSAttribute> attributes;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPackageNsUri() <em>Package Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageNsUri() <em>Package Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNsUri()
	 * @generated
	 * @ordered
	 */
	protected String packageNsUri = PACKAGE_NS_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferredEClass() <em>Referred EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass referredEClass;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSReference> getRefs() {
		if (refs == null) {
			refs = new EObjectContainmentEList<PSReference>(PSReference.class, this, PartialmodelPackage.PS_OBJECT__REFS);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<PSAttribute>(PSAttribute.class, this, PartialmodelPackage.PS_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_OBJECT__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSType> getPsType() {
		if (psType == null) {
			psType = new EObjectContainmentEList<PSType>(PSType.class, this, PartialmodelPackage.PS_OBJECT__PS_TYPE);
		}
		return psType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageNsUri() {
		return packageNsUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageNsUri(String newPackageNsUri) {
		String oldPackageNsUri = packageNsUri;
		packageNsUri = newPackageNsUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_OBJECT__PACKAGE_NS_URI, oldPackageNsUri, packageNsUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferredEClass() {
		if (referredEClass != null && referredEClass.eIsProxy()) {
			InternalEObject oldReferredEClass = (InternalEObject)referredEClass;
			referredEClass = (EClass)eResolveProxy(oldReferredEClass);
			if (referredEClass != oldReferredEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS, oldReferredEClass, referredEClass));
			}
		}
		return referredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetReferredEClass() {
		return referredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredEClass(EClass newReferredEClass) {
		EClass oldReferredEClass = referredEClass;
		referredEClass = newReferredEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS, oldReferredEClass, referredEClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PS_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialmodelPackage.PS_OBJECT__REFS:
				return ((InternalEList<?>)getRefs()).basicRemove(otherEnd, msgs);
			case PartialmodelPackage.PS_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PartialmodelPackage.PS_OBJECT__PS_TYPE:
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
			case PartialmodelPackage.PS_OBJECT__REFS:
				return getRefs();
			case PartialmodelPackage.PS_OBJECT__ATTRIBUTES:
				return getAttributes();
			case PartialmodelPackage.PS_OBJECT__TYPE_NAME:
				return getTypeName();
			case PartialmodelPackage.PS_OBJECT__PS_TYPE:
				return getPsType();
			case PartialmodelPackage.PS_OBJECT__PACKAGE_NS_URI:
				return getPackageNsUri();
			case PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS:
				if (resolve) return getReferredEClass();
				return basicGetReferredEClass();
			case PartialmodelPackage.PS_OBJECT__NAME:
				return getName();
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
			case PartialmodelPackage.PS_OBJECT__REFS:
				getRefs().clear();
				getRefs().addAll((Collection<? extends PSReference>)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends PSAttribute>)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__PS_TYPE:
				getPsType().clear();
				getPsType().addAll((Collection<? extends PSType>)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__PACKAGE_NS_URI:
				setPackageNsUri((String)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS:
				setReferredEClass((EClass)newValue);
				return;
			case PartialmodelPackage.PS_OBJECT__NAME:
				setName((String)newValue);
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
			case PartialmodelPackage.PS_OBJECT__REFS:
				getRefs().clear();
				return;
			case PartialmodelPackage.PS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PartialmodelPackage.PS_OBJECT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case PartialmodelPackage.PS_OBJECT__PS_TYPE:
				getPsType().clear();
				return;
			case PartialmodelPackage.PS_OBJECT__PACKAGE_NS_URI:
				setPackageNsUri(PACKAGE_NS_URI_EDEFAULT);
				return;
			case PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS:
				setReferredEClass((EClass)null);
				return;
			case PartialmodelPackage.PS_OBJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case PartialmodelPackage.PS_OBJECT__REFS:
				return refs != null && !refs.isEmpty();
			case PartialmodelPackage.PS_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PartialmodelPackage.PS_OBJECT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case PartialmodelPackage.PS_OBJECT__PS_TYPE:
				return psType != null && !psType.isEmpty();
			case PartialmodelPackage.PS_OBJECT__PACKAGE_NS_URI:
				return PACKAGE_NS_URI_EDEFAULT == null ? packageNsUri != null : !PACKAGE_NS_URI_EDEFAULT.equals(packageNsUri);
			case PartialmodelPackage.PS_OBJECT__REFERRED_ECLASS:
				return referredEClass != null;
			case PartialmodelPackage.PS_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", packageNsUri: ");
		result.append(packageNsUri);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PSObjectImpl
