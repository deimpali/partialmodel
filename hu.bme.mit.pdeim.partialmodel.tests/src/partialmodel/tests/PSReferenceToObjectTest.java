/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.PSReferenceToObject;
import partialmodel.PartialmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PS Reference To Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSReferenceToObjectTest extends PSReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PSReferenceToObjectTest.class);
	}

	/**
	 * Constructs a new PS Reference To Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSReferenceToObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PS Reference To Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PSReferenceToObject getFixture() {
		return (PSReferenceToObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createPSReferenceToObject());
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

} //PSReferenceToObjectTest
