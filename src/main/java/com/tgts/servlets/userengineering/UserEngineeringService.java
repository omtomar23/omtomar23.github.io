package com.tgts.servlets.userengineering;

import com.tgts.servlets.TailerAppService;

public interface UserEngineeringService extends TailerAppService
{
	boolean createUser(CreateUserCommand createUserCommand);
}
