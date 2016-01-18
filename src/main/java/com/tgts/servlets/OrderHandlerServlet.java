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

import com.self.om.tailerManagement.GarmentType;
import com.tgts.servlets.customerorder.CreateOrderRequest;
import com.tgts.servlets.customerorder.CreateOrderResult;
import com.tgts.servlets.customerorder.CustomerDetails;
import com.tgts.servlets.customerorder.OrderDetails;
import com.tgts.servlets.customerorder.OrderHandlerManager;
import com.tgts.servlets.customerorder.OrderSchema;
import com.tgts.servlets.persistence.FilePersistenceService;

public class OrderHandlerServlet extends HttpServlet
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
        
        System.out.println("Inside:OrderHandleServlet->Process Command="+ request.getParameter(TailerAppUtil.COMMAND));
        try
        {
            if (request.getParameter(TailerAppUtil.COMMAND).equals(TailerAppUtil.ORDER_CREATE))
            {
            	boolean result = validateCreateOrder(request);
                jsonResponse.put(TailerAppUtil.SUCCESS, result);
                jsonResponse.put(TailerAppUtil.STEP, 2);
            }
            else
            {
            	updateOrderCUDResultWithFailed(jsonResponse, "invalid request");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
            try
            {
            	updateOrderCUDResultWithFailed(jsonResponse, e.getMessage());
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

    private void updateOrderCUDResultWithFailed(JSONObject jsonResponse, String message)throws JSONException 
    {
		jsonResponse.put(TailerAppUtil.SUCCESS, false);
		jsonResponse.put(TailerAppUtil.MESSAGE, message);
	}
    
    private boolean validateCreateOrder(HttpServletRequest request) throws Exception
    {
    	String firstName = request.getParameter(OrderSchema.FIRST_NAME.getSchemaName());
    	String lastName = request.getParameter(OrderSchema.LAST_NAME.getSchemaName());
    	String emailId = request.getParameter(OrderSchema.EMAIL_ID.getSchemaName());
    	String phoneNo = request.getParameter(OrderSchema.PHONENO.getSchemaName());
    	String address = request.getParameter(OrderSchema.ADDRESS.getSchemaName());
    	
    	String garmentType = request.getParameter(OrderSchema.GARMENT_TYPE.getSchemaName());
    	String price = request.getParameter(OrderSchema.PRICE.getSchemaName());
    	
    	OrderHandlerManager orderHandlerManager = new OrderHandlerManager(new FilePersistenceService());
    	
    	CustomerDetails customerDetails = new CustomerDetails(firstName, lastName, emailId, phoneNo, address);
    	OrderDetails orderDetails = new OrderDetails(getGarmentType(garmentType), getPrice(price));
    	CreateOrderResult createOrderResult = orderHandlerManager.createOder(new CreateOrderRequest(customerDetails, 
    			orderDetails));
    	
    	return createOrderResult.getResult();
    }
   
    private double getPrice(String price)
    {
    	return Double.parseDouble(price);
    }
    
    private GarmentType getGarmentType(String garmentType)
    {
    	for (GarmentType garmentType2 : GarmentType.values()) 
    	{
    		if( garmentType2.getName().equalsIgnoreCase(garmentType))
    		{
    			return garmentType2;
    		}
		}
    	
    	throw new RuntimeException("Provided garmentType not supported:"+ garmentType);
    }
}
