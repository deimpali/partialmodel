/**
 */
package partialmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import partialmodel.Abs;
import partialmodel.AbsType;
import partialmodel.May;
import partialmodel.MayType;
import partialmodel.PSAttribute;
import partialmodel.PSBoolean;
import partialmodel.PSInteger;
import partialmodel.PSObject;
import partialmodel.PSOtherAttribute;
import partialmodel.PSReference;
import partialmodel.PSReferenceToAttribute;
import partialmodel.PSReferenceToObject;
import partialmodel.PSString;
import partialmodel.PSType;
import partialmodel.PartialModel;
import partialmodel.PartialmodelFactory;
import partialmodel.PartialmodelPackage;
import partialmodel.Var;
import partialmodel.VarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartialmodelPackageImpl extends EPackageImpl implements PartialmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psOtherAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psReferenceToObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psReferenceToAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum absEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see partialmodel.PartialmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartialmodelPackageImpl() {
		super(eNS_URI, PartialmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PartialmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartialmodelPackage init() {
		if (isInited) return (PartialmodelPackage)EPackage.Registry.INSTANCE.getEPackage(PartialmodelPackage.eNS_URI);

		// Obtain or create and register package
		PartialmodelPackageImpl thePartialmodelPackage = (PartialmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartialmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PartialmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePartialmodelPackage.createPackageContents();

		// Initialize created meta-data
		thePartialmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartialmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartialmodelPackage.eNS_URI, thePartialmodelPackage);
		return thePartialmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialModel() {
		return partialModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialModel_Objects() {
		return (EReference)partialModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialModel_Openworld() {
		return (EAttribute)partialModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialModel_AllAttributes() {
		return (EReference)partialModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSReference() {
		return psReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSReference_Type() {
		return (EAttribute)psReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSReference_PsType() {
		return (EReference)psReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSReference_ReferredClass() {
		return (EReference)psReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSReference_Name() {
		return (EAttribute)psReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSReference_SourceObject() {
		return (EReference)psReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSObject() {
		return psObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSObject_Refs() {
		return (EReference)psObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSObject_Attributes() {
		return (EReference)psObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSObject_TypeName() {
		return (EAttribute)psObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSObject_PsType() {
		return (EReference)psObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSObject_PackageNsUri() {
		return (EAttribute)psObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSObject_ReferredEClass() {
		return (EReference)psObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSObject_Name() {
		return (EAttribute)psObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSAttribute() {
		return psAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSAttribute_PsType() {
		return (EReference)psAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSAttribute_Type() {
		return (EAttribute)psAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSType() {
		return psTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarType() {
		return varTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Annotation() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMayType() {
		return mayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMayType_Annotation() {
		return (EAttribute)mayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsType() {
		return absTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsType_Annotation() {
		return (EAttribute)absTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSString() {
		return psStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSString_Value() {
		return (EAttribute)psStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSInteger() {
		return psIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSInteger_Value() {
		return (EAttribute)psIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSBoolean() {
		return psBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSBoolean_Value() {
		return (EAttribute)psBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSOtherAttribute() {
		return psOtherAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSOtherAttribute_RefferedClass() {
		return (EReference)psOtherAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSReferenceToObject() {
		return psReferenceToObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSReferenceToObject_TargetObject() {
		return (EReference)psReferenceToObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSReferenceToAttribute() {
		return psReferenceToAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSReferenceToAttribute_TargetAttribute() {
		return (EReference)psReferenceToAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMay() {
		return mayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbs() {
		return absEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVar() {
		return varEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelFactory getPartialmodelFactory() {
		return (PartialmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		partialModelEClass = createEClass(PARTIAL_MODEL);
		createEReference(partialModelEClass, PARTIAL_MODEL__OBJECTS);
		createEAttribute(partialModelEClass, PARTIAL_MODEL__OPENWORLD);
		createEReference(partialModelEClass, PARTIAL_MODEL__ALL_ATTRIBUTES);

		psReferenceEClass = createEClass(PS_REFERENCE);
		createEAttribute(psReferenceEClass, PS_REFERENCE__TYPE);
		createEReference(psReferenceEClass, PS_REFERENCE__PS_TYPE);
		createEReference(psReferenceEClass, PS_REFERENCE__REFERRED_CLASS);
		createEAttribute(psReferenceEClass, PS_REFERENCE__NAME);
		createEReference(psReferenceEClass, PS_REFERENCE__SOURCE_OBJECT);

		psObjectEClass = createEClass(PS_OBJECT);
		createEReference(psObjectEClass, PS_OBJECT__REFS);
		createEReference(psObjectEClass, PS_OBJECT__ATTRIBUTES);
		createEAttribute(psObjectEClass, PS_OBJECT__TYPE_NAME);
		createEReference(psObjectEClass, PS_OBJECT__PS_TYPE);
		createEAttribute(psObjectEClass, PS_OBJECT__PACKAGE_NS_URI);
		createEReference(psObjectEClass, PS_OBJECT__REFERRED_ECLASS);
		createEAttribute(psObjectEClass, PS_OBJECT__NAME);

		psAttributeEClass = createEClass(PS_ATTRIBUTE);
		createEReference(psAttributeEClass, PS_ATTRIBUTE__PS_TYPE);
		createEAttribute(psAttributeEClass, PS_ATTRIBUTE__TYPE);

		psTypeEClass = createEClass(PS_TYPE);

		varTypeEClass = createEClass(VAR_TYPE);
		createEAttribute(varTypeEClass, VAR_TYPE__ANNOTATION);

		mayTypeEClass = createEClass(MAY_TYPE);
		createEAttribute(mayTypeEClass, MAY_TYPE__ANNOTATION);

		absTypeEClass = createEClass(ABS_TYPE);
		createEAttribute(absTypeEClass, ABS_TYPE__ANNOTATION);

		psStringEClass = createEClass(PS_STRING);
		createEAttribute(psStringEClass, PS_STRING__VALUE);

		psIntegerEClass = createEClass(PS_INTEGER);
		createEAttribute(psIntegerEClass, PS_INTEGER__VALUE);

		psBooleanEClass = createEClass(PS_BOOLEAN);
		createEAttribute(psBooleanEClass, PS_BOOLEAN__VALUE);

		psOtherAttributeEClass = createEClass(PS_OTHER_ATTRIBUTE);
		createEReference(psOtherAttributeEClass, PS_OTHER_ATTRIBUTE__REFFERED_CLASS);

		psReferenceToObjectEClass = createEClass(PS_REFERENCE_TO_OBJECT);
		createEReference(psReferenceToObjectEClass, PS_REFERENCE_TO_OBJECT__TARGET_OBJECT);

		psReferenceToAttributeEClass = createEClass(PS_REFERENCE_TO_ATTRIBUTE);
		createEReference(psReferenceToAttributeEClass, PS_REFERENCE_TO_ATTRIBUTE__TARGET_ATTRIBUTE);

		// Create enums
		mayEEnum = createEEnum(MAY);
		absEEnum = createEEnum(ABS);
		varEEnum = createEEnum(VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		varTypeEClass.getESuperTypes().add(this.getPSType());
		mayTypeEClass.getESuperTypes().add(this.getPSType());
		absTypeEClass.getESuperTypes().add(this.getPSType());
		psStringEClass.getESuperTypes().add(this.getPSAttribute());
		psIntegerEClass.getESuperTypes().add(this.getPSAttribute());
		psBooleanEClass.getESuperTypes().add(this.getPSAttribute());
		psOtherAttributeEClass.getESuperTypes().add(this.getPSAttribute());
		psReferenceToObjectEClass.getESuperTypes().add(this.getPSReference());
		psReferenceToAttributeEClass.getESuperTypes().add(this.getPSReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(partialModelEClass, PartialModel.class, "PartialModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialModel_Objects(), this.getPSObject(), null, "objects", null, 0, -1, PartialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialModel_Openworld(), theEcorePackage.getEBoolean(), "openworld", null, 0, 1, PartialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialModel_AllAttributes(), this.getPSAttribute(), null, "AllAttributes", null, 0, -1, PartialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psReferenceEClass, PSReference.class, "PSReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSReference_Type(), ecorePackage.getEString(), "type", null, 0, 1, PSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSReference_PsType(), this.getPSType(), null, "psType", null, 0, 3, PSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSReference_ReferredClass(), theEcorePackage.getEClass(), null, "referredClass", null, 0, 1, PSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, PSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSReference_SourceObject(), this.getPSObject(), null, "sourceObject", null, 0, 1, PSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psObjectEClass, PSObject.class, "PSObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSObject_Refs(), this.getPSReferenceToObject(), null, "refs", null, 0, -1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSObject_Attributes(), this.getPSReferenceToAttribute(), null, "attributes", null, 0, -1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSObject_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSObject_PsType(), this.getPSType(), null, "psType", null, 0, 3, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSObject_PackageNsUri(), ecorePackage.getEString(), "packageNsUri", null, 0, 1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSObject_ReferredEClass(), theEcorePackage.getEClass(), null, "referredEClass", null, 0, 1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSObject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psAttributeEClass, PSAttribute.class, "PSAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSAttribute_PsType(), this.getPSType(), null, "psType", null, 0, 3, PSAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, PSAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psTypeEClass, PSType.class, "PSType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarType_Annotation(), this.getVar(), "Annotation", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mayTypeEClass, MayType.class, "MayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMayType_Annotation(), this.getMay(), "Annotation", null, 0, 1, MayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absTypeEClass, AbsType.class, "AbsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsType_Annotation(), this.getAbs(), "Annotation", null, 0, 1, AbsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psStringEClass, PSString.class, "PSString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSString_Value(), ecorePackage.getEString(), "value", null, 0, 1, PSString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psIntegerEClass, PSInteger.class, "PSInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, PSInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psBooleanEClass, PSBoolean.class, "PSBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, PSBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psOtherAttributeEClass, PSOtherAttribute.class, "PSOtherAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSOtherAttribute_RefferedClass(), theEcorePackage.getEClass(), null, "refferedClass", null, 0, 1, PSOtherAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psReferenceToObjectEClass, PSReferenceToObject.class, "PSReferenceToObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSReferenceToObject_TargetObject(), this.getPSObject(), null, "targetObject", null, 0, 1, PSReferenceToObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psReferenceToAttributeEClass, PSReferenceToAttribute.class, "PSReferenceToAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSReferenceToAttribute_TargetAttribute(), this.getPSAttribute(), null, "targetAttribute", null, 0, 1, PSReferenceToAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mayEEnum, May.class, "May");
		addEEnumLiteral(mayEEnum, May.MAY_EXIST);
		addEEnumLiteral(mayEEnum, May.MUST_EXIST);

		initEEnum(absEEnum, Abs.class, "Abs");
		addEEnumLiteral(absEEnum, Abs.PARTICULAR);
		addEEnumLiteral(absEEnum, Abs.SET);

		initEEnum(varEEnum, Var.class, "Var");
		addEEnumLiteral(varEEnum, Var.CONSTANT);
		addEEnumLiteral(varEEnum, Var.VARIABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //PartialmodelPackageImpl
