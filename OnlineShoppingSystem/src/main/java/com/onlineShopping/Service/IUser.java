package com.onlineShopping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onlineShopping.Model.User;

@Service
public interface IUser 
{
	//public UserRegistration addUserRegistration(UserRegistration reg);

	public User addUserRegistration(User user_profile);

	public List<User> findAllUser();

	public User updateUser(User user_profile);

	public User deleteById(int id);

	public Object addUser(User user);

	//public Optional<User> findAllUser(Optional<User> user);

	
}
