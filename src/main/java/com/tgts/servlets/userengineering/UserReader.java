package com.tgts.servlets.userengineering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.self.om.userManagement.User;

public class UserReader
{
	private Map<String, User> entities;
	public UserReader()
	{
		entities = new HashMap<String, User>();
	}
	
	public void updateEntities(List<User> users)
	{
		for (User user : users) 
		{
			entities.put(user.getEmailId(), user);
		}
	}
	
	public void addEntity(User user)
	{
		entities.put(user.getEmailId(), user);
	}
	
	public List<User> getEntities()
	{
		return new ArrayList<User>(entities.values());
	}
	
	public boolean isEntityExist(String id)
	{
		return entities.containsKey(id);
	}
	
	public User getEntityById(String id)
	{
		return entities.get(id);
	}
}
