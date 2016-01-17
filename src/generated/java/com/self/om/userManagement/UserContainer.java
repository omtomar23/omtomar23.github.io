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

} // UserContainer
