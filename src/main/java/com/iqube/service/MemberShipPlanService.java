package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.MemberShipPlan;
import com.iqube.repository.MemberShipPlanRepository;

@Service
public class MemberShipPlanService {
	@Autowired
	MemberShipPlanRepository memberShipPlanRepository;

	// getting all memberShipPlan records
	public List<MemberShipPlan> getAllMemberShipPlan() {
		List<MemberShipPlan> memberShipPlans = new ArrayList<MemberShipPlan>();
		memberShipPlanRepository.findAll().forEach(memberShipPlan -> memberShipPlans.add(memberShipPlan));
		return memberShipPlans;
	}

	// getting a specific record
	public MemberShipPlan getMemberShipPlanById(int id) {
		return memberShipPlanRepository.findById(id).get();
	}

	public void saveOrUpdate(MemberShipPlan memberShipPlan) {
		memberShipPlanRepository.save(memberShipPlan);
	}

	// deleting a specific record
	public void delete(int id) {
		memberShipPlanRepository.deleteById(id);
	}
}
