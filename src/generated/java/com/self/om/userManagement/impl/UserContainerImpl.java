/**
 */
package com.self.om.userManagement.impl;

import com.self.om.userManagement.User;
import com.self.om.userManagement.UserContainer;
import com.self.om.userManagement.UserManagementPackage;

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
 * An implementation of the model object '<em><b>User Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.self.om.userManagement.impl.UserContainerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link com.self.om.userManagement.impl.UserContainerImpl#getLastUserId <em>Last User Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserContainerImpl extends MinimalEObjectImpl.Container implements UserContainer {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The default value of the '{@link #getLastUserId() <em>Last User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUserId()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_USER_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLastUserId() <em>Last User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUserId()
	 * @generated
	 * @ordered
	 */
	protected int lastUserId = LAST_USER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserManagementPackage.Literals.USER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, UserManagementPackage.USER_CONTAINER__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastUserId() {
		return lastUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUserId(int newLastUserId) {
		int oldLastUserId = lastUserId;
		lastUserId = newLastUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserManagementPackage.USER_CONTAINER__LAST_USER_ID, oldLastUserId, lastUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserManagementPackage.USER_CONTAINER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case UserManagementPackage.USER_CONTAINER__USERS:
				return getUsers();
			case UserManagementPackage.USER_CONTAINER__LAST_USER_ID:
				return getLastUserId();
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
			case UserManagementPackage.USER_CONTAINER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case UserManagementPackage.USER_CONTAINER__LAST_USER_ID:
				setLastUserId((Integer)newValue);
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
			case UserManagementPackage.USER_CONTAINER__USERS:
				getUsers().clear();
				return;
			case UserManagementPackage.USER_CONTAINER__LAST_USER_ID:
				setLastUserId(LAST_USER_ID_EDEFAULT);
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
			case UserManagementPackage.USER_CONTAINER__USERS:
				return users != null && !users.isEmpty();
			case UserManagementPackage.USER_CONTAINER__LAST_USER_ID:
				return lastUserId != LAST_USER_ID_EDEFAULT;
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
		result.append(" (lastUserId: ");
		result.append(lastUserId);
		result.append(')');
		return result.toString();
	}

} //UserContainerImpl
