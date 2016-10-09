/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.PSBoolean;
import partialmodel.PartialmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PS Boolean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSBooleanTest extends PSAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PSBooleanTest.class);
	}

	/**
	 * Constructs a new PS Boolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSBooleanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PS Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PSBoolean getFixture() {
		return (PSBoolean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createPSBoolean());
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

} //PSBooleanTest
