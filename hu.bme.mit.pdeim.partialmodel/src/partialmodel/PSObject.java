/**
 */
package partialmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSObject#getRefs <em>Refs</em>}</li>
 *   <li>{@link partialmodel.PSObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link partialmodel.PSObject#getPsType <em>Ps Type</em>}</li>
 *   <li>{@link partialmodel.PSObject#getPackageNsUri <em>Package Ns Uri</em>}</li>
 *   <li>{@link partialmodel.PSObject#getReferredEClass <em>Referred EClass</em>}</li>
 *   <li>{@link partialmodel.PSObject#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSObject()
 * @model
 * @generated
 */
public interface PSObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
	 * The list contents are of type {@link partialmodel.PSReferenceToObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' containment reference list.
	 * @see partialmodel.PartialmodelPackage#getPSObject_Refs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSReferenceToObject> getRefs();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link partialmodel.PSReferenceToAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see partialmodel.PartialmodelPackage#getPSObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSReferenceToAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ps Type</b></em>' containment reference list.
	 * The list contents are of type {@link partialmodel.PSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ps Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ps Type</em>' containment reference list.
	 * @see partialmodel.PartialmodelPackage#getPSObject_PsType()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<PSType> getPsType();

	/**
	 * Returns the value of the '<em><b>Package Ns Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Ns Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Ns Uri</em>' attribute.
	 * @see #setPackageNsUri(String)
	 * @see partialmodel.PartialmodelPackage#getPSObject_PackageNsUri()
	 * @model
	 * @generated
	 */
	String getPackageNsUri();

	/**
	 * Sets the value of the '{@link partialmodel.PSObject#getPackageNsUri <em>Package Ns Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Ns Uri</em>' attribute.
	 * @see #getPackageNsUri()
	 * @generated
	 */
	void setPackageNsUri(String value);

	/**
	 * Returns the value of the '<em><b>Referred EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred EClass</em>' reference.
	 * @see #setReferredEClass(EClass)
	 * @see partialmodel.PartialmodelPackage#getPSObject_ReferredEClass()
	 * @model
	 * @generated
	 */
	EClass getReferredEClass();

	/**
	 * Sets the value of the '{@link partialmodel.PSObject#getReferredEClass <em>Referred EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred EClass</em>' reference.
	 * @see #getReferredEClass()
	 * @generated
	 */
	void setReferredEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see partialmodel.PartialmodelPackage#getPSObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link partialmodel.PSObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PSObject
