package com.tgts.servlets.customerorder;

public class CreateOrderRequest 
{
	private CustomerDetails customerDetails;
	private OrderDetails orderDetails;
	public CreateOrderRequest(CustomerDetails customerDetails, OrderDetails orderDetails)
	{
		this.customerDetails = customerDetails;
		this.orderDetails = orderDetails;
	}
	
	public CustomerDetails getCustomerDetails() 
	{
		return customerDetails;
	}
	
	public OrderDetails getOrderDetails()
	{
		return orderDetails;
	}
}
