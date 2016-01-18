package com.tgts.servlets.customerorder;

public class CreateOrderResult 
{
	private String message;
	private boolean result;
	public CreateOrderResult(boolean result, String message)
	{
		this.result = result;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public boolean getResult()
	{
		return result;
	}
	

}
