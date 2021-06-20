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

import com.iqube.model.RequestStatus;
import com.iqube.service.RequestStatusService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RequestStatusController {
	//autowired the RequestStatusService class
	@Autowired
	RequestStatusService requestStatusService;

	//creating a get mapping that retrieves all the requestStatuss detail from the database 
	@GetMapping("/requestStatus")
	private List<RequestStatus> getAllRequestStatus() {
		return requestStatusService.getAllRequestStatus();
	}

	//creating a get mapping that retrieves the detail of a specific requestStatus
	@GetMapping("/requestStatus/{id}")
	private RequestStatus getRequestStatus(@PathVariable("id") int id) {
		return requestStatusService.getRequestStatusById(id);
	}

	//creating a delete mapping that deletes a specific requestStatus
	@DeleteMapping("/requestStatus/{id}")
	private void deleteRequestStatus(@PathVariable("id") int id) {
		requestStatusService.delete(id);
	}

	//creating post mapping that post the requestStatus detail in the database
	@PostMapping("/requestStatus")
	private int saveRequestStatus(@RequestBody RequestStatus requestStatus) {
		requestStatusService.saveOrUpdate(requestStatus);
		return requestStatus.getRequestId();
	}
}
