package com.tgts.servlets.userengineering;

public class UserLoginResult 
{
	private boolean result;
	private String firstName;
	private String lastName;
	private String profilePic;
	
	public UserLoginResult(boolean result, String firstName, String lastName, String profilePic)
	{
		this.result = result;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePic = profilePic;
	}
	
	public boolean getResult()
	{
		return result;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public String getProfilePic()
	{
		return profilePic;
	}
}

