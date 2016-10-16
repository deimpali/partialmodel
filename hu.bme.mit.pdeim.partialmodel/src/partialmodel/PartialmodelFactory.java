/**
 */
package partialmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see partialmodel.PartialmodelPackage
 * @generated
 */
public interface PartialmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartialmodelFactory eINSTANCE = partialmodel.impl.PartialmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Partial Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Model</em>'.
	 * @generated
	 */
	PartialModel createPartialModel();

	/**
	 * Returns a new object of class '<em>PS Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Object</em>'.
	 * @generated
	 */
	PSObject createPSObject();

	/**
	 * Returns a new object of class '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Type</em>'.
	 * @generated
	 */
	VarType createVarType();

	/**
	 * Returns a new object of class '<em>May Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>May Type</em>'.
	 * @generated
	 */
	MayType createMayType();

	/**
	 * Returns a new object of class '<em>Abs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abs Type</em>'.
	 * @generated
	 */
	AbsType createAbsType();

	/**
	 * Returns a new object of class '<em>PS String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS String</em>'.
	 * @generated
	 */
	PSString createPSString();

	/**
	 * Returns a new object of class '<em>PS Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Integer</em>'.
	 * @generated
	 */
	PSInteger createPSInteger();

	/**
	 * Returns a new object of class '<em>PS Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Boolean</em>'.
	 * @generated
	 */
	PSBoolean createPSBoolean();

	/**
	 * Returns a new object of class '<em>PS Other Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Other Attribute</em>'.
	 * @generated
	 */
	PSOtherAttribute createPSOtherAttribute();

	/**
	 * Returns a new object of class '<em>PS Reference To Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Reference To Object</em>'.
	 * @generated
	 */
	PSReferenceToObject createPSReferenceToObject();

	/**
	 * Returns a new object of class '<em>PS Reference To Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Reference To Attribute</em>'.
	 * @generated
	 */
	PSReferenceToAttribute createPSReferenceToAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PartialmodelPackage getPartialmodelPackage();

} //PartialmodelFactory
