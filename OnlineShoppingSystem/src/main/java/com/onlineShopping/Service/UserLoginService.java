package com.onlineShopping.Service;

import org.springframework.stereotype.Service;

import com.onlineShopping.Model.UserLogin;

@Service
public interface UserLoginService 
{
	public UserLogin addUserLogin(UserLogin login);
}
