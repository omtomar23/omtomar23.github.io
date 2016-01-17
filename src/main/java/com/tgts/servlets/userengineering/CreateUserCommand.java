package com.tgts.servlets.userengineering;

public final class CreateUserCommand 
{
	private final String firstName;
	private final String lastName;
	private final String emailId;
	private final String password;

	public CreateUserCommand(String firstName, String lastName, String emailId, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public String getPassword() 
	{
		return password;
	}

	@Override
	public String toString() {
		return "CreateUserCommand [firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
}
