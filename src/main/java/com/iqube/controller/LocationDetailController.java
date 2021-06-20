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

import com.iqube.model.LocationDetail;
import com.iqube.service.LocationDetailService;

@RestController
public class LocationDetailController
{
	//autowired the LocationDetailService class
	@Autowired
	LocationDetailService locationDetailService;

	//creating a get mapping that retrieves all the locationDetails detail from the database 
	@GetMapping("/locationDetail")
	private List<LocationDetail> getAllLocationDetail() {
		return locationDetailService.getAllLocationDetail();
	}

	//creating a get mapping that retrieves the detail of a specific locationDetail
	@GetMapping("/locationDetail/{id}")
	private LocationDetail getLocationDetail(@PathVariable("id") int id) {
		return locationDetailService.getLocationDetailById(id);
	}

	//creating a delete mapping that deletes a specific locationDetail
	@DeleteMapping("/locationDetail/{id}")
	private void deleteLocationDetail(@PathVariable("id") int id) {
		locationDetailService.delete(id);
	}

	//creating post mapping that post the locationDetail detail in the database
	@PostMapping("/locationDetail")
	private int saveLocationDetail(@RequestBody LocationDetail locationDetail) {
		locationDetailService.saveOrUpdate(locationDetail);
		return locationDetail.getId();
	}
}
