/**
 */
package com.self.om.userManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.self.om.userManagement.UserContainer#getUsers <em>Users</em>}</li>
 *   <li>{@link com.self.om.userManagement.UserContainer#getLastUserId <em>Last User Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.self.om.userManagement.UserManagementPackage#getUserContainer()
 * @model
 * @generated
 */
public interface UserContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link com.self.om.userManagement.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see com.self.om.userManagement.UserManagementPackage#getUserContainer_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Last User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last User Id</em>' attribute.
	 * @see #setLastUserId(int)
	 * @see com.self.om.userManagement.UserManagementPackage#getUserContainer_LastUserId()
	 * @model
	 * @generated
	 */
	int getLastUserId();

	/**
	 * Sets the value of the '{@link com.self.om.userManagement.UserContainer#getLastUserId <em>Last User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last User Id</em>' attribute.
	 * @see #getLastUserId()
	 * @generated
	 */
	void setLastUserId(int value);

} // UserContainer
