package com.tgts.servlets.userengineering;

import java.util.ArrayList;
import java.util.List;

public class ReadUsersResult 
{
	private List<UserDetail> userDetails;
	
	public ReadUsersResult()
	{
		userDetails = new ArrayList<UserDetail>();
	}
	
	public void addUserDetails(UserDetail userDetail)
	{
		userDetails.add(userDetail);
	}
} 
