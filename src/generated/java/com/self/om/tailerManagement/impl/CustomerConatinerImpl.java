/**
 */
package com.self.om.tailerManagement.impl;

import com.self.om.tailerManagement.Customer;
import com.self.om.tailerManagement.CustomerConatiner;
import com.self.om.tailerManagement.Order;
import com.self.om.tailerManagement.TailerManagementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Conatiner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl#getLastCustomerId <em>Last Customer Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl#getLastOrderId <em>Last Order Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerConatinerImpl extends MinimalEObjectImpl.Container implements CustomerConatiner {
	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The default value of the '{@link #getLastCustomerId() <em>Last Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastCustomerId() <em>Last Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCustomerId()
	 * @generated
	 * @ordered
	 */
	protected int lastCustomerId = LAST_CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOrderId() <em>Last Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_ORDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastOrderId() <em>Last Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderId()
	 * @generated
	 * @ordered
	 */
	protected int lastOrderId = LAST_ORDER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerConatinerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TailerManagementPackage.Literals.CUSTOMER_CONATINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, TailerManagementPackage.CUSTOMER_CONATINER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastCustomerId() {
		return lastCustomerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCustomerId(int newLastCustomerId) {
		int oldLastCustomerId = lastCustomerId;
		lastCustomerId = newLastCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER_CONATINER__LAST_CUSTOMER_ID, oldLastCustomerId, lastCustomerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastOrderId() {
		return lastOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOrderId(int newLastOrderId) {
		int oldLastOrderId = lastOrderId;
		lastOrderId = newLastOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER_CONATINER__LAST_ORDER_ID, oldLastOrderId, lastOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case TailerManagementPackage.CUSTOMER_CONATINER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS:
				return getCustomers();
			case TailerManagementPackage.CUSTOMER_CONATINER__ORDERS:
				return getOrders();
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_CUSTOMER_ID:
				return getLastCustomerId();
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_ORDER_ID:
				return getLastOrderId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_CUSTOMER_ID:
				setLastCustomerId((Integer)newValue);
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_ORDER_ID:
				setLastOrderId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS:
				getCustomers().clear();
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__ORDERS:
				getOrders().clear();
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_CUSTOMER_ID:
				setLastCustomerId(LAST_CUSTOMER_ID_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_ORDER_ID:
				setLastOrderId(LAST_ORDER_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER_CONATINER__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case TailerManagementPackage.CUSTOMER_CONATINER__ORDERS:
				return orders != null && !orders.isEmpty();
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_CUSTOMER_ID:
				return lastCustomerId != LAST_CUSTOMER_ID_EDEFAULT;
			case TailerManagementPackage.CUSTOMER_CONATINER__LAST_ORDER_ID:
				return lastOrderId != LAST_ORDER_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastCustomerId: ");
		result.append(lastCustomerId);
		result.append(", lastOrderId: ");
		result.append(lastOrderId);
		result.append(')');
		return result.toString();
	}

} //CustomerConatinerImpl
