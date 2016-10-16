/**
 */
package partialmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Reference To Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSReferenceToObject#getTargetObject <em>Target Object</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSReferenceToObject()
 * @model
 * @generated
 */
public interface PSReferenceToObject extends PSReference {
	/**
	 * Returns the value of the '<em><b>Target Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object</em>' reference.
	 * @see #setTargetObject(PSObject)
	 * @see partialmodel.PartialmodelPackage#getPSReferenceToObject_TargetObject()
	 * @model
	 * @generated
	 */
	PSObject getTargetObject();

	/**
	 * Sets the value of the '{@link partialmodel.PSReferenceToObject#getTargetObject <em>Target Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object</em>' reference.
	 * @see #getTargetObject()
	 * @generated
	 */
	void setTargetObject(PSObject value);

} // PSReferenceToObject
