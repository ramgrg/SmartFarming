/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link smartFarmingXText.Sensor#getState <em>State</em>}</li>
 *   <li>{@link smartFarmingXText.Sensor#getUnit <em>Unit</em>}</li>
 *   <li>{@link smartFarmingXText.Sensor#getValue <em>Value</em>}</li>
 *   <li>{@link smartFarmingXText.Sensor#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SensorMinusConstraint'"
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see smartFarmingXText.SensorType
	 * @see #setType(SensorType)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see smartFarmingXText.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.SensorState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see smartFarmingXText.SensorState
	 * @see #setState(SensorState)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor_State()
	 * @model
	 * @generated
	 */
	SensorState getState();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Sensor#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see smartFarmingXText.SensorState
	 * @see #getState()
	 * @generated
	 */
	void setState(SensorState value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Sensor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Sensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getSensor_Protocol()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Sensor#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Monitoring.allInstances()-&gt;select(x: Monitoring | x.Sensors-&gt;exists(sensor | sensor = self))-&gt;size() &gt; 0'"
	 * @generated
	 */
	Boolean isUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(self.Type = SensorType::Temperature) then\n\t\t\t\ttrue\n\t\t\telse \n\t\t\t\tself.Value &gt; 0\n\t\t\tendif'"
	 * @generated
	 */
	boolean SensorMinusConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Sensor
