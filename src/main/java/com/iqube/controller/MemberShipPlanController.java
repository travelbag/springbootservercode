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

import com.iqube.model.MemberShipPlan;
import com.iqube.service.MemberShipPlanService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MemberShipPlanController {
	//autowired the MemberShipPlanService class
	@Autowired
	MemberShipPlanService memberShipPlanService;

	//creating a get mapping that retrieves all the memberShipPlans detail from the database 
	@GetMapping("/memberShipPlan")
	private List<MemberShipPlan> getAllMemberShipPlan() {
		return memberShipPlanService.getAllMemberShipPlan();
	}

	//creating a get mapping that retrieves the detail of a specific memberShipPlan
	@GetMapping("/memberShipPlan/{id}")
	private MemberShipPlan getMemberShipPlan(@PathVariable("id") int id) {
		return memberShipPlanService.getMemberShipPlanById(id);
	}

	//creating a delete mapping that deletes a specific memberShipPlan
	@DeleteMapping("/memberShipPlan/{id}")
	private void deleteMemberShipPlan(@PathVariable("id") int id) {
		memberShipPlanService.delete(id);
	}

	//creating post mapping that post the memberShipPlan detail in the database
	@PostMapping("/memberShipPlan")
	private int saveMemberShipPlan(@RequestBody MemberShipPlan memberShipPlan) {
		memberShipPlanService.saveOrUpdate(memberShipPlan);
		return memberShipPlan.getMembershipPlanId();
	}
}
