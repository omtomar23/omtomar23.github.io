/**
 */
package com.self.om.tailerManagement.impl;

import com.self.om.tailerManagement.GarmentType;
import com.self.om.tailerManagement.Order;
import com.self.om.tailerManagement.TailerManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.self.om.tailerManagement.impl.OrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.OrderImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.OrderImpl#getOrderCreationDate <em>Order Creation Date</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.OrderImpl#getOrderPrice <em>Order Price</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.OrderImpl#getGarmentType <em>Garment Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected int customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderCreationDate() <em>Order Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final long ORDER_CREATION_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOrderCreationDate() <em>Order Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderCreationDate()
	 * @generated
	 * @ordered
	 */
	protected long orderCreationDate = ORDER_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderPrice() <em>Order Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double ORDER_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrderPrice() <em>Order Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPrice()
	 * @generated
	 * @ordered
	 */
	protected double orderPrice = ORDER_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGarmentType() <em>Garment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGarmentType()
	 * @generated
	 * @ordered
	 */
	protected static final GarmentType GARMENT_TYPE_EDEFAULT = GarmentType.SHIRT;

	/**
	 * The cached value of the '{@link #getGarmentType() <em>Garment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGarmentType()
	 * @generated
	 * @ordered
	 */
	protected GarmentType garmentType = GARMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TailerManagementPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerId(int newCustomerId) {
		int oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.ORDER__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOrderCreationDate() {
		return orderCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderCreationDate(long newOrderCreationDate) {
		long oldOrderCreationDate = orderCreationDate;
		orderCreationDate = newOrderCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.ORDER__ORDER_CREATION_DATE, oldOrderCreationDate, orderCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOrderPrice() {
		return orderPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderPrice(double newOrderPrice) {
		double oldOrderPrice = orderPrice;
		orderPrice = newOrderPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.ORDER__ORDER_PRICE, oldOrderPrice, orderPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarmentType getGarmentType() {
		return garmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGarmentType(GarmentType newGarmentType) {
		GarmentType oldGarmentType = garmentType;
		garmentType = newGarmentType == null ? GARMENT_TYPE_EDEFAULT : newGarmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.ORDER__GARMENT_TYPE, oldGarmentType, garmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TailerManagementPackage.ORDER__ID:
				return getId();
			case TailerManagementPackage.ORDER__CUSTOMER_ID:
				return getCustomerId();
			case TailerManagementPackage.ORDER__ORDER_CREATION_DATE:
				return getOrderCreationDate();
			case TailerManagementPackage.ORDER__ORDER_PRICE:
				return getOrderPrice();
			case TailerManagementPackage.ORDER__GARMENT_TYPE:
				return getGarmentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TailerManagementPackage.ORDER__ID:
				setId((Integer)newValue);
				return;
			case TailerManagementPackage.ORDER__CUSTOMER_ID:
				setCustomerId((Integer)newValue);
				return;
			case TailerManagementPackage.ORDER__ORDER_CREATION_DATE:
				setOrderCreationDate((Long)newValue);
				return;
			case TailerManagementPackage.ORDER__ORDER_PRICE:
				setOrderPrice((Double)newValue);
				return;
			case TailerManagementPackage.ORDER__GARMENT_TYPE:
				setGarmentType((GarmentType)newValue);
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
			case TailerManagementPackage.ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case TailerManagementPackage.ORDER__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case TailerManagementPackage.ORDER__ORDER_CREATION_DATE:
				setOrderCreationDate(ORDER_CREATION_DATE_EDEFAULT);
				return;
			case TailerManagementPackage.ORDER__ORDER_PRICE:
				setOrderPrice(ORDER_PRICE_EDEFAULT);
				return;
			case TailerManagementPackage.ORDER__GARMENT_TYPE:
				setGarmentType(GARMENT_TYPE_EDEFAULT);
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
			case TailerManagementPackage.ORDER__ID:
				return id != ID_EDEFAULT;
			case TailerManagementPackage.ORDER__CUSTOMER_ID:
				return customerId != CUSTOMER_ID_EDEFAULT;
			case TailerManagementPackage.ORDER__ORDER_CREATION_DATE:
				return orderCreationDate != ORDER_CREATION_DATE_EDEFAULT;
			case TailerManagementPackage.ORDER__ORDER_PRICE:
				return orderPrice != ORDER_PRICE_EDEFAULT;
			case TailerManagementPackage.ORDER__GARMENT_TYPE:
				return garmentType != GARMENT_TYPE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(", orderCreationDate: ");
		result.append(orderCreationDate);
		result.append(", orderPrice: ");
		result.append(orderPrice);
		result.append(", garmentType: ");
		result.append(garmentType);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
