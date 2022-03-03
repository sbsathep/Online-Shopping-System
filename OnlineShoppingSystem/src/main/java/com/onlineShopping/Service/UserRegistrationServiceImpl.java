package com.onlineShopping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShopping.Model.UserRegistration;
import com.onlineShopping.Repository.UserRegistrationRepo;

@Service("userRegistrationServiceImpl")
public class UserRegistrationServiceImpl implements UserRegistrationService
{
	@Autowired
	UserRegistrationRepo dao;
	public UserRegistration saveUserRegistratio(UserRegistration user_profile) {
	UserRegistration registrations=dao.save(user_profile);
	return user_profile;
	}
	@Override
	public UserRegistration addUserRegistration(UserRegistration user_profile) {
		// TODO Auto-generated method stub
		UserRegistration registrations=dao.save(user_profile);
		return user_profile;
	}
}
