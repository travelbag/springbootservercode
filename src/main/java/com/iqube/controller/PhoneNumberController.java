package com.iqube.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.PhoneNumber;
import com.iqube.service.PhoneNumberService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PhoneNumberController
{
	//autowired the PhoneNumberService class
	@Autowired
	PhoneNumberService phoneNumberService;

	//creating a get mapping that retrieves all the phoneNumbers detail from the database 
	@GetMapping("/phoneNumber")
	private List<PhoneNumber> getAllPhoneNumber() {
		return phoneNumberService.getAllPhoneNumber();
	}

	//creating a get mapping that retrieves the detail of a specific phoneNumber
	@GetMapping("/phoneNumber/{id}")
	private PhoneNumber getPhoneNumber(@PathVariable("id") int id) {
		return phoneNumberService.getPhoneNumberById(id);
	}

	//creating a delete mapping that deletes a specific phoneNumber
	@DeleteMapping("/phoneNumber/{id}")
	private void deletePhoneNumber(@PathVariable("id") int id) {
		phoneNumberService.delete(id);
	}

	//creating post mapping that post the phoneNumber detail in the database
	@PostMapping("/phoneNumber")
	private int savePhoneNumber(@RequestBody PhoneNumber phoneNumber) {
		phoneNumberService.saveOrUpdate(phoneNumber);
		return phoneNumber.getId();
	}
}
