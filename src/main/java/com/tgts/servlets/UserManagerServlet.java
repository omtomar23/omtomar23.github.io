package com.tgts.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogSF;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.tgts.servlets.persistence.FilePersistenceService;
import com.tgts.servlets.userengineering.CreateUserCommand;
import com.tgts.servlets.userengineering.UserEngineeringManager;
import com.tgts.servlets.userengineering.UserSignUpSchema;

public class UserManagerServlet extends HttpServlet
{
	private static final Logger logger = Logger.getLogger(AuthenticationServlet.class);
	private static final long serialVersionUID = 1L;

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
    
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        if (logger.isInfoEnabled())
            LogSF.info(logger, "doPost <ENTER>  request = {}", request);
        
        
        JSONObject jsonResponse = new JSONObject();
        response.setContentType("application/json");
        
        System.out.println("ENter---"+ request.getParameter(TailerAppUtil.COMMAND));
        try
        {
            if (request.getParameter(TailerAppUtil.COMMAND).equals(TailerAppUtil.USER_CREATE))
            {
            	boolean result = validateCreateUserCommand(request);
                jsonResponse.put(TailerAppUtil.SUCCESS, result);
                jsonResponse.put(TailerAppUtil.STEP, 1);
            }
            else
            {
            	updateUserCUDResultWithFailed(jsonResponse, "invalid request");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
            try
            {
            	updateUserCUDResultWithFailed(jsonResponse, e.getMessage());
            }
            catch (JSONException e1)
            {
            	System.err.println("JSONException***="+e1);
            }
            
        }
        response.getWriter().write(jsonResponse.toString());

        if (logger.isInfoEnabled())
            logger.info("doPost <LEAVE>");
    }

    private void updateUserCUDResultWithFailed(JSONObject jsonResponse, String message)throws JSONException 
    {
		jsonResponse.put(TailerAppUtil.SUCCESS, false);
		jsonResponse.put(TailerAppUtil.MESSAGE, message);
	}
    
    private boolean validateCreateUserCommand(HttpServletRequest request) throws Exception
    {
    	String firstName = request.getParameter(UserSignUpSchema.FIRST_NAME.getSchemaName());
    	String lastName = request.getParameter(UserSignUpSchema.LAST_NAME.getSchemaName());
    	String emailId = request.getParameter(UserSignUpSchema.EMAIL_ID.getSchemaName());
    	String password = request.getParameter(UserSignUpSchema.PASSWORD.getSchemaName());
    	String confirmPassword = request.getParameter(UserSignUpSchema.CONFIRM_PASSWORD.getSchemaName());
    	validatePasswords(password,confirmPassword);
    	return new UserEngineeringManager(new FilePersistenceService()).createUser(
    			new CreateUserCommand(firstName, lastName, emailId, password));
    }
    
    private void validatePasswords(String password, String confirmPassword) throws Exception
    {
        if(!password.equals(confirmPassword))
            throw new Exception("password doesn't match");
        
    }
}
