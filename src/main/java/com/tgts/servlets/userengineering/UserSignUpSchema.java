package com.tgts.servlets.userengineering;

public enum UserSignUpSchema 
{
	FIRST_NAME("firstName"),
	LAST_NAME("lastName"),
	EMAIL_ID("emailId"),
	PASSWORD("password"),
	CONFIRM_PASSWORD("confirmPassword");
	
	
	UserSignUpSchema(String schemaName)
	{
		this.schemaName = schemaName;
	}
	
	private String schemaName;
	
	public String getSchemaName() 
	{
		return schemaName;
	}
}
