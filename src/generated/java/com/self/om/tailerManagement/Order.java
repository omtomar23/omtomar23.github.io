/**
 */
package com.self.om.tailerManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.self.om.tailerManagement.Order#getId <em>Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.Order#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.Order#getOrderCreationDate <em>Order Creation Date</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.Order#getOrderPrice <em>Order Price</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.Order#getGarmentType <em>Garment Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.Order#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(int)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder_CustomerId()
	 * @model
	 * @generated
	 */
	int getCustomerId();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.Order#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(int value);

	/**
	 * Returns the value of the '<em><b>Order Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Creation Date</em>' attribute.
	 * @see #setOrderCreationDate(long)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder_OrderCreationDate()
	 * @model
	 * @generated
	 */
	long getOrderCreationDate();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.Order#getOrderCreationDate <em>Order Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Creation Date</em>' attribute.
	 * @see #getOrderCreationDate()
	 * @generated
	 */
	void setOrderCreationDate(long value);

	/**
	 * Returns the value of the '<em><b>Order Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Price</em>' attribute.
	 * @see #setOrderPrice(double)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder_OrderPrice()
	 * @model
	 * @generated
	 */
	double getOrderPrice();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.Order#getOrderPrice <em>Order Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Price</em>' attribute.
	 * @see #getOrderPrice()
	 * @generated
	 */
	void setOrderPrice(double value);

	/**
	 * Returns the value of the '<em><b>Garment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.self.om.tailerManagement.GarmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garment Type</em>' attribute.
	 * @see com.self.om.tailerManagement.GarmentType
	 * @see #setGarmentType(GarmentType)
	 * @see com.self.om.tailerManagement.TailerManagementPackage#getOrder_GarmentType()
	 * @model
	 * @generated
	 */
	GarmentType getGarmentType();

	/**
	 * Sets the value of the '{@link com.self.om.tailerManagement.Order#getGarmentType <em>Garment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garment Type</em>' attribute.
	 * @see com.self.om.tailerManagement.GarmentType
	 * @see #getGarmentType()
	 * @generated
	 */
	void setGarmentType(GarmentType value);

} // Order
