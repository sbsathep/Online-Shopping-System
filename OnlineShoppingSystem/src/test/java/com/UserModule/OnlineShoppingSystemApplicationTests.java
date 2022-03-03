package com.UserModule;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.onlineShopping.Model.User;
import com.onlineShopping.Repository.UserRepo;
import com.onlineShopping.Service.IUser;

@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineShoppingSystemApplicationTests 
{
	@Autowired
	private IUser service;
	
	@MockBean
	private UserRepo repository;

	@Test
	public void getUserAddTest() 
	{
		when(repository.findAll()).thenReturn(
				Stream.of(new User(123, "Vijay", "Telengana","vd23" , "abcd987",12345,"abcd987", "abcd987"),
						new User(124,"Deverkonda","Andhra Pradesh","vd123","abcd777",123456,"abcd777","abcd777"))
				.collect(Collectors.toList()));
		
		assertEquals(1,service.findAllUser().size());
	}

	
	/*
	 * @Test public void saveUser() { User user=new
	 * User(125,"Delhi","Vijay",123456787,"vijay987","vijay987","vijay123");
	 * when(repository.save(user)).thenReturn(user);
	 * 
	 * 
	 * assertEquals(user, service.addUser(user)); }
	 */
}
