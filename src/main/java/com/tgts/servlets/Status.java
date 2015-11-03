package com.tgts.servlets;

import java.util.Collection;

import org.json.JSONObject;

public class Status 
{
	private boolean isSuccess;
	public Status(boolean isSuccess)
	{
		this.isSuccess = isSuccess;
				
	}
	
	public boolean isSuccess()
	{
		return isSuccess;
	}

	public JSONObject getJson() 
	{
		return new JSONObject();
	}

	public String getMessage()
	{
		return "";
	}
}
