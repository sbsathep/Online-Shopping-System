package com.onlineShopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShopping.Model.UserRegistration;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Integer>
{
	UserRegistrationRepo save(UserRegistrationRepo user_profile);
}
