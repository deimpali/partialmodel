/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.Other;
import partialmodel.PartialmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OtherTest extends PSAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OtherTest.class);
	}

	/**
	 * Constructs a new Other test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Other test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Other getFixture() {
		return (Other)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createOther());
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

} //OtherTest