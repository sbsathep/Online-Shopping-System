package com.onlineShopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShopping.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{
	UserRepo save(UserRepo user_profile);

	User deleteByName(User user_profile);
	
}
