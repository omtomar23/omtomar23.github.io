package com.tgts.servlets.customerorder;

public class CustomerDetails 
{
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNo;
	private String address;

	public CustomerDetails(String firstName, String lastName, String emailId, String phoneNo, String address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getEmailId()
	{
		return emailId;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	public String getPhoneNo() 
	{
		return phoneNo;
	}
}
