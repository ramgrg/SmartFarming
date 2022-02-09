/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Service#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link smartFarmingXText.Service#getHost <em>Host</em>}</li>
 *   <li>{@link smartFarmingXText.Service#getURI <em>URI</em>}</li>
 *   <li>{@link smartFarmingXText.Service#getIoTSystem <em>Io TSystem</em>}</li>
 *   <li>{@link smartFarmingXText.Service#getPIC <em>PIC</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getService()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ServiceMustHaveID'"
 * @generated
 */
public interface Service extends Named {
	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getService_ServiceID()
	 * @model
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Service#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getService_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Service#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getService_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Service#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Io TSystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.IoTSystem#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io TSystem</em>' container reference.
	 * @see #setIoTSystem(IoTSystem)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getService_IoTSystem()
	 * @see smartFarmingXText.IoTSystem#getServices
	 * @model opposite="Services" required="true" transient="false"
	 * @generated
	 */
	IoTSystem getIoTSystem();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Service#getIoTSystem <em>Io TSystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io TSystem</em>' container reference.
	 * @see #getIoTSystem()
	 * @generated
	 */
	void setIoTSystem(IoTSystem value);

	/**
	 * Returns the value of the '<em><b>PIC</b></em>' reference list.
	 * The list contents are of type {@link smartFarmingXText.Farmer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PIC</em>' reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getService_PIC()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Farmer> getPIC();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.IoTSystem.Services-&gt;select(x | x.ServiceID = self.ServiceID)-&gt;size() = 1'"
	 * @generated
	 */
	boolean ServiceUniqueID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not ServiceID.oclIsUndefined()'"
	 * @generated
	 */
	boolean ServiceMustHaveID(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Service
