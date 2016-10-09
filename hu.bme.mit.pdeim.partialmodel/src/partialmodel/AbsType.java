/**
 */
package partialmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.AbsType#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getAbsType()
 * @model
 * @generated
 */
public interface AbsType extends PSType {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * The literals are from the enumeration {@link partialmodel.Abs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.Abs
	 * @see #setAnnotation(Abs)
	 * @see partialmodel.PartialmodelPackage#getAbsType_Annotation()
	 * @model
	 * @generated
	 */
	Abs getAnnotation();

	/**
	 * Sets the value of the '{@link partialmodel.AbsType#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.Abs
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Abs value);

} // AbsType
