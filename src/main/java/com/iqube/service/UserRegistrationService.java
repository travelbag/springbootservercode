package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.UserRegistration;
import com.iqube.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	// getting all userRegistration records
	public List<UserRegistration> getAllUserRegistration() {
		List<UserRegistration> userRegistrations = new ArrayList<UserRegistration>();
		userRegistrationRepository.findAll().forEach(userRegistration -> userRegistrations.add(userRegistration));
		return userRegistrations;
	}

	// getting a specific record
	public UserRegistration getUserRegistrationById(int id) {
		return userRegistrationRepository.findById(id).get();
	}

	public void saveOrUpdate(UserRegistration userRegistration) {
		userRegistrationRepository.save(userRegistration);
	}

	// deleting a specific record
	public void delete(int id) {
		userRegistrationRepository.deleteById(id);
	}
	
	public UserRegistration getUserByMobileNumber(String mobileNumber) {
		return userRegistrationRepository.findByMobileNumber(mobileNumber);
	}
}
