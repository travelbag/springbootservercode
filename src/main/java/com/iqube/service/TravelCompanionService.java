package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.TravelCompanion;
import com.iqube.repository.TravelCompanionRepository;

@Service
public class TravelCompanionService {

	@Autowired
	TravelCompanionRepository travelCompanionRepository;

	// getting all travelCompanion records
	public List<TravelCompanion> getAllTravelCompanion() {
		List<TravelCompanion> travelCompanions = new ArrayList<TravelCompanion>();
		travelCompanionRepository.findAll().forEach(travelCompanion -> travelCompanions.add(travelCompanion));
		return travelCompanions;
	}

	// getting a specific record
	public TravelCompanion getTravelCompanionById(int id) {
		return travelCompanionRepository.findById(id).get();
	}

	public void saveOrUpdate(TravelCompanion travelCompanion) {
		travelCompanionRepository.save(travelCompanion);
	}

	// deleting a specific record
	public void delete(int id) {
		travelCompanionRepository.deleteById(id);
	}
}
