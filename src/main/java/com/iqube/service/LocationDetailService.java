package com.iqube.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.LocationDetail;
import com.iqube.repository.LocationDetailRepository;
@Service
public class LocationDetailService
{
	@Autowired
	LocationDetailRepository locationDetailRepository;
	//getting all locationDetail records
	public List<LocationDetail> getAllLocationDetail() 
	{
	List<LocationDetail> locationDetails = new ArrayList<LocationDetail>();
	locationDetailRepository.findAll().forEach(locationDetail -> locationDetails.add(locationDetail));
	return locationDetails;
	}
	//getting a specific record
	public LocationDetail getLocationDetailById(int id) 
	{
	return locationDetailRepository.findById(id).get();
	}
	public void saveOrUpdate(LocationDetail locationDetail) 
	{
	locationDetailRepository.save(locationDetail);
	}
	//deleting a specific record
	public void delete(int id) 
	{
	locationDetailRepository.deleteById(id);
	}
}
