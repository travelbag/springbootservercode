package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.iqube.model.RequestStatus;
import com.iqube.model.RequestStatus;
import com.iqube.repository.RequestStatusRepository;

@Service
public class RequestStatusService {
	@Autowired
	RequestStatusRepository requestStatusRepository;

	// getting all requestStatus records
	public List<RequestStatus> getAllRequestStatus() {
		List<RequestStatus> requestStatuss = new ArrayList<RequestStatus>();
		requestStatusRepository.findAll().forEach(requestStatus -> requestStatuss.add(requestStatus));
		return requestStatuss;
	}

	// getting a specific record
	public RequestStatus getRequestStatusById(int id) {
		return requestStatusRepository.findById(id).get();
	}

	public void saveOrUpdate(RequestStatus requestStatus) {
		requestStatusRepository.save(requestStatus);
	}

	// deleting a specific record
	public void delete(int id) {
		requestStatusRepository.deleteById(id);
	}
}
