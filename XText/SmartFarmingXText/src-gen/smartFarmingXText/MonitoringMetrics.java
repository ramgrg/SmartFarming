/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Metrics</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoringMetrics()
 * @model
 * @generated
 */
public enum MonitoringMetrics implements Enumerator {
	/**
	 * The '<em><b>Nutrient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRIENT_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRIENT(1, "Nutrient", "Nutrient"),

	/**
	 * The '<em><b>Photo Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTO_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTO_SYNTHESIS(2, "PhotoSynthesis", "PhotoSynthesis"),

	/**
	 * The '<em><b>Environmental Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTAL_SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENTAL_SAFETY(3, "EnvironmentalSafety", "EnvironmentalSafety");

	/**
	 * The '<em><b>Nutrient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRIENT
	 * @model name="Nutrient"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRIENT_VALUE = 1;

	/**
	 * The '<em><b>Photo Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTO_SYNTHESIS
	 * @model name="PhotoSynthesis"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTO_SYNTHESIS_VALUE = 2;

	/**
	 * The '<em><b>Environmental Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTAL_SAFETY
	 * @model name="EnvironmentalSafety"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENTAL_SAFETY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Monitoring Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringMetrics[] VALUES_ARRAY = new MonitoringMetrics[] { NUTRIENT, PHOTO_SYNTHESIS,
			ENVIRONMENTAL_SAFETY, };

	/**
	 * A public read-only list of all the '<em><b>Monitoring Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringMetrics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Metrics</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMetrics get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringMetrics result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Metrics</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMetrics getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringMetrics result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Metrics</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringMetrics get(int value) {
		switch (value) {
		case NUTRIENT_VALUE:
			return NUTRIENT;
		case PHOTO_SYNTHESIS_VALUE:
			return PHOTO_SYNTHESIS;
		case ENVIRONMENTAL_SAFETY_VALUE:
			return ENVIRONMENTAL_SAFETY;
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
	private MonitoringMetrics(int value, String name, String literal) {
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

} //MonitoringMetrics
