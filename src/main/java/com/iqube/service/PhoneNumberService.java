package com.iqube.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.PhoneNumber;
import com.iqube.repository.PhoneNumberRepository;
@Service
public class PhoneNumberService
{
	@Autowired
	PhoneNumberRepository phoneNumberRepository;
	//getting all phoneNumber records
	public List<PhoneNumber> getAllPhoneNumber() 
	{
	List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	phoneNumberRepository.findAll().forEach(phoneNumber -> phoneNumbers.add(phoneNumber));
	return phoneNumbers;
	}
	//getting a specific record
	public PhoneNumber getPhoneNumberById(int id) 
	{
	return phoneNumberRepository.findById(id).get();
	}
	public void saveOrUpdate(PhoneNumber phoneNumber) 
	{
	phoneNumberRepository.save(phoneNumber);
	}
	//deleting a specific record
	public void delete(int id) 
	{
	phoneNumberRepository.deleteById(id);
	}
}
