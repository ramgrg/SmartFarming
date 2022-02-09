/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Controller Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getControllerAction()
 * @model
 * @generated
 */
public enum ControllerAction implements Enumerator {
	/**
	 * The '<em><b>Increase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASE_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASE(1, "Increase", "Increase"),

	/**
	 * The '<em><b>Decrease</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASE_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASE(2, "Decrease", "Decrease"),

	/**
	 * The '<em><b>ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_VALUE
	 * @generated
	 * @ordered
	 */
	ON(3, "ON", "ON"),

	/**
	 * The '<em><b>OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(4, "OFF", "OFF"),

	/**
	 * The '<em><b>Alert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	ALERT(5, "Alert", "Alert");

	/**
	 * The '<em><b>Increase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASE
	 * @model name="Increase"
	 * @generated
	 * @ordered
	 */
	public static final int INCREASE_VALUE = 1;

	/**
	 * The '<em><b>Decrease</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASE
	 * @model name="Decrease"
	 * @generated
	 * @ordered
	 */
	public static final int DECREASE_VALUE = 2;

	/**
	 * The '<em><b>ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_VALUE = 3;

	/**
	 * The '<em><b>OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 4;

	/**
	 * The '<em><b>Alert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALERT
	 * @model name="Alert"
	 * @generated
	 * @ordered
	 */
	public static final int ALERT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Controller Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControllerAction[] VALUES_ARRAY = new ControllerAction[] { INCREASE, DECREASE, ON, OFF,
			ALERT, };

	/**
	 * A public read-only list of all the '<em><b>Controller Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControllerAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Controller Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControllerAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControllerAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Controller Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControllerAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControllerAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Controller Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControllerAction get(int value) {
		switch (value) {
		case INCREASE_VALUE:
			return INCREASE;
		case DECREASE_VALUE:
			return DECREASE;
		case ON_VALUE:
			return ON;
		case OFF_VALUE:
			return OFF;
		case ALERT_VALUE:
			return ALERT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ControllerAction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ControllerAction
