/**
 */
package smartFarmingXText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Monitoring#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link smartFarmingXText.Monitoring#getSensors <em>Sensors</em>}</li>
 *   <li>{@link smartFarmingXText.Monitoring#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoring()
 * @model
 * @generated
 */
public interface Monitoring extends Service {
	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.MonitoringMetrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' attribute.
	 * @see smartFarmingXText.MonitoringMetrics
	 * @see #setMetrics(MonitoringMetrics)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoring_Metrics()
	 * @model
	 * @generated
	 */
	MonitoringMetrics getMetrics();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Monitoring#getMetrics <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics</em>' attribute.
	 * @see smartFarmingXText.MonitoringMetrics
	 * @see #getMetrics()
	 * @generated
	 */
	void setMetrics(MonitoringMetrics value);

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link smartFarmingXText.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoring_Sensors()
	 * @model required="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Controlling)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getMonitoring_Control()
	 * @model
	 * @generated
	 */
	Controlling getControl();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Monitoring#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Controlling value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Sensors-&gt;select(x: Sensor | x.Type = type)-&gt;iterate(x: Sensor; average: ecore::EFloat = 0 | average + x.Value) / self.Sensors-&gt;select(x: Sensor | x.Type = type)-&gt;size()'"
	 * @generated
	 */
	float calculateAverage(SensorType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(Metrics = MonitoringMetrics::Nutrient) then\n\t\t\t\tif (calculateAverage(SensorType::EC) &lt; 40.0)  then\n\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\telse\n\t\t\t\t\tif(calculateAverage(SensorType::EC) &lt; 55.0 and ((calculateAverage(SensorType::PH) &gt;=-1 and calculateAverage(SensorType::PH) &lt; 0) or (calculateAverage(SensorType::PH) &gt; 3 and calculateAverage(SensorType::PH) &lt;= 4))) then\n\t\t\t\t\t\tMonitoringCondition::Warning\n\t\t\t\t\telse\n\t\t\t\t\t\tif(calculateAverage(SensorType::EC) &lt; 65.0 and ((calculateAverage(SensorType::PH) &gt;=0 and calculateAverage(SensorType::PH) &lt; 1) or (calculateAverage(SensorType::PH) &gt; 2 and calculateAverage(SensorType::PH) &lt;= 3))) then\n\t\t\t\t\t\t\tMonitoringCondition::Good\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(calculateAverage(SensorType::EC) &lt; 75 and (calculateAverage(SensorType::PH) &gt;= 1 and calculateAverage(SensorType::PH) &lt;= 2)) then\n\t\t\t\t\t\t\t\tMonitoringCondition::Healthy\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(calculateAverage(SensorType::EC) &gt;=75 and calculateAverage(SensorType::PH) = 1.5) then\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Optimum\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tif(Metrics = MonitoringMetrics::EnvironmentalSafety) then\n\t\t\t\t\tif (calculateAverage(SensorType::CO2) &gt;= 5000)  then\n\t\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\t\telse \n\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) &gt;=3000) then\n\t\t\t\t\t\t\tMonitoringCondition::Warning\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) &gt;=1500) then\n\t\t\t\t\t\t\t\tMonitoringCondition::Good\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) &gt;= 900) then\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Healthy\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Optimum\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tMonitoringCondition::Invalid\n\t\t\t\tendif\n\t\t\tendif'"
	 * @generated
	 */
	MonitoringCondition checkCondition();

} // Monitoring
