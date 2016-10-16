/**
 */
package partialmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Reference To Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSReferenceToAttribute#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSReferenceToAttribute()
 * @model
 * @generated
 */
public interface PSReferenceToAttribute extends PSReference {
	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' reference.
	 * @see #setTargetAttribute(PSAttribute)
	 * @see partialmodel.PartialmodelPackage#getPSReferenceToAttribute_TargetAttribute()
	 * @model
	 * @generated
	 */
	PSAttribute getTargetAttribute();

	/**
	 * Sets the value of the '{@link partialmodel.PSReferenceToAttribute#getTargetAttribute <em>Target Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' reference.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(PSAttribute value);

} // PSReferenceToAttribute
