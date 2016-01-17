package com.tgts.servlets.userengineering;

public final class UserCredential 
{
	private final String emailId;
	private final String password;
	public UserCredential(String emailId, String password)
	{
		this.emailId = emailId;
		this.password = password;
	}
	public String getEmailId() 
	{
		return emailId;
	}

	public String getPassword() 
	{
		return password;
	}

}
