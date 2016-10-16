/**
 */
package partialmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see partialmodel.PartialmodelFactory
 * @model kind="package"
 * @generated
 */
public interface PartialmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partialmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/partialmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partialmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartialmodelPackage eINSTANCE = partialmodel.impl.PartialmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link partialmodel.impl.PartialModelImpl <em>Partial Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PartialModelImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPartialModel()
	 * @generated
	 */
	int PARTIAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Openworld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL__OPENWORLD = 1;

	/**
	 * The feature id for the '<em><b>All Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL__ALL_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Partial Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Partial Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSReferenceImpl <em>PS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSReferenceImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReference()
	 * @generated
	 */
	int PS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE__PS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE__REFERRED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE__SOURCE_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>PS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSObjectImpl <em>PS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSObjectImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSObject()
	 * @generated
	 */
	int PS_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__REFS = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__TYPE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__PS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Package Ns Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__PACKAGE_NS_URI = 4;

	/**
	 * The feature id for the '<em><b>Referred EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__REFERRED_ECLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT__NAME = 6;

	/**
	 * The number of structural features of the '<em>PS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>PS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSAttributeImpl <em>PS Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSAttributeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSAttribute()
	 * @generated
	 */
	int PS_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_ATTRIBUTE__PS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>PS Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PS Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSTypeImpl <em>PS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSTypeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSType()
	 * @generated
	 */
	int PS_TYPE = 4;

	/**
	 * The number of structural features of the '<em>PS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.VarTypeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ANNOTATION = PS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = PS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_OPERATION_COUNT = PS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.MayTypeImpl <em>May Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.MayTypeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getMayType()
	 * @generated
	 */
	int MAY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_TYPE__ANNOTATION = PS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>May Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_TYPE_FEATURE_COUNT = PS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>May Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_TYPE_OPERATION_COUNT = PS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.AbsTypeImpl <em>Abs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.AbsTypeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getAbsType()
	 * @generated
	 */
	int ABS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_TYPE__ANNOTATION = PS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_TYPE_FEATURE_COUNT = PS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_TYPE_OPERATION_COUNT = PS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSStringImpl <em>PS String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSStringImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSString()
	 * @generated
	 */
	int PS_STRING = 8;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_STRING__PS_TYPE = PS_ATTRIBUTE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_STRING__TYPE = PS_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_STRING__VALUE = PS_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_STRING_FEATURE_COUNT = PS_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_STRING_OPERATION_COUNT = PS_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSIntegerImpl <em>PS Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSIntegerImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSInteger()
	 * @generated
	 */
	int PS_INTEGER = 9;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_INTEGER__PS_TYPE = PS_ATTRIBUTE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_INTEGER__TYPE = PS_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_INTEGER__VALUE = PS_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_INTEGER_FEATURE_COUNT = PS_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_INTEGER_OPERATION_COUNT = PS_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSBooleanImpl <em>PS Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSBooleanImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSBoolean()
	 * @generated
	 */
	int PS_BOOLEAN = 10;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_BOOLEAN__PS_TYPE = PS_ATTRIBUTE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_BOOLEAN__TYPE = PS_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_BOOLEAN__VALUE = PS_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_BOOLEAN_FEATURE_COUNT = PS_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_BOOLEAN_OPERATION_COUNT = PS_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSOtherAttributeImpl <em>PS Other Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSOtherAttributeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSOtherAttribute()
	 * @generated
	 */
	int PS_OTHER_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OTHER_ATTRIBUTE__PS_TYPE = PS_ATTRIBUTE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OTHER_ATTRIBUTE__TYPE = PS_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Reffered Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OTHER_ATTRIBUTE__REFFERED_CLASS = PS_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS Other Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OTHER_ATTRIBUTE_FEATURE_COUNT = PS_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS Other Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_OTHER_ATTRIBUTE_OPERATION_COUNT = PS_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSReferenceToObjectImpl <em>PS Reference To Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSReferenceToObjectImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReferenceToObject()
	 * @generated
	 */
	int PS_REFERENCE_TO_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__TYPE = PS_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__PS_TYPE = PS_REFERENCE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__REFERRED_CLASS = PS_REFERENCE__REFERRED_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__NAME = PS_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__SOURCE_OBJECT = PS_REFERENCE__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT__TARGET_OBJECT = PS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS Reference To Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT_FEATURE_COUNT = PS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS Reference To Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_OBJECT_OPERATION_COUNT = PS_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.impl.PSReferenceToAttributeImpl <em>PS Reference To Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.impl.PSReferenceToAttributeImpl
	 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReferenceToAttribute()
	 * @generated
	 */
	int PS_REFERENCE_TO_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__TYPE = PS_REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ps Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__PS_TYPE = PS_REFERENCE__PS_TYPE;

	/**
	 * The feature id for the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__REFERRED_CLASS = PS_REFERENCE__REFERRED_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__NAME = PS_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__SOURCE_OBJECT = PS_REFERENCE__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE = PS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PS Reference To Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE_FEATURE_COUNT = PS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PS Reference To Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_REFERENCE_TO_ATTRIBUTE_OPERATION_COUNT = PS_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link partialmodel.May <em>May</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.May
	 * @see partialmodel.impl.PartialmodelPackageImpl#getMay()
	 * @generated
	 */
	int MAY = 14;

	/**
	 * The meta object id for the '{@link partialmodel.Abs <em>Abs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.Abs
	 * @see partialmodel.impl.PartialmodelPackageImpl#getAbs()
	 * @generated
	 */
	int ABS = 15;

	/**
	 * The meta object id for the '{@link partialmodel.Var <em>Var</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see partialmodel.Var
	 * @see partialmodel.impl.PartialmodelPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 16;


	/**
	 * Returns the meta object for class '{@link partialmodel.PartialModel <em>Partial Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Model</em>'.
	 * @see partialmodel.PartialModel
	 * @generated
	 */
	EClass getPartialModel();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PartialModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see partialmodel.PartialModel#getObjects()
	 * @see #getPartialModel()
	 * @generated
	 */
	EReference getPartialModel_Objects();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PartialModel#isOpenworld <em>Openworld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openworld</em>'.
	 * @see partialmodel.PartialModel#isOpenworld()
	 * @see #getPartialModel()
	 * @generated
	 */
	EAttribute getPartialModel_Openworld();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PartialModel#getAllAttributes <em>All Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Attributes</em>'.
	 * @see partialmodel.PartialModel#getAllAttributes()
	 * @see #getPartialModel()
	 * @generated
	 */
	EReference getPartialModel_AllAttributes();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSReference <em>PS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Reference</em>'.
	 * @see partialmodel.PSReference
	 * @generated
	 */
	EClass getPSReference();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see partialmodel.PSReference#getType()
	 * @see #getPSReference()
	 * @generated
	 */
	EAttribute getPSReference_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PSReference#getPsType <em>Ps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ps Type</em>'.
	 * @see partialmodel.PSReference#getPsType()
	 * @see #getPSReference()
	 * @generated
	 */
	EReference getPSReference_PsType();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSReference#getReferredClass <em>Referred Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Class</em>'.
	 * @see partialmodel.PSReference#getReferredClass()
	 * @see #getPSReference()
	 * @generated
	 */
	EReference getPSReference_ReferredClass();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see partialmodel.PSReference#getName()
	 * @see #getPSReference()
	 * @generated
	 */
	EAttribute getPSReference_Name();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSReference#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see partialmodel.PSReference#getSourceObject()
	 * @see #getPSReference()
	 * @generated
	 */
	EReference getPSReference_SourceObject();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSObject <em>PS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Object</em>'.
	 * @see partialmodel.PSObject
	 * @generated
	 */
	EClass getPSObject();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PSObject#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs</em>'.
	 * @see partialmodel.PSObject#getRefs()
	 * @see #getPSObject()
	 * @generated
	 */
	EReference getPSObject_Refs();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PSObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see partialmodel.PSObject#getAttributes()
	 * @see #getPSObject()
	 * @generated
	 */
	EReference getPSObject_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSObject#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see partialmodel.PSObject#getTypeName()
	 * @see #getPSObject()
	 * @generated
	 */
	EAttribute getPSObject_TypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PSObject#getPsType <em>Ps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ps Type</em>'.
	 * @see partialmodel.PSObject#getPsType()
	 * @see #getPSObject()
	 * @generated
	 */
	EReference getPSObject_PsType();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSObject#getPackageNsUri <em>Package Ns Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Ns Uri</em>'.
	 * @see partialmodel.PSObject#getPackageNsUri()
	 * @see #getPSObject()
	 * @generated
	 */
	EAttribute getPSObject_PackageNsUri();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSObject#getReferredEClass <em>Referred EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred EClass</em>'.
	 * @see partialmodel.PSObject#getReferredEClass()
	 * @see #getPSObject()
	 * @generated
	 */
	EReference getPSObject_ReferredEClass();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see partialmodel.PSObject#getName()
	 * @see #getPSObject()
	 * @generated
	 */
	EAttribute getPSObject_Name();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSAttribute <em>PS Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Attribute</em>'.
	 * @see partialmodel.PSAttribute
	 * @generated
	 */
	EClass getPSAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link partialmodel.PSAttribute#getPsType <em>Ps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ps Type</em>'.
	 * @see partialmodel.PSAttribute#getPsType()
	 * @see #getPSAttribute()
	 * @generated
	 */
	EReference getPSAttribute_PsType();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see partialmodel.PSAttribute#getType()
	 * @see #getPSAttribute()
	 * @generated
	 */
	EAttribute getPSAttribute_Type();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSType <em>PS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Type</em>'.
	 * @see partialmodel.PSType
	 * @generated
	 */
	EClass getPSType();

	/**
	 * Returns the meta object for class '{@link partialmodel.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see partialmodel.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.VarType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see partialmodel.VarType#getAnnotation()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Annotation();

	/**
	 * Returns the meta object for class '{@link partialmodel.MayType <em>May Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>May Type</em>'.
	 * @see partialmodel.MayType
	 * @generated
	 */
	EClass getMayType();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.MayType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see partialmodel.MayType#getAnnotation()
	 * @see #getMayType()
	 * @generated
	 */
	EAttribute getMayType_Annotation();

	/**
	 * Returns the meta object for class '{@link partialmodel.AbsType <em>Abs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Type</em>'.
	 * @see partialmodel.AbsType
	 * @generated
	 */
	EClass getAbsType();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.AbsType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see partialmodel.AbsType#getAnnotation()
	 * @see #getAbsType()
	 * @generated
	 */
	EAttribute getAbsType_Annotation();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSString <em>PS String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS String</em>'.
	 * @see partialmodel.PSString
	 * @generated
	 */
	EClass getPSString();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see partialmodel.PSString#getValue()
	 * @see #getPSString()
	 * @generated
	 */
	EAttribute getPSString_Value();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSInteger <em>PS Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Integer</em>'.
	 * @see partialmodel.PSInteger
	 * @generated
	 */
	EClass getPSInteger();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see partialmodel.PSInteger#getValue()
	 * @see #getPSInteger()
	 * @generated
	 */
	EAttribute getPSInteger_Value();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSBoolean <em>PS Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Boolean</em>'.
	 * @see partialmodel.PSBoolean
	 * @generated
	 */
	EClass getPSBoolean();

	/**
	 * Returns the meta object for the attribute '{@link partialmodel.PSBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see partialmodel.PSBoolean#isValue()
	 * @see #getPSBoolean()
	 * @generated
	 */
	EAttribute getPSBoolean_Value();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSOtherAttribute <em>PS Other Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Other Attribute</em>'.
	 * @see partialmodel.PSOtherAttribute
	 * @generated
	 */
	EClass getPSOtherAttribute();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSOtherAttribute#getRefferedClass <em>Reffered Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reffered Class</em>'.
	 * @see partialmodel.PSOtherAttribute#getRefferedClass()
	 * @see #getPSOtherAttribute()
	 * @generated
	 */
	EReference getPSOtherAttribute_RefferedClass();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSReferenceToObject <em>PS Reference To Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Reference To Object</em>'.
	 * @see partialmodel.PSReferenceToObject
	 * @generated
	 */
	EClass getPSReferenceToObject();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSReferenceToObject#getTargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Object</em>'.
	 * @see partialmodel.PSReferenceToObject#getTargetObject()
	 * @see #getPSReferenceToObject()
	 * @generated
	 */
	EReference getPSReferenceToObject_TargetObject();

	/**
	 * Returns the meta object for class '{@link partialmodel.PSReferenceToAttribute <em>PS Reference To Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Reference To Attribute</em>'.
	 * @see partialmodel.PSReferenceToAttribute
	 * @generated
	 */
	EClass getPSReferenceToAttribute();

	/**
	 * Returns the meta object for the reference '{@link partialmodel.PSReferenceToAttribute#getTargetAttribute <em>Target Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Attribute</em>'.
	 * @see partialmodel.PSReferenceToAttribute#getTargetAttribute()
	 * @see #getPSReferenceToAttribute()
	 * @generated
	 */
	EReference getPSReferenceToAttribute_TargetAttribute();

	/**
	 * Returns the meta object for enum '{@link partialmodel.May <em>May</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>May</em>'.
	 * @see partialmodel.May
	 * @generated
	 */
	EEnum getMay();

	/**
	 * Returns the meta object for enum '{@link partialmodel.Abs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abs</em>'.
	 * @see partialmodel.Abs
	 * @generated
	 */
	EEnum getAbs();

	/**
	 * Returns the meta object for enum '{@link partialmodel.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var</em>'.
	 * @see partialmodel.Var
	 * @generated
	 */
	EEnum getVar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartialmodelFactory getPartialmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link partialmodel.impl.PartialModelImpl <em>Partial Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PartialModelImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPartialModel()
		 * @generated
		 */
		EClass PARTIAL_MODEL = eINSTANCE.getPartialModel();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_MODEL__OBJECTS = eINSTANCE.getPartialModel_Objects();

		/**
		 * The meta object literal for the '<em><b>Openworld</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_MODEL__OPENWORLD = eINSTANCE.getPartialModel_Openworld();

		/**
		 * The meta object literal for the '<em><b>All Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_MODEL__ALL_ATTRIBUTES = eINSTANCE.getPartialModel_AllAttributes();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSReferenceImpl <em>PS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSReferenceImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReference()
		 * @generated
		 */
		EClass PS_REFERENCE = eINSTANCE.getPSReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_REFERENCE__TYPE = eINSTANCE.getPSReference_Type();

		/**
		 * The meta object literal for the '<em><b>Ps Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_REFERENCE__PS_TYPE = eINSTANCE.getPSReference_PsType();

		/**
		 * The meta object literal for the '<em><b>Referred Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_REFERENCE__REFERRED_CLASS = eINSTANCE.getPSReference_ReferredClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_REFERENCE__NAME = eINSTANCE.getPSReference_Name();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_REFERENCE__SOURCE_OBJECT = eINSTANCE.getPSReference_SourceObject();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSObjectImpl <em>PS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSObjectImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSObject()
		 * @generated
		 */
		EClass PS_OBJECT = eINSTANCE.getPSObject();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_OBJECT__REFS = eINSTANCE.getPSObject_Refs();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_OBJECT__ATTRIBUTES = eINSTANCE.getPSObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_OBJECT__TYPE_NAME = eINSTANCE.getPSObject_TypeName();

		/**
		 * The meta object literal for the '<em><b>Ps Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_OBJECT__PS_TYPE = eINSTANCE.getPSObject_PsType();

		/**
		 * The meta object literal for the '<em><b>Package Ns Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_OBJECT__PACKAGE_NS_URI = eINSTANCE.getPSObject_PackageNsUri();

		/**
		 * The meta object literal for the '<em><b>Referred EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_OBJECT__REFERRED_ECLASS = eINSTANCE.getPSObject_ReferredEClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_OBJECT__NAME = eINSTANCE.getPSObject_Name();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSAttributeImpl <em>PS Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSAttributeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSAttribute()
		 * @generated
		 */
		EClass PS_ATTRIBUTE = eINSTANCE.getPSAttribute();

		/**
		 * The meta object literal for the '<em><b>Ps Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_ATTRIBUTE__PS_TYPE = eINSTANCE.getPSAttribute_PsType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_ATTRIBUTE__TYPE = eINSTANCE.getPSAttribute_Type();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSTypeImpl <em>PS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSTypeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSType()
		 * @generated
		 */
		EClass PS_TYPE = eINSTANCE.getPSType();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.VarTypeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__ANNOTATION = eINSTANCE.getVarType_Annotation();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.MayTypeImpl <em>May Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.MayTypeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getMayType()
		 * @generated
		 */
		EClass MAY_TYPE = eINSTANCE.getMayType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAY_TYPE__ANNOTATION = eINSTANCE.getMayType_Annotation();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.AbsTypeImpl <em>Abs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.AbsTypeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getAbsType()
		 * @generated
		 */
		EClass ABS_TYPE = eINSTANCE.getAbsType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_TYPE__ANNOTATION = eINSTANCE.getAbsType_Annotation();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSStringImpl <em>PS String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSStringImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSString()
		 * @generated
		 */
		EClass PS_STRING = eINSTANCE.getPSString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_STRING__VALUE = eINSTANCE.getPSString_Value();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSIntegerImpl <em>PS Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSIntegerImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSInteger()
		 * @generated
		 */
		EClass PS_INTEGER = eINSTANCE.getPSInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_INTEGER__VALUE = eINSTANCE.getPSInteger_Value();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSBooleanImpl <em>PS Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSBooleanImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSBoolean()
		 * @generated
		 */
		EClass PS_BOOLEAN = eINSTANCE.getPSBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_BOOLEAN__VALUE = eINSTANCE.getPSBoolean_Value();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSOtherAttributeImpl <em>PS Other Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSOtherAttributeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSOtherAttribute()
		 * @generated
		 */
		EClass PS_OTHER_ATTRIBUTE = eINSTANCE.getPSOtherAttribute();

		/**
		 * The meta object literal for the '<em><b>Reffered Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_OTHER_ATTRIBUTE__REFFERED_CLASS = eINSTANCE.getPSOtherAttribute_RefferedClass();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSReferenceToObjectImpl <em>PS Reference To Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSReferenceToObjectImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReferenceToObject()
		 * @generated
		 */
		EClass PS_REFERENCE_TO_OBJECT = eINSTANCE.getPSReferenceToObject();

		/**
		 * The meta object literal for the '<em><b>Target Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_REFERENCE_TO_OBJECT__TARGET_OBJECT = eINSTANCE.getPSReferenceToObject_TargetObject();

		/**
		 * The meta object literal for the '{@link partialmodel.impl.PSReferenceToAttributeImpl <em>PS Reference To Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.impl.PSReferenceToAttributeImpl
		 * @see partialmodel.impl.PartialmodelPackageImpl#getPSReferenceToAttribute()
		 * @generated
		 */
		EClass PS_REFERENCE_TO_ATTRIBUTE = eINSTANCE.getPSReferenceToAttribute();

		/**
		 * The meta object literal for the '<em><b>Target Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE = eINSTANCE.getPSReferenceToAttribute_TargetAttribute();

		/**
		 * The meta object literal for the '{@link partialmodel.May <em>May</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.May
		 * @see partialmodel.impl.PartialmodelPackageImpl#getMay()
		 * @generated
		 */
		EEnum MAY = eINSTANCE.getMay();

		/**
		 * The meta object literal for the '{@link partialmodel.Abs <em>Abs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.Abs
		 * @see partialmodel.impl.PartialmodelPackageImpl#getAbs()
		 * @generated
		 */
		EEnum ABS = eINSTANCE.getAbs();

		/**
		 * The meta object literal for the '{@link partialmodel.Var <em>Var</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see partialmodel.Var
		 * @see partialmodel.impl.PartialmodelPackageImpl#getVar()
		 * @generated
		 */
		EEnum VAR = eINSTANCE.getVar();

	}

} //PartialmodelPackage
