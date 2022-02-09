/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getControlType()
 * @model
 * @generated
 */
public enum ControlType implements Enumerator {
	/**
	 * The '<em><b>Air Conditioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_CONDITIONER(1, "AirConditioner", "AirConditioner"),

	/**
	 * The '<em><b>Nutrient Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRIENT_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRIENT_CONTROLLER(2, "NutrientController", "NutrientController"),

	/**
	 * The '<em><b>LED Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	LED_CONTROLLER(3, "LEDController", "LEDController"),

	/**
	 * The '<em><b>Oxygen Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OXYGEN_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	OXYGEN_CONTROLLER(4, "OxygenController", "OxygenController"),

	/**
	 * The '<em><b>CO2 Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CO2_CONTROLLER(5, "CO2Controller", "CO2Controller");

	/**
	 * The '<em><b>Air Conditioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDITIONER
	 * @model name="AirConditioner"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_CONDITIONER_VALUE = 1;

	/**
	 * The '<em><b>Nutrient Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRIENT_CONTROLLER
	 * @model name="NutrientController"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRIENT_CONTROLLER_VALUE = 2;

	/**
	 * The '<em><b>LED Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_CONTROLLER
	 * @model name="LEDController"
	 * @generated
	 * @ordered
	 */
	public static final int LED_CONTROLLER_VALUE = 3;

	/**
	 * The '<em><b>Oxygen Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OXYGEN_CONTROLLER
	 * @model name="OxygenController"
	 * @generated
	 * @ordered
	 */
	public static final int OXYGEN_CONTROLLER_VALUE = 4;

	/**
	 * The '<em><b>CO2 Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_CONTROLLER
	 * @model name="CO2Controller"
	 * @generated
	 * @ordered
	 */
	public static final int CO2_CONTROLLER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlType[] VALUES_ARRAY = new ControlType[] { AIR_CONDITIONER, NUTRIENT_CONTROLLER,
			LED_CONTROLLER, OXYGEN_CONTROLLER, CO2_CONTROLLER, };

	/**
	 * A public read-only list of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(int value) {
		switch (value) {
		case AIR_CONDITIONER_VALUE:
			return AIR_CONDITIONER;
		case NUTRIENT_CONTROLLER_VALUE:
			return NUTRIENT_CONTROLLER;
		case LED_CONTROLLER_VALUE:
			return LED_CONTROLLER;
		case OXYGEN_CONTROLLER_VALUE:
			return OXYGEN_CONTROLLER;
		case CO2_CONTROLLER_VALUE:
			return CO2_CONTROLLER;
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
	private ControlType(int value, String name, String literal) {
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

} //ControlType
