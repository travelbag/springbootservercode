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

import com.iqube.model.MyFavourite;
import com.iqube.service.MyFavouriteService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MyFavouriteController {
	//autowired the MyFavouriteService class
	@Autowired
	MyFavouriteService myFavouriteService;

	//creating a get mapping that retrieves all the myFavourites detail from the database 
	@GetMapping("/myFavourite")
	private List<MyFavourite> getAllMyFavourite() {
		return myFavouriteService.getAllMyFavourite();
	}

	//creating a get mapping that retrieves the detail of a specific myFavourite
	@GetMapping("/myFavourite/{id}")
	private MyFavourite getMyFavourite(@PathVariable("id") int id) {
		return myFavouriteService.getMyFavouriteById(id);
	}

	//creating a delete mapping that deletes a specific myFavourite
	@DeleteMapping("/myFavourite/{id}")
	private void deleteMyFavourite(@PathVariable("id") int id) {
		myFavouriteService.delete(id);
	}

	//creating post mapping that post the myFavourite detail in the database
	@PostMapping("/myFavourite")
	private int saveMyFavourite(@RequestBody MyFavourite myFavourite) {
		myFavouriteService.saveOrUpdate(myFavourite);
		return myFavourite.getMyFavId();
	}
}
