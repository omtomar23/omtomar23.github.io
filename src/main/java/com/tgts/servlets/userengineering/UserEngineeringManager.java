package com.tgts.servlets.userengineering;

import com.self.om.userManagement.User;
import com.self.om.userManagement.UserContainer;
import com.self.om.userManagement.UserManagementFactory;
import com.tgts.servlets.persistence.FilePersistenceService;

public class UserEngineeringManager implements UserEngineeringService
{
	private FilePersistenceService filePersistenceService;
	public UserEngineeringManager(FilePersistenceService filePersistenceService)
	{
		this.filePersistenceService = filePersistenceService;
	}
	@Override
	public boolean createUser(CreateUserCommand createUserCommand) 
	{
		System.out.println(createUserCommand);
		UserContainer userContainer = loadUserContainer();
		User user = UserManagementFactory.eINSTANCE.createUser();
		user.setFirstName(createUserCommand.getFirstName());
		user.setLastName(createUserCommand.getLastName());
		user.setEmailId(createUserCommand.getEmailId());
		user.setPassword(createUserCommand.getPassword().getBytes());
		
		userContainer.getUsers().add(user);
		filePersistenceService.save(userContainer);
		
		return true;
	}
	
	private UserContainer loadUserContainer()
	{
		UserContainer userContainer = (UserContainer)filePersistenceService.load(UserContainer.class.getSimpleName());
		return userContainer;
	}
}
