/**
 */
package partialmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link partialmodel.PartialModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link partialmodel.PartialModel#isOpenworld <em>Openworld</em>}</li>
 *   <li>{@link partialmodel.PartialModel#getAllAttributes <em>All Attributes</em>}</li>
 * </ul>
 *
 * @see partialmodel.PartialmodelPackage#getPartialModel()
 * @model
 * @generated
 */
public interface PartialModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link partialmodel.PSObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see partialmodel.PartialmodelPackage#getPartialModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Openworld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openworld</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openworld</em>' attribute.
	 * @see #setOpenworld(boolean)
	 * @see partialmodel.PartialmodelPackage#getPartialModel_Openworld()
	 * @model
	 * @generated
	 */
	boolean isOpenworld();

	/**
	 * Sets the value of the '{@link partialmodel.PartialModel#isOpenworld <em>Openworld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openworld</em>' attribute.
	 * @see #isOpenworld()
	 * @generated
	 */
	void setOpenworld(boolean value);

	/**
	 * Returns the value of the '<em><b>All Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link partialmodel.PSAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Attributes</em>' containment reference list.
	 * @see partialmodel.PartialmodelPackage#getPartialModel_AllAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSAttribute> getAllAttributes();

} // PartialModel
