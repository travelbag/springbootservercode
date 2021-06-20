package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.PlanDetail;
import com.iqube.repository.PlanDetailRepository;

@Service
public class PlanDetailService {
	@Autowired
	PlanDetailRepository planDetailRepository;

	// getting all planDetail records
	public List<PlanDetail> getAllPlanDetail() {
		List<PlanDetail> planDetails = new ArrayList<PlanDetail>();
		planDetailRepository.findAll().forEach(planDetail -> planDetails.add(planDetail));
		return planDetails;
	}

	// getting a specific record
	public PlanDetail getPlanDetailById(int id) {
		return planDetailRepository.findById(id).get();
	}

	public void saveOrUpdate(PlanDetail planDetail) {
		planDetailRepository.save(planDetail);
	}

	// deleting a specific record
	public void delete(int id) {
		planDetailRepository.deleteById(id);
	}
}
