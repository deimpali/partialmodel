/**
 */
package partialmodel.tests;

import junit.textui.TestRunner;

import partialmodel.PSOtherAttribute;
import partialmodel.PartialmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PS Other Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSOtherAttributeTest extends PSAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PSOtherAttributeTest.class);
	}

	/**
	 * Constructs a new PS Other Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSOtherAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PS Other Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PSOtherAttribute getFixture() {
		return (PSOtherAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartialmodelFactory.eINSTANCE.createPSOtherAttribute());
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

} //PSOtherAttributeTest
