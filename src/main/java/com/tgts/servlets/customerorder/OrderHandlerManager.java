package com.tgts.servlets.customerorder;

import com.self.om.tailerManagement.Customer;
import com.self.om.tailerManagement.CustomerConatiner;
import com.self.om.tailerManagement.Order;
import com.self.om.tailerManagement.TailerManagementFactory;
import com.tgts.servlets.persistence.FilePersistenceService;

public class OrderHandlerManager implements OrderHandlerService
{
	private FilePersistenceService filePersistenceService;
	public OrderHandlerManager(FilePersistenceService filePersistenceService)
	{
		this.filePersistenceService = filePersistenceService;
		
	}
	
	@Override
	public CreateOrderResult createOder(CreateOrderRequest createOrderRequest)
	{
		CustomerConatiner customerConatiner = loadCustomerContainer();
		
		CustomerDetails customerDetails = createOrderRequest.getCustomerDetails();
		Customer customer = TailerManagementFactory.eINSTANCE.createCustomer();
		int newId = customerConatiner.getLastCustomerId() + 1;
		customer.setId(newId);
		customer.setFirstName(customerDetails.getFirstName());
		customer.setLastName(customerDetails.getLastName());
		customer.setEmailId(customerDetails.getEmailId());
		customer.setPhoneNo(customerDetails.getPhoneNo());
		customer.setAddess(customerDetails.getAddress());
		
		customerConatiner.setLastCustomerId(newId);
		customerConatiner.getCustomers().add(customer);
		
		OrderDetails orderDetails = createOrderRequest.getOrderDetails();
		Order order = TailerManagementFactory.eINSTANCE.createOrder();
		int newOrderId = customerConatiner.getLastOrderId() + 1;
		order.setCustomerId(newId);
		order.setOrderCreationDate(System.currentTimeMillis());
		order.setOrderPrice(orderDetails.getPrice());
		order.setGarmentType(orderDetails.getGarmentType());
		
		customer.getOrders().add(newOrderId);
		customerConatiner.setLastOrderId(newOrderId);
		customerConatiner.getOrders().add(order);
		filePersistenceService.save(customerConatiner);
		
		return new CreateOrderResult(true, "Order created successfuly");
	}
	
	private CustomerConatiner loadCustomerContainer()
	{
		return (CustomerConatiner)filePersistenceService.load(CustomerConatiner.class.getSimpleName());
	}
}
