/**
 */
package partialmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>May Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.MayType#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getMayType()
 * @model
 * @generated
 */
public interface MayType extends PSType {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * The literals are from the enumeration {@link partialmodel.May}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.May
	 * @see #setAnnotation(May)
	 * @see partialmodel.PartialmodelPackage#getMayType_Annotation()
	 * @model
	 * @generated
	 */
	May getAnnotation();

	/**
	 * Sets the value of the '{@link partialmodel.MayType#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.May
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(May value);

} // MayType
