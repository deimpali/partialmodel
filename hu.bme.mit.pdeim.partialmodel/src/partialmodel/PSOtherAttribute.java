/**
 */
package partialmodel;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Other Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSOtherAttribute#getRefferedClass <em>Reffered Class</em>}</li>
 *   <li>{@link partialmodel.PSOtherAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSOtherAttribute()
 * @model
 * @generated
 */
public interface PSOtherAttribute extends PSAttribute {
	/**
	 * Returns the value of the '<em><b>Reffered Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reffered Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reffered Class</em>' reference.
	 * @see #setRefferedClass(EClass)
	 * @see partialmodel.PartialmodelPackage#getPSOtherAttribute_RefferedClass()
	 * @model
	 * @generated
	 */
	EClass getRefferedClass();

	/**
	 * Sets the value of the '{@link partialmodel.PSOtherAttribute#getRefferedClass <em>Reffered Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reffered Class</em>' reference.
	 * @see #getRefferedClass()
	 * @generated
	 */
	void setRefferedClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see partialmodel.PartialmodelPackage#getPSOtherAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link partialmodel.PSOtherAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PSOtherAttribute
