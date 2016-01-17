/**
 */
package com.self.om.userManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.self.om.userManagement.UserManagementFactory
 * @model kind="package"
 * @generated
 */
public interface UserManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "userManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tailerManager/userManagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "userManagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserManagementPackage eINSTANCE = com.self.om.userManagement.impl.UserManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.self.om.userManagement.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.userManagement.impl.UserImpl
	 * @see com.self.om.userManagement.impl.UserManagementPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL_ID = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.self.om.userManagement.impl.UserContainerImpl <em>User Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.userManagement.impl.UserContainerImpl
	 * @see com.self.om.userManagement.impl.UserManagementPackageImpl#getUserContainer()
	 * @generated
	 */
	int USER_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTAINER__USERS = 0;

	/**
	 * The number of structural features of the '<em>User Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.self.om.userManagement.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.self.om.userManagement.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.userManagement.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.self.om.userManagement.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.userManagement.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.self.om.userManagement.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.userManagement.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.self.om.userManagement.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.userManagement.User#getEmailId <em>Email Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Id</em>'.
	 * @see com.self.om.userManagement.User#getEmailId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EmailId();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.userManagement.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.self.om.userManagement.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for class '{@link com.self.om.userManagement.UserContainer <em>User Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Container</em>'.
	 * @see com.self.om.userManagement.UserContainer
	 * @generated
	 */
	EClass getUserContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.self.om.userManagement.UserContainer#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see com.self.om.userManagement.UserContainer#getUsers()
	 * @see #getUserContainer()
	 * @generated
	 */
	EReference getUserContainer_Users();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserManagementFactory getUserManagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.self.om.userManagement.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.userManagement.impl.UserImpl
		 * @see com.self.om.userManagement.impl.UserManagementPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Email Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL_ID = eINSTANCE.getUser_EmailId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '{@link com.self.om.userManagement.impl.UserContainerImpl <em>User Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.userManagement.impl.UserContainerImpl
		 * @see com.self.om.userManagement.impl.UserManagementPackageImpl#getUserContainer()
		 * @generated
		 */
		EClass USER_CONTAINER = eINSTANCE.getUserContainer();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_CONTAINER__USERS = eINSTANCE.getUserContainer_Users();

	}

} //UserManagementPackage
