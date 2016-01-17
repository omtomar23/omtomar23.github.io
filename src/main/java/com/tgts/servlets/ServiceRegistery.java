package com.tgts.servlets;

import java.util.HashMap;
import java.util.Map;

/**
 * Hold the Application services
 */
public class ServiceRegistery 
{
	private Map<String, TailerAppService> services;
	public ServiceRegistery()
	{
		services = new HashMap<String, TailerAppService>();
	}
	
	public void register(String serviceIdentifier, TailerAppService appService)
	{
		services.put(serviceIdentifier, appService);
	}
	
	public TailerAppService getService(String serviceIdentifier)
	{
		return services.get(serviceIdentifier);
	}
	
}
