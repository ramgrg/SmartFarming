/**
 */
package smartFarmingXText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TSystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.IoTSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link smartFarmingXText.IoTSystem#getServices <em>Services</em>}</li>
 *   <li>{@link smartFarmingXText.IoTSystem#getDevices <em>Devices</em>}</li>
 *   <li>{@link smartFarmingXText.IoTSystem#getGateways <em>Gateways</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getIoTSystem()
 * @model
 * @generated
 */
public interface IoTSystem extends Named {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getIoTSystem_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link smartFarmingXText.IoTSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.Service}.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Service#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getIoTSystem_Services()
	 * @see smartFarmingXText.Service#getIoTSystem
	 * @model opposite="IoTSystem" containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.Device}.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Device#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getIoTSystem_Devices()
	 * @see smartFarmingXText.Device#getIoTSystem
	 * @model opposite="IoTSystem" containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Gateways</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.Gateway}.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Gateway#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateways</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getIoTSystem_Gateways()
	 * @see smartFarmingXText.Gateway#getIoTSystem
	 * @model opposite="IoTSystem" containment="true" required="true"
	 * @generated
	 */
	EList<Gateway> getGateways();

} // IoTSystem
