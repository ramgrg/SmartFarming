/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoringCondition()
 * @model
 * @generated
 */
public enum MonitoringCondition implements Enumerator {
	/**
	 * The '<em><b>Optimum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMUM(1, "Optimum", "Optimum"),

	/**
	 * The '<em><b>Healthy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHY_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHY(2, "Healthy", "Healthy"),

	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD(3, "Good", "Good"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(4, "Warning", "Warning"),

	/**
	 * The '<em><b>Danger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER_VALUE
	 * @generated
	 * @ordered
	 */
	DANGER(5, "Danger", "Danger"),

	/**
	 * The '<em><b>Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(0, "Invalid", "Invalid");

	/**
	 * The '<em><b>Optimum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMUM
	 * @model name="Optimum"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMUM_VALUE = 1;

	/**
	 * The '<em><b>Healthy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHY
	 * @model name="Healthy"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHY_VALUE = 2;

	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @model name="Good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_VALUE = 3;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model name="Warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 4;

	/**
	 * The '<em><b>Danger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER
	 * @model name="Danger"
	 * @generated
	 * @ordered
	 */
	public static final int DANGER_VALUE = 5;

	/**
	 * The '<em><b>Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID
	 * @model name="Invalid"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = 0;

	/**
	 * An array of all the '<em><b>Monitoring Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringCondition[] VALUES_ARRAY = new MonitoringCondition[] { OPTIMUM, HEALTHY, GOOD,
			WARNING, DANGER, INVALID, };

	/**
	 * A public read-only list of all the '<em><b>Monitoring Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringCondition get(int value) {
		switch (value) {
		case OPTIMUM_VALUE:
			return OPTIMUM;
		case HEALTHY_VALUE:
			return HEALTHY;
		case GOOD_VALUE:
			return GOOD;
		case WARNING_VALUE:
			return WARNING;
		case DANGER_VALUE:
			return DANGER;
		case INVALID_VALUE:
			return INVALID;
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
	private MonitoringCondition(int value, String name, String literal) {
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

} //MonitoringCondition
