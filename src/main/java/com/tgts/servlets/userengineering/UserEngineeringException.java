package com.tgts.servlets.userengineering;

public class UserEngineeringException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

    public UserEngineeringException()
    {
        super();
    }

    public UserEngineeringException(Throwable cause)
    {
        super(cause);
    }
    
    public UserEngineeringException(String message)
    {
        super(message);
    }

}
