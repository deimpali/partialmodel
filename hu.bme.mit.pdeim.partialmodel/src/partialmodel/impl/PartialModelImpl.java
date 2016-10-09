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
import partialmodel.PartialModel;
import partialmodel.PartialmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.impl.PartialModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link partialmodel.impl.PartialModelImpl#isOpenworld <em>Openworld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialModelImpl extends MinimalEObjectImpl.Container implements PartialModel {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PSObject> objects;

	/**
	 * The default value of the '{@link #isOpenworld() <em>Openworld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenworld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPENWORLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpenworld() <em>Openworld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenworld()
	 * @generated
	 * @ordered
	 */
	protected boolean openworld = OPENWORLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialmodelPackage.Literals.PARTIAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<PSObject>(PSObject.class, this, PartialmodelPackage.PARTIAL_MODEL__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenworld() {
		return openworld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenworld(boolean newOpenworld) {
		boolean oldOpenworld = openworld;
		openworld = newOpenworld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialmodelPackage.PARTIAL_MODEL__OPENWORLD, oldOpenworld, openworld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialmodelPackage.PARTIAL_MODEL__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case PartialmodelPackage.PARTIAL_MODEL__OBJECTS:
				return getObjects();
			case PartialmodelPackage.PARTIAL_MODEL__OPENWORLD:
				return isOpenworld();
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
			case PartialmodelPackage.PARTIAL_MODEL__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends PSObject>)newValue);
				return;
			case PartialmodelPackage.PARTIAL_MODEL__OPENWORLD:
				setOpenworld((Boolean)newValue);
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
			case PartialmodelPackage.PARTIAL_MODEL__OBJECTS:
				getObjects().clear();
				return;
			case PartialmodelPackage.PARTIAL_MODEL__OPENWORLD:
				setOpenworld(OPENWORLD_EDEFAULT);
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
			case PartialmodelPackage.PARTIAL_MODEL__OBJECTS:
				return objects != null && !objects.isEmpty();
			case PartialmodelPackage.PARTIAL_MODEL__OPENWORLD:
				return openworld != OPENWORLD_EDEFAULT;
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
		result.append(" (openworld: ");
		result.append(openworld);
		result.append(')');
		return result.toString();
	}

} //PartialModelImpl
