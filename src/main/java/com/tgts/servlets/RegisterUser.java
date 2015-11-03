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
 * Servlet implementation class RegisterUser
 */
public class RegisterUser extends HttpServlet
{
	private static final Logger logger = Logger.getLogger(RegisterUser.class);
    private static final String FEMALE = "female";
    private static final String MALE = "male";
    private static final String PASSWORD1 = "password1";
    private static final String PASSWORD2 = "password2";
     private static final String EMAIL = "emailId";
    private static final String LAST_NAME = "lastName";
    private static final String FIRST_NAME = "firstName";
    private static final String GENDER = "gender";
    private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String MESSAGE = "message";
	private static final String STEP = "step";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser()
    {
        super();
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
            if (request.getParameter(TgtsUtil.COMMAND).equals("step0"))
            {
                long id = validateAndSave(json);
                jsonResponse.put(SUCCESS, true);
                jsonResponse.put(STEP, 1);
                JSONObject userData = new JSONObject();
                userData.put(TgtsUtil.FIRST_NAME, json.getString(FIRST_NAME).trim());
                userData.put(TgtsUtil.LAST_NAME, json.getString(LAST_NAME).trim());
                userData.put(TgtsUtil.USER_ID, id);
                String s = id + TgtsUtil.KEY;
                userData.put(TgtsUtil.AUTH_DATA, new String(java.util.Base64.getEncoder().encode(s.getBytes())));
                jsonResponse.put(TgtsUtil.USER_DATA, userData);
            }
            else if(request.getParameter(TgtsUtil.COMMAND).equals("step1"))
            {
                String userId = request.getParameter(TgtsUtil.USER_ID);
                String authData = request.getParameter(TgtsUtil.AUTH_DATA);
                if(isUserValid(userId,authData))
                {
                    int teamId = (int)json.get("teamId");
                    Operations operations = new Operations();
                    Status status = operations.addTeamToUser(Long.valueOf(userId.trim()).longValue(), teamId);
                    if(status.isSuccess())
                    {
                        jsonResponse.put(SUCCESS, true);
                        jsonResponse.put(TgtsUtil.USER_DATA, status.getJson());
                    }
                    else
                    {
                        jsonResponse.put(SUCCESS, false);
                        jsonResponse.put(MESSAGE, status.getMessage());
                    }
                }
                else
                {
                    jsonResponse.put(SUCCESS, false);
                    jsonResponse.put(MESSAGE, "please login first");
                    
                }
                
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

    private boolean isUserValid(String userId, String authData)
    {
        String s = userId + TgtsUtil.KEY;
        String newAuthData = new String(java.util.Base64.getEncoder().encode(s.getBytes()));
        return authData.equalsIgnoreCase(newAuthData);
    }

    private long validateAndSave(JSONObject json) throws Exception
    {
        try
        {
            String firstName = validateAndGet(json,FIRST_NAME);
            String lastName = validateAndGet(json, LAST_NAME);
            String emailId = validateAndGet(json, EMAIL);
            String password1 = validateAndGet(json, PASSWORD1);
            String password2 = validateAndGet(json, PASSWORD2);
            validatePasswords(password1,password2);
            String gender = validateAndGet(json, GENDER);
            if(!(gender.equalsIgnoreCase(MALE) || gender.equalsIgnoreCase(FEMALE)))
                throw new Exception("Gender is not valid");
            return  new Operations().addUser(firstName,lastName,emailId,"","TGTS","india",gender,password1);
            
            
            
        }
        catch (JSONException e)
        {
            logger.warn("error in json parsing ",e);
            throw new Exception("error in request parsing");
            
        }
    }

    private void validatePasswords(String password12, String password22) throws Exception
    {
        if(!password12.equals(password22))
            throw new Exception("password doesn't match");
        
    }

    private String validateAndGet(JSONObject json,String key) throws Exception
    {
        String value = json.getString(key).trim();
        if(value == null || value.equals("") )
            throw new Exception(key + " is empty");
        return json.getString(key);
    }
    
}
