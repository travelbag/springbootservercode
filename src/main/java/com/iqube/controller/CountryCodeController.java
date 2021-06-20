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

import com.iqube.model.CountryCode;
import com.iqube.service.CountryCodeService;

@RestController
public class CountryCodeController {
	// autowired the CountryCodeService class
	@Autowired
	CountryCodeService countryCodeService;

	//creating a get mapping that retrieves all the countryCodes detail from the database 
	@GetMapping("/countryCode")
	private List<CountryCode> getAllCountryCode() {
		return countryCodeService.getAllCountryCode();
	}

	//creating a get mapping that retrieves the detail of a specific countryCode
	@GetMapping("/countryCode/{id}")
	private CountryCode getCountryCode(@PathVariable("id") int id) {
		return countryCodeService.getCountryCodeById(id);
	}

	//creating a delete mapping that deletes a specific countryCode
	@DeleteMapping("/countryCode/{id}")
	private void deleteCountryCode(@PathVariable("id") int id) {
		countryCodeService.delete(id);
	}

	//creating post mapping that post the countryCode detail in the database
	@PostMapping("/countryCode")
	private int saveCountryCode(@RequestBody CountryCode countryCode) {
		countryCodeService.saveOrUpdate(countryCode);
		return countryCode.getId();
	}
}
