/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(1, "Temperature", "Temperature"),

	/**
	 * The '<em><b>Humidity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	HUMIDITY(2, "Humidity", "Humidity"),

	/**
	 * The '<em><b>CO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_VALUE
	 * @generated
	 * @ordered
	 */
	CO2(3, "CO2", "CO2"),

	/**
	 * The '<em><b>Oxygen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OXYGEN_VALUE
	 * @generated
	 * @ordered
	 */
	OXYGEN(4, "Oxygen", "Oxygen"),

	/**
	 * The '<em><b>PH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_VALUE
	 * @generated
	 * @ordered
	 */
	PH(5, "PH", "PH"),

	/**
	 * The '<em><b>EC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EC_VALUE
	 * @generated
	 * @ordered
	 */
	EC(6, "EC", "EC"),

	/**
	 * The '<em><b>LED Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LED_LIGHT(7, "LEDLight", "LEDLight"),

	/**
	 * The '<em><b>Surveillance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEILLANCE(8, "Surveillance", "Surveillance");

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model name="Temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 1;

	/**
	 * The '<em><b>Humidity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY
	 * @model name="Humidity"
	 * @generated
	 * @ordered
	 */
	public static final int HUMIDITY_VALUE = 2;

	/**
	 * The '<em><b>CO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO2_VALUE = 3;

	/**
	 * The '<em><b>Oxygen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OXYGEN
	 * @model name="Oxygen"
	 * @generated
	 * @ordered
	 */
	public static final int OXYGEN_VALUE = 4;

	/**
	 * The '<em><b>PH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PH_VALUE = 5;

	/**
	 * The '<em><b>EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EC_VALUE = 6;

	/**
	 * The '<em><b>LED Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_LIGHT
	 * @model name="LEDLight"
	 * @generated
	 * @ordered
	 */
	public static final int LED_LIGHT_VALUE = 7;

	/**
	 * The '<em><b>Surveillance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE
	 * @model name="Surveillance"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEILLANCE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY = new SensorType[] { TEMPERATURE, HUMIDITY, CO2, OXYGEN, PH, EC,
			LED_LIGHT, SURVEILLANCE, };

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
		case TEMPERATURE_VALUE:
			return TEMPERATURE;
		case HUMIDITY_VALUE:
			return HUMIDITY;
		case CO2_VALUE:
			return CO2;
		case OXYGEN_VALUE:
			return OXYGEN;
		case PH_VALUE:
			return PH;
		case EC_VALUE:
			return EC;
		case LED_LIGHT_VALUE:
			return LED_LIGHT;
		case SURVEILLANCE_VALUE:
			return SURVEILLANCE;
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
	private SensorType(int value, String name, String literal) {
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

} //SensorType
