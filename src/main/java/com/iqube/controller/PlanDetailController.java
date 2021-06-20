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

import com.iqube.model.PlanDetail;
import com.iqube.service.PlanDetailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PlanDetailController {
	//autowired the PlanDetailService class
	@Autowired
	PlanDetailService planDetailService;

	//creating a get mapping that retrieves all the planDetails detail from the database 
	@GetMapping("/planDetail")
	private List<PlanDetail> getAllPlanDetail() {
		return planDetailService.getAllPlanDetail();
	}

	//creating a get mapping that retrieves the detail of a specific planDetail
	@GetMapping("/planDetail/{id}")
	private PlanDetail getPlanDetail(@PathVariable("id") int id) {
		return planDetailService.getPlanDetailById(id);
	}

	//creating a delete mapping that deletes a specific planDetail
	@DeleteMapping("/planDetail/{id}")
	private void deletePlanDetail(@PathVariable("id") int id) {
		planDetailService.delete(id);
	}

	//creating post mapping that post the planDetail detail in the database
	@PostMapping("/planDetail")
	private int savePlanDetail(@RequestBody PlanDetail planDetail) {
		planDetailService.saveOrUpdate(planDetail);
		return planDetail.getPlanId();
	}
}
