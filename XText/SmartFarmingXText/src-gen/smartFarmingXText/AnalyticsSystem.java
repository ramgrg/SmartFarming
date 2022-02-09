/**
 */
package smartFarmingXText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytics System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.AnalyticsSystem#getAnalyticsType <em>Analytics Type</em>}</li>
 *   <li>{@link smartFarmingXText.AnalyticsSystem#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link smartFarmingXText.AnalyticsSystem#getOutputType <em>Output Type</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getAnalyticsSystem()
 * @model
 * @generated
 */
public interface AnalyticsSystem extends Service {
	/**
	 * Returns the value of the '<em><b>Analytics Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.AnalyticsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analytics Type</em>' attribute.
	 * @see smartFarmingXText.AnalyticsType
	 * @see #setAnalyticsType(AnalyticsType)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getAnalyticsSystem_AnalyticsType()
	 * @model
	 * @generated
	 */
	AnalyticsType getAnalyticsType();

	/**
	 * Sets the value of the '{@link smartFarmingXText.AnalyticsSystem#getAnalyticsType <em>Analytics Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analytics Type</em>' attribute.
	 * @see smartFarmingXText.AnalyticsType
	 * @see #getAnalyticsType()
	 * @generated
	 */
	void setAnalyticsType(AnalyticsType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getAnalyticsSystem_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link smartFarmingXText.AnalyticsSystem#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.OutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' attribute.
	 * @see smartFarmingXText.OutputType
	 * @see #setOutputType(OutputType)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getAnalyticsSystem_OutputType()
	 * @model
	 * @generated
	 */
	OutputType getOutputType();

	/**
	 * Sets the value of the '{@link smartFarmingXText.AnalyticsSystem#getOutputType <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' attribute.
	 * @see smartFarmingXText.OutputType
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(OutputType value);

} // AnalyticsSystem
