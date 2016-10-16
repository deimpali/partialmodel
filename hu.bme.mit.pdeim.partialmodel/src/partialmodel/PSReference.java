/**
 */
package partialmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSReference#getType <em>Type</em>}</li>
 *   <li>{@link partialmodel.PSReference#getPsType <em>Ps Type</em>}</li>
 *   <li>{@link partialmodel.PSReference#getReferredClass <em>Referred Class</em>}</li>
 *   <li>{@link partialmodel.PSReference#getName <em>Name</em>}</li>
 *   <li>{@link partialmodel.PSReference#getSourceObject <em>Source Object</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSReference()
 * @model abstract="true"
 * @generated
 */
public interface PSReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see partialmodel.PartialmodelPackage#getPSReference_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link partialmodel.PSReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see partialmodel.PartialmodelPackage#getPSReference_PsType()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<PSType> getPsType();

	/**
	 * Returns the value of the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Class</em>' reference.
	 * @see #setReferredClass(EClass)
	 * @see partialmodel.PartialmodelPackage#getPSReference_ReferredClass()
	 * @model
	 * @generated
	 */
	EClass getReferredClass();

	/**
	 * Sets the value of the '{@link partialmodel.PSReference#getReferredClass <em>Referred Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Class</em>' reference.
	 * @see #getReferredClass()
	 * @generated
	 */
	void setReferredClass(EClass value);

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
	 * @see partialmodel.PartialmodelPackage#getPSReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link partialmodel.PSReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(PSObject)
	 * @see partialmodel.PartialmodelPackage#getPSReference_SourceObject()
	 * @model
	 * @generated
	 */
	PSObject getSourceObject();

	/**
	 * Sets the value of the '{@link partialmodel.PSReference#getSourceObject <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' reference.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(PSObject value);

} // PSReference
