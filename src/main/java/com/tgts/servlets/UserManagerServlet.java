package com.tgts.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogSF;
import org.apache.log4j.Logger;
import org.json.JSONException;

import com.tgts.servlets.persistence.FilePersistenceService;
import com.tgts.servlets.userengineering.CreateUserCommand;
import com.tgts.servlets.userengineering.ReadUsersResult;
import com.tgts.servlets.userengineering.UserEngineeringManager;
import com.tgts.servlets.userengineering.UserEngineeringService;
import com.tgts.servlets.userengineering.UserSignUpSchema;

public class UserManagerServlet extends HttpServlet
{
	private static final Logger logger = Logger.getLogger(AuthenticationServlet.class);
	private static final long serialVersionUID = 1L;
	private UserEngineeringService userEngineeringService;
	private ObjectToJSonMapper objectToJSonMapper = new ObjectToJSonMapper();
	public UserManagerServlet()
	{
		userEngineeringService = new UserEngineeringManager(new FilePersistenceService());
	}
	 /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        if (logger.isInfoEnabled())
            LogSF.info(logger, "doGet <ENTER>  request = {}", request);
        doPost(request, response);
        if (logger.isInfoEnabled())
            logger.info("doGet <LEAVE>");
    }
    
    private static class CommandResponse
    {
    	private boolean success;
    	private int step;
		private String message;
    	
    	public CommandResponse(boolean success, String message, int step)
    	{
    		this.success = success;
			this.message = message;
    		this.step = step;
    	}
    	
    	@SuppressWarnings("unused")
    	public int getStep()
    	{
			return step;
		}
    	@SuppressWarnings("unused")
    	public boolean isSuccess()
    	{
			return success;
		}
    	@SuppressWarnings("unused")
    	public String getMessage() 
    	{
			return message;
		}
    }
    
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        if (logger.isInfoEnabled())
            LogSF.info(logger, "doPost <ENTER>  request = {}", request);
        
        String result = "";
        response.setContentType("application/json");
        
        System.out.println("Inside:UserManagerServlet->Process Command="+ request.getParameter(TailerAppUtil.COMMAND));
        try
        {
            if (request.getParameter(TailerAppUtil.COMMAND).equals(TailerAppUtil.USER_CREATE))
            {
            	result = validateCreateUserCommand(request);
            }
            if (request.getParameter(TailerAppUtil.COMMAND).equals(TailerAppUtil.USER_READ))
            {
            	result = validateReadAllUsers(request);
            }
            else
            {
            	result = updateUserCUDResultWithFailed("invalid request");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
            try
            {
            	result = updateUserCUDResultWithFailed(e.getMessage());
            }
            catch (JSONException e1)
            {
            	System.err.println("JSONException***="+e1);
            }
            
        }
        response.getWriter().write(result);

        if (logger.isInfoEnabled())
            logger.info("doPost <LEAVE>");
    }

    private String updateUserCUDResultWithFailed(String message)throws JSONException 
    {
    	return objectToJSonMapper.mapObjToJSonStr(new CommandResponse(false,message, -1));
	}
    
    private String validateCreateUserCommand(HttpServletRequest request) throws Exception
    {
    	String firstName = request.getParameter(UserSignUpSchema.FIRST_NAME.getSchemaName());
    	String lastName = request.getParameter(UserSignUpSchema.LAST_NAME.getSchemaName());
    	String emailId = request.getParameter(UserSignUpSchema.EMAIL_ID.getSchemaName());
    	String password = request.getParameter(UserSignUpSchema.PASSWORD.getSchemaName());
    	String confirmPassword = request.getParameter(UserSignUpSchema.CONFIRM_PASSWORD.getSchemaName());
    	validatePasswords(password,confirmPassword);
    	boolean result = userEngineeringService.createUser(
    			new CreateUserCommand(firstName, lastName, emailId, password));
    	
    	return objectToJSonMapper.mapObjToJSonStr(new CommandResponse(result, "", 1));
    }
    
    private void validatePasswords(String password, String confirmPassword) throws Exception
    {
        if(!password.equals(confirmPassword))
            throw new Exception("password doesn't match");
        
    }
    
    private String validateReadAllUsers(HttpServletRequest request) throws Exception
    {
    	ReadUsersResult allUser = userEngineeringService.readAllUser();
    	return objectToJSonMapper.mapObjToJSonStr(allUser);
    }
}
