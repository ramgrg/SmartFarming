/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Farm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Farm#getLocation <em>Location</em>}</li>
 *   <li>{@link smartFarmingXText.Farm#getSize <em>Size</em>}</li>
 *   <li>{@link smartFarmingXText.Farm#getCrops <em>Crops</em>}</li>
 *   <li>{@link smartFarmingXText.Farm#getFarmers <em>Farmers</em>}</li>
 *   <li>{@link smartFarmingXText.Farm#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidSize'"
 * @generated
 */
public interface Farm extends Named {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farm#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm_Size()
	 * @model required="true"
	 * @generated
	 */
	float getSize();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farm#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(float value);

	/**
	 * Returns the value of the '<em><b>Crops</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.Crop}.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Crop#getFarm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crops</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm_Crops()
	 * @see smartFarmingXText.Crop#getFarm
	 * @model opposite="Farm" containment="true" required="true"
	 * @generated
	 */
	EList<Crop> getCrops();

	/**
	 * Returns the value of the '<em><b>Farmers</b></em>' containment reference list.
	 * The list contents are of type {@link smartFarmingXText.Farmer}.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Farmer#getFarm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farmers</em>' containment reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm_Farmers()
	 * @see smartFarmingXText.Farmer#getFarm
	 * @model opposite="Farm" containment="true" required="true"
	 * @generated
	 */
	EList<Farmer> getFarmers();

	/**
	 * Returns the value of the '<em><b>Io TSystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io TSystem</em>' containment reference.
	 * @see #setIoTSystem(IoTSystem)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarm_IoTSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IoTSystem getIoTSystem();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farm#getIoTSystem <em>Io TSystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io TSystem</em>' containment reference.
	 * @see #getIoTSystem()
	 * @generated
	 */
	void setIoTSystem(IoTSystem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Size &gt; 0'"
	 * @generated
	 */
	boolean ValidSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Farm
