package com.tgts.servlets.userengineering;

import com.tgts.servlets.TailerAppService;

public interface AuthenticationService extends TailerAppService
{
	UserLoginResult login(UserCredential userCredential);
}
