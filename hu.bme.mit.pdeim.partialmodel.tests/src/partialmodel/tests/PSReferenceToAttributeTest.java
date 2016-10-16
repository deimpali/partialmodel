/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.PSReferenceToAttribute;
import partialmodel.PartialmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PS Reference To Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSReferenceToAttributeTest extends PSReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PSReferenceToAttributeTest.class);
	}

	/**
	 * Constructs a new PS Reference To Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSReferenceToAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PS Reference To Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PSReferenceToAttribute getFixture() {
		return (PSReferenceToAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createPSReferenceToAttribute());
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

} //PSReferenceToAttributeTest
