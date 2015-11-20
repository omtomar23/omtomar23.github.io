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

/**
 * 
 * @author Om
 *
 */
public class AuthenticationServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AuthenticationServlet.class);
	private static final String SUCCESS = "success";
	private static final String MESSAGE = "message";
	private static final String STEP = "step";
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
        
        
        try
        {
            JSONObject json = new JSONObject(request.getParameter("payload"));
            if (request.getParameter(TgtsUtil.COMMAND).equals("login"))
            {
            	boolean result = validateAndLogin(json);
                jsonResponse.put(SUCCESS, result);
                jsonResponse.put(STEP, 2);
                JSONObject userData = new JSONObject();
                userData.put(TgtsUtil.FIRST_NAME, json.getString("Om").trim());
                userData.put(TgtsUtil.LAST_NAME, json.getString("Singh").trim());
            }
            else
            {
                jsonResponse.put(SUCCESS, false);
                jsonResponse.put(MESSAGE, "invalid request");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
            try
            {
                jsonResponse.put(SUCCESS, false);
                jsonResponse.put(MESSAGE, e.getMessage());
            }
            catch (JSONException e1)
            {
                // TODO Auto-generated catch block 
            }
            
        }
        response.getWriter().write(jsonResponse.toString());

        if (logger.isInfoEnabled())
            logger.info("doPost <LEAVE>");
    }

    private boolean validateAndLogin(JSONObject json) throws Exception
    {
        try
        {
            String emailId = validateAndGet(json,"emailId");
            String password = validateAndGet(json, "password");
            return  new Operations().login(emailId, password);
            
        }
        catch (JSONException e)
        {
            logger.warn("error in json parsing ",e);
            throw new Exception("error in request parsing");
            
        }
    }
    
    private String validateAndGet(JSONObject json,String key) throws Exception
    {
        String value = json.getString(key).trim();
        if(value == null || value.equals("") )
            throw new Exception(key + " is empty");
        return json.getString(key);
    }
    
}
