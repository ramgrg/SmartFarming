/**
 */
package smartFarmingXText;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.CommunicationProtocol#getType <em>Type</em>}</li>
 *   <li>{@link smartFarmingXText.CommunicationProtocol#getSensorNumber <em>Sensor Number</em>}</li>
 *   <li>{@link smartFarmingXText.CommunicationProtocol#getActuatorNumber <em>Actuator Number</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getCommunicationProtocol()
 * @model
 * @generated
 */
public interface CommunicationProtocol extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartFarmingXText.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see smartFarmingXText.CommunicationType
	 * @see #setType(CommunicationType)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCommunicationProtocol_Type()
	 * @model
	 * @generated
	 */
	CommunicationType getType();

	/**
	 * Sets the value of the '{@link smartFarmingXText.CommunicationProtocol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see smartFarmingXText.CommunicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Sensor Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Number</em>' attribute.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCommunicationProtocol_SensorNumber()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getSensorNumber();

	/**
	 * Returns the value of the '<em><b>Actuator Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Number</em>' attribute.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getCommunicationProtocol_ActuatorNumber()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getActuatorNumber();

} // CommunicationProtocol
