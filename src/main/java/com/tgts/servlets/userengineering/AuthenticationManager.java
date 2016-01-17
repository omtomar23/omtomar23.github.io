package com.tgts.servlets.userengineering;

import java.util.Arrays;

import com.self.om.userManagement.User;
import com.self.om.userManagement.UserContainer;
import com.tgts.servlets.persistence.FilePersistenceService;

public class AuthenticationManager implements AuthenticationService
{
	private FilePersistenceService filePersistenceService;

	public AuthenticationManager(FilePersistenceService filePersistenceService)
	{
		this.filePersistenceService = filePersistenceService;
	}

	private UserContainer loadUserContainer()
	{
		UserContainer userContainer = (UserContainer)filePersistenceService.load(UserContainer.class.getSimpleName());
		return userContainer;
	}
	
	@Override
	public UserLoginResult login(UserCredential userCredential) 
	{
		UserLoginResult loginResult = new UserLoginResult(false, "", "", "");
		User user = readUserByEmailId(userCredential.getEmailId());
		boolean result = Arrays.equals(user.getPassword(), userCredential.getPassword().getBytes());
		if(result)
		{
			loginResult = new UserLoginResult(true, user.getFirstName(), user.getLastName(), "");
		}
		return loginResult;
	}

	private User readUserByEmailId(String emailId)
	{
		for (User user : loadUserContainer().getUsers()) {
			if(user.getEmailId().equalsIgnoreCase(emailId))
			{
				return user;
			}
		}
		throw new AuthenticationFailedException("User does not exist for emailId="+ emailId);
	}
}
