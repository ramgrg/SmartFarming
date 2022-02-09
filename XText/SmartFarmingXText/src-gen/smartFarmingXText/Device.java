/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Device#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link smartFarmingXText.Device#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link smartFarmingXText.Device#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link smartFarmingXText.Device#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getDevice()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DeviceMustHaveID'"
 * @generated
 */
public interface Device extends Named {
	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getDevice_DeviceID()
	 * @model
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Device#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getDevice_IPAddress()
	 * @model
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Device#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getDevice_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Device#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Io TSystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.IoTSystem#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io TSystem</em>' container reference.
	 * @see #setIoTSystem(IoTSystem)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getDevice_IoTSystem()
	 * @see smartFarmingXText.IoTSystem#getDevices
	 * @model opposite="Devices" required="true" transient="false"
	 * @generated
	 */
	IoTSystem getIoTSystem();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Device#getIoTSystem <em>Io TSystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io TSystem</em>' container reference.
	 * @see #getIoTSystem()
	 * @generated
	 */
	void setIoTSystem(IoTSystem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.IoTSystem.Devices-&gt;select(x | x.DeviceID = self.DeviceID)-&gt;size() = 1'"
	 * @generated
	 */
	boolean DeviceUniqueID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not DeviceID.oclIsUndefined()'"
	 * @generated
	 */
	boolean DeviceMustHaveID(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Device
