/**
 */
package partialmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PSAttribute#getPsType <em>Ps Type</em>}</li>
 *   <li>{@link partialmodel.PSAttribute#getType <em>Type</em>}</li>
 *   <li>{@link partialmodel.PSAttribute#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPSAttribute()
 * @model abstract="true"
 * @generated
 */
public interface PSAttribute extends EObject {
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
	 * @see partialmodel.PartialmodelPackage#getPSAttribute_PsType()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<PSType> getPsType();

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
	 * @see partialmodel.PartialmodelPackage#getPSAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link partialmodel.PSAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link partialmodel.PSReferenceToAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see partialmodel.PartialmodelPackage#getPSAttribute_References()
	 * @model
	 * @generated
	 */
	EList<PSReferenceToAttribute> getReferences();

} // PSAttribute
