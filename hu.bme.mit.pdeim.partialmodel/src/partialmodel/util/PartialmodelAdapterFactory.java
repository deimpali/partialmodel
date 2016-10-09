/**
 */
package partialmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import partialmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see partialmodel.PartialmodelPackage
 * @generated
 */
public class PartialmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartialmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PartialmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialmodelSwitch<Adapter> modelSwitch =
		new PartialmodelSwitch<Adapter>() {
			@Override
			public Adapter casePartialModel(PartialModel object) {
				return createPartialModelAdapter();
			}
			@Override
			public Adapter casePSReference(PSReference object) {
				return createPSReferenceAdapter();
			}
			@Override
			public Adapter casePSObject(PSObject object) {
				return createPSObjectAdapter();
			}
			@Override
			public Adapter casePSAttribute(PSAttribute object) {
				return createPSAttributeAdapter();
			}
			@Override
			public Adapter casePSType(PSType object) {
				return createPSTypeAdapter();
			}
			@Override
			public Adapter caseVarType(VarType object) {
				return createVarTypeAdapter();
			}
			@Override
			public Adapter caseMayType(MayType object) {
				return createMayTypeAdapter();
			}
			@Override
			public Adapter caseAbsType(AbsType object) {
				return createAbsTypeAdapter();
			}
			@Override
			public Adapter casePSString(PSString object) {
				return createPSStringAdapter();
			}
			@Override
			public Adapter casePSInteger(PSInteger object) {
				return createPSIntegerAdapter();
			}
			@Override
			public Adapter casePSBoolean(PSBoolean object) {
				return createPSBooleanAdapter();
			}
			@Override
			public Adapter caseOther(Other object) {
				return createOtherAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PartialModel <em>Partial Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PartialModel
	 * @generated
	 */
	public Adapter createPartialModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSReference <em>PS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSReference
	 * @generated
	 */
	public Adapter createPSReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSObject <em>PS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSObject
	 * @generated
	 */
	public Adapter createPSObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSAttribute <em>PS Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSAttribute
	 * @generated
	 */
	public Adapter createPSAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSType <em>PS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSType
	 * @generated
	 */
	public Adapter createPSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.VarType
	 * @generated
	 */
	public Adapter createVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.MayType <em>May Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.MayType
	 * @generated
	 */
	public Adapter createMayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.AbsType <em>Abs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.AbsType
	 * @generated
	 */
	public Adapter createAbsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSString <em>PS String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSString
	 * @generated
	 */
	public Adapter createPSStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSInteger <em>PS Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSInteger
	 * @generated
	 */
	public Adapter createPSIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.PSBoolean <em>PS Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.PSBoolean
	 * @generated
	 */
	public Adapter createPSBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link partialmodel.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see partialmodel.Other
	 * @generated
	 */
	public Adapter createOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PartialmodelAdapterFactory
