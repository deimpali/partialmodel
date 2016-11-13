/**
 */
package partialmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSType#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSType()
 * @model abstract="true"
 * @generated
 */
public interface PSType extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(EObject)
	 * @see partialmodel.PartialmodelPackage#getPSType_Parent()
	 * @model
	 * @generated
	 */
	EObject getParent();

	/**
	 * Sets the value of the '{@link partialmodel.PSType#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EObject value);
} // PSType
