package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.MyFavourite;
import com.iqube.repository.MyFavouriteRepository;

@Service
public class MyFavouriteService {
	@Autowired
	MyFavouriteRepository myFavouriteRepository;

	// getting all myFavourite records
	public List<MyFavourite> getAllMyFavourite() {
		List<MyFavourite> myFavourites = new ArrayList<MyFavourite>();
		myFavouriteRepository.findAll().forEach(myFavourite -> myFavourites.add(myFavourite));
		return myFavourites;
	}

	// getting a specific record
	public MyFavourite getMyFavouriteById(int id) {
		return myFavouriteRepository.findById(id).get();
	}

	public void saveOrUpdate(MyFavourite myFavourite) {
		myFavouriteRepository.save(myFavourite);
	}

	// deleting a specific record
	public void delete(int id) {
		myFavouriteRepository.deleteById(id);
	}
}
