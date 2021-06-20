package com.iqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.LookUp;
import com.iqube.service.LookUpService;

@RestController
public class LookUpController {
	// autowired the LookUpService class
	@Autowired
	LookUpService lookUpService;

	// creating a get mapping that retrieves all the lookUps detail from the
	// database
	@GetMapping("/lookUp")
	private List<LookUp> getAllLookUp() {
		return lookUpService.getAllLookUp();
	}

	// creating a get mapping that retrieves the detail of a specific lookUp
	@GetMapping("/lookUp/{id}")
	private LookUp getLookUp(@PathVariable("id") int id) {
		return lookUpService.getLookUpById(id);
	}

	@GetMapping("/lookUpCd/{lookUpCd}")
	private List<LookUp> getLookUpByCd(@PathVariable("lookUpCd") String lookUpCd) {
		return lookUpService.getLookUpCd(lookUpCd);
	}
	
	// creating a delete mapping that deletes a specific lookUp
	@DeleteMapping("/lookUp/{id}")
	private void deleteLookUp(@PathVariable("id") int id) {
		lookUpService.delete(id);
	}

	// creating post mapping that post the lookUp detail in the database
	@PostMapping("/lookUp")
	private int saveLookUp(@RequestBody LookUp lookUp) {
		lookUpService.saveOrUpdate(lookUp);
		return lookUp.getLookUpId();
	}
}
