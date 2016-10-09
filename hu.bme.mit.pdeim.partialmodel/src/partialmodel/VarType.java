/**
 */
package partialmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.VarType#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getVarType()
 * @model
 * @generated
 */
public interface VarType extends PSType {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * The literals are from the enumeration {@link partialmodel.Var}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.Var
	 * @see #setAnnotation(Var)
	 * @see partialmodel.PartialmodelPackage#getVarType_Annotation()
	 * @model
	 * @generated
	 */
	Var getAnnotation();

	/**
	 * Sets the value of the '{@link partialmodel.VarType#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see partialmodel.Var
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Var value);

} // VarType
