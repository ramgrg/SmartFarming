/**
 */
package smartFarmingXText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Output Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage#getOutputType()
 * @model
 * @generated
 */
public enum OutputType implements Enumerator {
	/**
	 * The '<em><b>Line Graph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_GRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_GRAPH(1, "LineGraph", "LineGraph"),

	/**
	 * The '<em><b>Pie Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	PIE_CHART(2, "PieChart", "PieChart"),

	/**
	 * The '<em><b>Bar Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_CHART(3, "BarChart", "BarChart"),

	/**
	 * The '<em><b>Tabular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR_VALUE
	 * @generated
	 * @ordered
	 */
	TABULAR(4, "Tabular", "Tabular");

	/**
	 * The '<em><b>Line Graph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_GRAPH
	 * @model name="LineGraph"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_GRAPH_VALUE = 1;

	/**
	 * The '<em><b>Pie Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_CHART
	 * @model name="PieChart"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_CHART_VALUE = 2;

	/**
	 * The '<em><b>Bar Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_CHART
	 * @model name="BarChart"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_CHART_VALUE = 3;

	/**
	 * The '<em><b>Tabular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR
	 * @model name="Tabular"
	 * @generated
	 * @ordered
	 */
	public static final int TABULAR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OutputType[] VALUES_ARRAY = new OutputType[] { LINE_GRAPH, PIE_CHART, BAR_CHART, TABULAR, };

	/**
	 * A public read-only list of all the '<em><b>Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OutputType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Output Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutputType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutputType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Output Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutputType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutputType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Output Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OutputType get(int value) {
		switch (value) {
		case LINE_GRAPH_VALUE:
			return LINE_GRAPH;
		case PIE_CHART_VALUE:
			return PIE_CHART;
		case BAR_CHART_VALUE:
			return BAR_CHART;
		case TABULAR_VALUE:
			return TABULAR;
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
	private OutputType(int value, String name, String literal) {
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

} //OutputType
