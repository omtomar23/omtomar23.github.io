package com.tgts.servlets.customerorder;

public enum OrderSchema 
{
	FIRST_NAME("firstName"),
	LAST_NAME("lastName"),
	EMAIL_ID("emailId"),
	PHONENO("PhoneNo"),
	ADDRESS("address"),
	GARMENT_TYPE("garmentType"),
	PRICE("price");
	
	OrderSchema(String schemaName)
	{
		this.schemaName = schemaName;
	}
	
	private String schemaName;
	
	public String getSchemaName() 
	{
		return schemaName;
	}
}
