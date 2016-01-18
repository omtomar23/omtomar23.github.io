package com.tgts.servlets.userengineering;

public class UserDetail
{
	private int userId;
	private String userName;

	public UserDetail(int userId, String userName)
	{
		this.userId = userId;
		this.userName = userName;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
}
