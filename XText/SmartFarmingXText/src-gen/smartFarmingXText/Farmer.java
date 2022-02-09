/**
 */
package smartFarmingXText;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Farmer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.Farmer#getFarmerID <em>Farmer ID</em>}</li>
 *   <li>{@link smartFarmingXText.Farmer#getEmail <em>Email</em>}</li>
 *   <li>{@link smartFarmingXText.Farmer#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link smartFarmingXText.Farmer#getFarm <em>Farm</em>}</li>
 *   <li>{@link smartFarmingXText.Farmer#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FarmerUniqueID'"
 * @generated
 */
public interface Farmer extends Named {
	/**
	 * Returns the value of the '<em><b>Farmer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farmer ID</em>' attribute.
	 * @see #setFarmerID(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer_FarmerID()
	 * @model
	 * @generated
	 */
	String getFarmerID();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farmer#getFarmerID <em>Farmer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farmer ID</em>' attribute.
	 * @see #getFarmerID()
	 * @generated
	 */
	void setFarmerID(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farmer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farmer#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Farm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartFarmingXText.Farm#getFarmers <em>Farmers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm</em>' container reference.
	 * @see #setFarm(Farm)
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer_Farm()
	 * @see smartFarmingXText.Farm#getFarmers
	 * @model opposite="Farmers" required="true" transient="false"
	 * @generated
	 */
	Farm getFarm();

	/**
	 * Sets the value of the '{@link smartFarmingXText.Farmer#getFarm <em>Farm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farm</em>' container reference.
	 * @see #getFarm()
	 * @generated
	 */
	void setFarm(Farm value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link smartFarmingXText.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see smartFarmingXText.SmartFarmingXTextPackage#getFarmer_Services()
	 * @model required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not FarmerID.oclIsUndefined()'"
	 * @generated
	 */
	boolean FarmerMustHaveID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Farm.Farmers-&gt;select(x | x.FarmerID = self.FarmerID)-&gt;size() = 1'"
	 * @generated
	 */
	boolean FarmerUniqueID(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Farmer
