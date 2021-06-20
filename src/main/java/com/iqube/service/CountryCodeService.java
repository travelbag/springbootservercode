package com.iqube.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.CountryCode;
import com.iqube.repository.CountryCodeRepository;
@Service
public class CountryCodeService 
{
	@Autowired
	CountryCodeRepository countryCodeRepository;
	//getting all countryCode records
	public List<CountryCode> getAllCountryCode() 
	{
	List<CountryCode> countryCodes = new ArrayList<CountryCode>();
	countryCodeRepository.findAll().forEach(countryCode -> countryCodes.add(countryCode));
	return countryCodes;
	}
	//getting a specific record
	public CountryCode getCountryCodeById(int id) 
	{
	return countryCodeRepository.findById(id).get();
	}
	public void saveOrUpdate(CountryCode countryCode) 
	{
	countryCodeRepository.save(countryCode);
	}
	//deleting a specific record
	public void delete(int id) 
	{
		countryCodeRepository.deleteById(id);
	}
}
