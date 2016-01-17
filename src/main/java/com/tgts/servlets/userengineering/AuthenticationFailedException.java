package com.tgts.servlets.userengineering;

public class AuthenticationFailedException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public AuthenticationFailedException()
    {
        super();
    }
    
    /**
     * Wraps another exception
     * 
     * @param cause wrapped exception
     */
    public AuthenticationFailedException(Throwable cause)
    {
        super(cause);
    }
    
    /**
     * Constructor
     * 
     * @param message exception description
     */
    public AuthenticationFailedException(String message)
    {
        super(message);
    }
}
