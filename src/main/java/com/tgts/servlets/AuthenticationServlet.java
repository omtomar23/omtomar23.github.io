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
import com.tgts.servlets.userengineering.AuthenticationFailedException;
import com.tgts.servlets.userengineering.AuthenticationManager;
import com.tgts.servlets.userengineering.UserCredential;
import com.tgts.servlets.userengineering.UserLoginResult;

/**
 * 
 */
public class AuthenticationServlet extends HttpServlet
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
            if (request.getParameter(TailerAppUtil.COMMAND).equals("login"))
            {
            	try
            	{
            		UserLoginResult result = validateAndLogin(request);
            		if(result.getResult())
            		{
            			jsonResponse.put(TailerAppUtil.SUCCESS, result.getResult());
                        jsonResponse.put(TailerAppUtil.STEP, 2);
                        JSONObject userData = new JSONObject();
                        userData.put(TailerAppUtil.FIRST_NAME, result.getFirstName());
                        userData.put(TailerAppUtil.LAST_NAME, result.getLastName());
                        
                        jsonResponse.put(TailerAppUtil.USER_DATA, userData);
            		}
            		else
            		{
            			updateLoginResultWithFailed(jsonResponse, "EmailId or password is Incorrect");
            		}
            	}
            	catch(AuthenticationFailedException authenticationFailedException)
            	{
            		logger.warn(authenticationFailedException);
            		updateLoginResultWithFailed(jsonResponse, "EmailId or password is Incorrect");
            	}
            	
            }
            else
            {
            	updateLoginResultWithFailed(jsonResponse, "Invalid request");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
            try
            {
            	updateLoginResultWithFailed(jsonResponse, e.getMessage());
                jsonResponse.put(TailerAppUtil.SUCCESS, false);
                jsonResponse.put(TailerAppUtil.MESSAGE, e.getMessage());
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

	private void updateLoginResultWithFailed(JSONObject jsonResponse, String message)
			throws JSONException {
		jsonResponse.put(TailerAppUtil.SUCCESS, false);
		jsonResponse.put(TailerAppUtil.MESSAGE, message);
	}

    private UserLoginResult validateAndLogin(HttpServletRequest request) throws Exception
    {
    	String emailId = request.getParameter("emailId");
    	String password = request.getParameter("password");
    	
    	return new AuthenticationManager(new FilePersistenceService()).login(new UserCredential(emailId, password));
    } 
}
