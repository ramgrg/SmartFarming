/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Gateway#getGatewayID <em>Gateway ID</em>}</li>
 *   <li>{@link smartFarmingXText.Gateway#getModel <em>Model</em>}</li>
 *   <li>{@link smartFarmingXText.Gateway#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link smartFarmingXText.Gateway#getDevices <em>Devices</em>}</li>
 *   <li>{@link smartFarmingXText.Gateway#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='GatewayUniqueID'"
 * @generated
 */
public interface Gateway extends Named {
	/**
	 * Returns the value of the '<em><b>Gateway ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway ID</em>' attribute.
	 * @see #setGatewayID(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway_GatewayID()
	 * @model
	 * @generated
	 */
	String getGatewayID();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Gateway#getGatewayID <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway ID</em>' attribute.
	 * @see #getGatewayID()
	 * @generated
	 */
	void setGatewayID(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Gateway#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.CommunicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationProtocol> getProtocols();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link smartFarmingXText.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway_Devices()
	 * @model required="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Io TSystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.IoTSystem#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io TSystem</em>' container reference.
	 * @see #setIoTSystem(IoTSystem)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getGateway_IoTSystem()
	 * @see smartFarmingXText.IoTSystem#getGateways
	 * @model opposite="Gateways" required="true" transient="false"
	 * @generated
	 */
	IoTSystem getIoTSystem();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Gateway#getIoTSystem <em>Io TSystem</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not GatewayID.oclIsUndefined()'"
	 * @generated
	 */
	boolean GatewayMustHaveID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.IoTSystem.Gateways-&gt;select(x | x.GatewayID = self.GatewayID)-&gt;size() = 1'"
	 * @generated
	 */
	boolean GatewayUniqueID(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Gateway
