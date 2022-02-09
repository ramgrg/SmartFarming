/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Crop Group</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getCropGroup()
 * @model
 * @generated
 */
public enum CropGroup implements Enumerator {
	/**
	 * The '<em><b>Vegetable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETABLE(1, "Vegetable", "Vegetable"),

	/**
	 * The '<em><b>Fruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT_VALUE
	 * @generated
	 * @ordered
	 */
	FRUIT(2, "Fruit", "Fruit"),

	/**
	 * The '<em><b>Flower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWER_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWER(3, "Flower", "Flower"),

	/**
	 * The '<em><b>Tubers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUBERS_VALUE
	 * @generated
	 * @ordered
	 */
	TUBERS(4, "Tubers", "Tubers");

	/**
	 * The '<em><b>Vegetable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETABLE
	 * @model name="Vegetable"
	 * @generated
	 * @ordered
	 */
	public static final int VEGETABLE_VALUE = 1;

	/**
	 * The '<em><b>Fruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT
	 * @model name="Fruit"
	 * @generated
	 * @ordered
	 */
	public static final int FRUIT_VALUE = 2;

	/**
	 * The '<em><b>Flower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWER
	 * @model name="Flower"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWER_VALUE = 3;

	/**
	 * The '<em><b>Tubers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUBERS
	 * @model name="Tubers"
	 * @generated
	 * @ordered
	 */
	public static final int TUBERS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Crop Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CropGroup[] VALUES_ARRAY = new CropGroup[] { VEGETABLE, FRUIT, FLOWER, TUBERS, };

	/**
	 * A public read-only list of all the '<em><b>Crop Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CropGroup> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crop Group</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CropGroup get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CropGroup result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crop Group</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CropGroup getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CropGroup result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crop Group</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CropGroup get(int value) {
		switch (value) {
		case VEGETABLE_VALUE:
			return VEGETABLE;
		case FRUIT_VALUE:
			return FRUIT;
		case FLOWER_VALUE:
			return FLOWER;
		case TUBERS_VALUE:
			return TUBERS;
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
	private CropGroup(int value, String name, String literal) {
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

} //CropGroup
