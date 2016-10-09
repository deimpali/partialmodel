/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.PartialmodelFactory;
import partialmodel.VarType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Var Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VarTypeTest extends PSTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VarTypeTest.class);
	}

	/**
	 * Constructs a new Var Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Var Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VarType getFixture() {
		return (VarType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createVarType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VarTypeTest
