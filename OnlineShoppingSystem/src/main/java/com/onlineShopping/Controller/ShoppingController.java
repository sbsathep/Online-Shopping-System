package com.onlineShopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShopping.Model.User;
import com.onlineShopping.Service.IUser;
@RestController
public class ShoppingController 
{
	@Autowired
	IUser service;
	@PostMapping("/user_profile")
	public ResponseEntity<User> createProduct(@Validated @RequestBody User user_profile)
	{
		System.out.println("Rest");
		User e= service.addUserRegistration(user_profile);
		System.out.println(e);
		return new ResponseEntity<User>(e,HttpStatus.OK);
	}
	
	
	
	 @GetMapping("/getProfile") 
	 public ResponseEntity<List <User>> fetchUser() 
	 {
		 System.out.println("alll"); 
		 List<User>products=service.findAllUser(); 
		 return ResponseEntity.ok().body(products); 
	 }
	 
	
	
	/*
	 * @GetMapping("/user_profile") public ResponseEntity <Optional<User>>
	 * fetchUser(@PathVariable User user) throws Exception { Optional<User>
	 * user=service.findAllUser(user); if(user.isPresent()) { return new
	 * ResponseEntity(user.get(),HttpStatus.OK); } else { throw new
	 * Exception("Record not found..."); } }
	 */
	 
	
	@PutMapping ("/updateProfile/{id}") public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User user_profile) 
	{
		User u = service.updateUser(user_profile);
		return new ResponseEntity<User>(u,HttpStatus.OK); 
	}
	
	
	
	@DeleteMapping("/deleteProfile/{id}")
	  public ResponseEntity<User> deleteProduct(@PathVariable("id") int id)
	{
		System.out.println("alll");
	  User p=service.deleteById(id);
	  return new ResponseEntity<User>(p,HttpStatus.OK); // Products p =
	 // service.deleteProducts(products);
	  }
}
