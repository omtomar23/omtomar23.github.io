/**
 */
package com.self.om.tailerManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.self.om.tailerManagement.TailerManagementFactory
 * @model kind="package"
 * @generated
 */
public interface TailerManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tailerManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tailerManager/tailerManagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tailerManagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TailerManagementPackage eINSTANCE = com.self.om.tailerManagement.impl.TailerManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.self.om.tailerManagement.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.tailerManagement.impl.CustomerImpl
	 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Addess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDESS = 3;

	/**
	 * The feature id for the '<em><b>Phone No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NO = 4;

	/**
	 * The feature id for the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL_ID = 5;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDERS = 6;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.self.om.tailerManagement.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.tailerManagement.impl.OrderImpl
	 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CUSTOMER_ID = 1;

	/**
	 * The feature id for the '<em><b>Order Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Order Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Garment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__GARMENT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl <em>Customer Conatiner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.tailerManagement.impl.CustomerConatinerImpl
	 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getCustomerConatiner()
	 * @generated
	 */
	int CUSTOMER_CONATINER = 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER__CUSTOMERS = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER__ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Last Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER__LAST_CUSTOMER_ID = 2;

	/**
	 * The feature id for the '<em><b>Last Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER__LAST_ORDER_ID = 3;

	/**
	 * The number of structural features of the '<em>Customer Conatiner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer Conatiner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONATINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.self.om.tailerManagement.GarmentType <em>Garment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.self.om.tailerManagement.GarmentType
	 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getGarmentType()
	 * @generated
	 */
	int GARMENT_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link com.self.om.tailerManagement.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.self.om.tailerManagement.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.self.om.tailerManagement.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.self.om.tailerManagement.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.self.om.tailerManagement.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getAddess <em>Addess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addess</em>'.
	 * @see com.self.om.tailerManagement.Customer#getAddess()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Addess();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getPhoneNo <em>Phone No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone No</em>'.
	 * @see com.self.om.tailerManagement.Customer#getPhoneNo()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNo();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Customer#getEmailId <em>Email Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Id</em>'.
	 * @see com.self.om.tailerManagement.Customer#getEmailId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_EmailId();

	/**
	 * Returns the meta object for the attribute list '{@link com.self.om.tailerManagement.Customer#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orders</em>'.
	 * @see com.self.om.tailerManagement.Customer#getOrders()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Orders();

	/**
	 * Returns the meta object for class '{@link com.self.om.tailerManagement.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see com.self.om.tailerManagement.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Order#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.self.om.tailerManagement.Order#getId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Order#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see com.self.om.tailerManagement.Order#getCustomerId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_CustomerId();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Order#getOrderCreationDate <em>Order Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Creation Date</em>'.
	 * @see com.self.om.tailerManagement.Order#getOrderCreationDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Order#getOrderPrice <em>Order Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Price</em>'.
	 * @see com.self.om.tailerManagement.Order#getOrderPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderPrice();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.Order#getGarmentType <em>Garment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Garment Type</em>'.
	 * @see com.self.om.tailerManagement.Order#getGarmentType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_GarmentType();

	/**
	 * Returns the meta object for class '{@link com.self.om.tailerManagement.CustomerConatiner <em>Customer Conatiner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Conatiner</em>'.
	 * @see com.self.om.tailerManagement.CustomerConatiner
	 * @generated
	 */
	EClass getCustomerConatiner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.self.om.tailerManagement.CustomerConatiner#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see com.self.om.tailerManagement.CustomerConatiner#getCustomers()
	 * @see #getCustomerConatiner()
	 * @generated
	 */
	EReference getCustomerConatiner_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.self.om.tailerManagement.CustomerConatiner#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see com.self.om.tailerManagement.CustomerConatiner#getOrders()
	 * @see #getCustomerConatiner()
	 * @generated
	 */
	EReference getCustomerConatiner_Orders();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.CustomerConatiner#getLastCustomerId <em>Last Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Customer Id</em>'.
	 * @see com.self.om.tailerManagement.CustomerConatiner#getLastCustomerId()
	 * @see #getCustomerConatiner()
	 * @generated
	 */
	EAttribute getCustomerConatiner_LastCustomerId();

	/**
	 * Returns the meta object for the attribute '{@link com.self.om.tailerManagement.CustomerConatiner#getLastOrderId <em>Last Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Order Id</em>'.
	 * @see com.self.om.tailerManagement.CustomerConatiner#getLastOrderId()
	 * @see #getCustomerConatiner()
	 * @generated
	 */
	EAttribute getCustomerConatiner_LastOrderId();

	/**
	 * Returns the meta object for enum '{@link com.self.om.tailerManagement.GarmentType <em>Garment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Garment Type</em>'.
	 * @see com.self.om.tailerManagement.GarmentType
	 * @generated
	 */
	EEnum getGarmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TailerManagementFactory getTailerManagementFactory();

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
		 * The meta object literal for the '{@link com.self.om.tailerManagement.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.tailerManagement.impl.CustomerImpl
		 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Addess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDESS = eINSTANCE.getCustomer_Addess();

		/**
		 * The meta object literal for the '<em><b>Phone No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NO = eINSTANCE.getCustomer_PhoneNo();

		/**
		 * The meta object literal for the '<em><b>Email Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL_ID = eINSTANCE.getCustomer_EmailId();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ORDERS = eINSTANCE.getCustomer_Orders();

		/**
		 * The meta object literal for the '{@link com.self.om.tailerManagement.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.tailerManagement.impl.OrderImpl
		 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__CUSTOMER_ID = eINSTANCE.getOrder_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Order Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_CREATION_DATE = eINSTANCE.getOrder_OrderCreationDate();

		/**
		 * The meta object literal for the '<em><b>Order Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_PRICE = eINSTANCE.getOrder_OrderPrice();

		/**
		 * The meta object literal for the '<em><b>Garment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__GARMENT_TYPE = eINSTANCE.getOrder_GarmentType();

		/**
		 * The meta object literal for the '{@link com.self.om.tailerManagement.impl.CustomerConatinerImpl <em>Customer Conatiner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.tailerManagement.impl.CustomerConatinerImpl
		 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getCustomerConatiner()
		 * @generated
		 */
		EClass CUSTOMER_CONATINER = eINSTANCE.getCustomerConatiner();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_CONATINER__CUSTOMERS = eINSTANCE.getCustomerConatiner_Customers();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_CONATINER__ORDERS = eINSTANCE.getCustomerConatiner_Orders();

		/**
		 * The meta object literal for the '<em><b>Last Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_CONATINER__LAST_CUSTOMER_ID = eINSTANCE.getCustomerConatiner_LastCustomerId();

		/**
		 * The meta object literal for the '<em><b>Last Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_CONATINER__LAST_ORDER_ID = eINSTANCE.getCustomerConatiner_LastOrderId();

		/**
		 * The meta object literal for the '{@link com.self.om.tailerManagement.GarmentType <em>Garment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.self.om.tailerManagement.GarmentType
		 * @see com.self.om.tailerManagement.impl.TailerManagementPackageImpl#getGarmentType()
		 * @generated
		 */
		EEnum GARMENT_TYPE = eINSTANCE.getGarmentType();

	}

} //TailerManagementPackage
