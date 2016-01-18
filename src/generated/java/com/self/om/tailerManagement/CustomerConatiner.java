/**
 */
package com.self.om.tailerManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Conatiner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.self.om.tailerManagement.CustomerConatiner#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.CustomerConatiner#getOrders <em>Orders</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.CustomerConatiner#getLastCustomerId <em>Last Customer Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.CustomerConatiner#getLastOrderId <em>Last Order Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.self.om.tailerManagement.TailerManagementPackage#getCustomerConatiner()
 * @model
 * @generated
 */
public interface CustomerConatiner extends EObject {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link com.self.om.tailerManagement.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getCustomerConatiner_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link com.self.om.tailerManagement.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getCustomerConatiner_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Last Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Customer Id</em>' attribute.
	 * @see #setLastCustomerId(int)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getCustomerConatiner_LastCustomerId()
	 * @model
	 * @generated
	 */
	int getLastCustomerId();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.CustomerConatiner#getLastCustomerId <em>Last Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Customer Id</em>' attribute.
	 * @see #getLastCustomerId()
	 * @generated
	 */
	void setLastCustomerId(int value);

	/**
	 * Returns the value of the '<em><b>Last Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Order Id</em>' attribute.
	 * @see #setLastOrderId(int)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getCustomerConatiner_LastOrderId()
	 * @model
	 * @generated
	 */
	int getLastOrderId();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.CustomerConatiner#getLastOrderId <em>Last Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Order Id</em>' attribute.
	 * @see #getLastOrderId()
	 * @generated
	 */
	void setLastOrderId(int value);

} // CustomerConatiner
