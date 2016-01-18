package com.tgts.servlets.userengineering;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.self.om.userManagement.User;
import com.self.om.userManagement.UserContainer;
import com.self.om.userManagement.UserManagementFactory;
import com.tgts.servlets.persistence.FilePersistenceService;

public class UserEngineeringManager implements UserEngineeringService
{
	private FilePersistenceService filePersistenceService;
	private UserReader userReader;
	
	public UserEngineeringManager(FilePersistenceService filePersistenceService)
	{
		this.filePersistenceService = filePersistenceService;
		userReader = new UserReader();
		updateUserReader();
	}
	private void updateUserReader()
	{
		UserContainer userContainer = loadUserContainer();
		userReader.updateEntities(userContainer.getUsers());
	}
	
	@Override
	public boolean createUser(CreateUserCommand createUserCommand) 
	{
		if(userReader.isEntityExist(createUserCommand.getEmailId()))
		{
			throw new UserEngineeringException("User already exist, Please enter different emailId");
		}
		
		System.out.println(createUserCommand);
		UserContainer userContainer = loadUserContainer();
		int userId = userContainer.getLastUserId() + 1;
		User user = UserManagementFactory.eINSTANCE.createUser();
		user.setId(userId);
		user.setFirstName(createUserCommand.getFirstName());
		user.setLastName(createUserCommand.getLastName());
		user.setEmailId(createUserCommand.getEmailId());
		user.setPassword(createUserCommand.getPassword().getBytes());
		
		userContainer.setLastUserId(userId);
		userContainer.getUsers().add(user);
		
		userReader.addEntity(EcoreUtil.copy(user));
		filePersistenceService.save(userContainer);
		
		return true;
	}
	
	private UserContainer loadUserContainer()
	{
		UserContainer userContainer = (UserContainer)filePersistenceService.load(UserContainer.class.getSimpleName());
		return userContainer;
	}
	
	@Override
	public ReadUsersResult readAllUser() 
	{
		ReadUsersResult readUsersResult = new ReadUsersResult();
		for (User user : userReader.getEntities()) 
		{
			readUsersResult.addUserDetails(new UserDetail(user.getId(),
					user.getFirstName()+" "+ user.getLastName()));
		}
		return readUsersResult;
	}
}
