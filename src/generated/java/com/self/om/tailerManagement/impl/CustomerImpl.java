/**
 */
package com.self.om.tailerManagement.impl;

import com.self.om.tailerManagement.Customer;
import com.self.om.tailerManagement.TailerManagementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getAddess <em>Addess</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getPhoneNo <em>Phone No</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getEmailId <em>Email Id</em>}</li>
 *   <li>{@link com.self.om.tailerManagement.impl.CustomerImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
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
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddess() <em>Addess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddess()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddess() <em>Addess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddess()
	 * @generated
	 * @ordered
	 */
	protected String addess = ADDESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNo() <em>Phone No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNo() <em>Phone No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNo()
	 * @generated
	 * @ordered
	 */
	protected String phoneNo = PHONE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected String emailId = EMAIL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TailerManagementPackage.Literals.CUSTOMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddess() {
		return addess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddess(String newAddess) {
		String oldAddess = addess;
		addess = newAddess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__ADDESS, oldAddess, addess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNo(String newPhoneNo) {
		String oldPhoneNo = phoneNo;
		phoneNo = newPhoneNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__PHONE_NO, oldPhoneNo, phoneNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailId(String newEmailId) {
		String oldEmailId = emailId;
		emailId = newEmailId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TailerManagementPackage.CUSTOMER__EMAIL_ID, oldEmailId, emailId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getOrders() {
		if (orders == null) {
			orders = new EDataTypeUniqueEList<Integer>(Integer.class, this, TailerManagementPackage.CUSTOMER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TailerManagementPackage.CUSTOMER__ID:
				return getId();
			case TailerManagementPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case TailerManagementPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case TailerManagementPackage.CUSTOMER__ADDESS:
				return getAddess();
			case TailerManagementPackage.CUSTOMER__PHONE_NO:
				return getPhoneNo();
			case TailerManagementPackage.CUSTOMER__EMAIL_ID:
				return getEmailId();
			case TailerManagementPackage.CUSTOMER__ORDERS:
				return getOrders();
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
			case TailerManagementPackage.CUSTOMER__ID:
				setId((Integer)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__ADDESS:
				setAddess((String)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__PHONE_NO:
				setPhoneNo((String)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__EMAIL_ID:
				setEmailId((String)newValue);
				return;
			case TailerManagementPackage.CUSTOMER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Integer>)newValue);
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
			case TailerManagementPackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__ADDESS:
				setAddess(ADDESS_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__PHONE_NO:
				setPhoneNo(PHONE_NO_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__EMAIL_ID:
				setEmailId(EMAIL_ID_EDEFAULT);
				return;
			case TailerManagementPackage.CUSTOMER__ORDERS:
				getOrders().clear();
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
			case TailerManagementPackage.CUSTOMER__ID:
				return id != ID_EDEFAULT;
			case TailerManagementPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case TailerManagementPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case TailerManagementPackage.CUSTOMER__ADDESS:
				return ADDESS_EDEFAULT == null ? addess != null : !ADDESS_EDEFAULT.equals(addess);
			case TailerManagementPackage.CUSTOMER__PHONE_NO:
				return PHONE_NO_EDEFAULT == null ? phoneNo != null : !PHONE_NO_EDEFAULT.equals(phoneNo);
			case TailerManagementPackage.CUSTOMER__EMAIL_ID:
				return EMAIL_ID_EDEFAULT == null ? emailId != null : !EMAIL_ID_EDEFAULT.equals(emailId);
			case TailerManagementPackage.CUSTOMER__ORDERS:
				return orders != null && !orders.isEmpty();
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
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", addess: ");
		result.append(addess);
		result.append(", phoneNo: ");
		result.append(phoneNo);
		result.append(", emailId: ");
		result.append(emailId);
		result.append(", orders: ");
		result.append(orders);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
