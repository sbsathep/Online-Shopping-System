package com.onlineShopping.Service;

import org.springframework.stereotype.Service;

import com.onlineShopping.Model.UserRegistration;

@Service
public interface UserRegistrationService 
{
	//public UserRegistration addUserRegistration(UserRegistration reg);

	public UserRegistration addUserRegistration(UserRegistration user_profile);
	
}
