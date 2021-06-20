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

import com.iqube.model.TravelCompanion;
import com.iqube.service.TravelCompanionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TravelCompanionController {
	//autowired the TravelCompanionService class
	@Autowired
	TravelCompanionService travelCompanionService;

	//creating a get mapping that retrieves all the travelCompanions detail from the database 
	@GetMapping("/travelCompanion")
	private List<TravelCompanion> getAllTravelCompanion() {
		return travelCompanionService.getAllTravelCompanion();
	}

	//creating a get mapping that retrieves the detail of a specific travelCompanion
	@GetMapping("/travelCompanion/{id}")
	private TravelCompanion getTravelCompanion(@PathVariable("id") int id) {
		return travelCompanionService.getTravelCompanionById(id);
	}

	//creating a delete mapping that deletes a specific travelCompanion
	@DeleteMapping("/travelCompanion/{id}")
	private void deleteTravelCompanion(@PathVariable("id") int id) {
		travelCompanionService.delete(id);
	}

	//creating post mapping that post the travelCompanion detail in the database
	@PostMapping("/travelCompanion")
	private int saveTravelCompanion(@RequestBody TravelCompanion travelCompanion) {
		travelCompanionService.saveOrUpdate(travelCompanion);
		return travelCompanion.getTcId();
	}
}
