package com.iqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.UserRegistration;
import com.iqube.service.UserRegistrationService;

@RestController
public class UserRegistrationController {
	//autowired the UserRegistrationService class
	@Autowired
	UserRegistrationService userRegistrationService;

	//creating a get mapping that retrieves all the userRegistrations detail from the database 
	@GetMapping("/userRegistration")
	private List<UserRegistration> getAllUserRegistration() {
		return userRegistrationService.getAllUserRegistration();
	}

	//creating a get mapping that retrieves the detail of a specific userRegistration
	@GetMapping("/userRegistration/{id}")
	private UserRegistration getUserRegistration(@PathVariable("id") int id) {
		return userRegistrationService.getUserRegistrationById(id);
	}

	//creating a delete mapping that deletes a specific userRegistration
	@DeleteMapping("/userRegistration/{id}")
	private void deleteUserRegistration(@PathVariable("id") int id) {
		userRegistrationService.delete(id);
	}

	//creating post mapping that post the userRegistration detail in the database
	@PostMapping("/userRegistration")
	private int saveUserRegistration(@RequestBody UserRegistration userRegistration) {
		userRegistrationService.saveOrUpdate(userRegistration);
		return userRegistration.getUserId();
	}
	
	@PostMapping("/validateUser")
	private boolean getUser(@RequestBody UserRegistration userRegistration) {
		UserRegistration loginUser = userRegistrationService.getUserByMobileNumber(userRegistration.getMobileNumber());
		if(loginUser != null && loginUser.getPassword().equalsIgnoreCase(userRegistration.getPassword()))
			return true;
		else 
			return false;
	}
}
