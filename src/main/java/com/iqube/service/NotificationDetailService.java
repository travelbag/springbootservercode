package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.NotificationDetail;
import com.iqube.repository.NotificationDetailRepository;

@Service
public class NotificationDetailService {
	@Autowired
	NotificationDetailRepository notificationDetailRepository;

	// getting all notificationDetail records
	public List<NotificationDetail> getAllNotificationDetail() {
		List<NotificationDetail> notificationDetails = new ArrayList<NotificationDetail>();
		notificationDetailRepository.findAll()
				.forEach(notificationDetail -> notificationDetails.add(notificationDetail));
		return notificationDetails;
	}

	// getting a specific record
	public NotificationDetail getNotificationDetailById(int id) {
		return notificationDetailRepository.findById(id).get();
	}

	public void saveOrUpdate(NotificationDetail notificationDetail) {
		notificationDetailRepository.save(notificationDetail);
	}

	// deleting a specific record
	public void delete(int id) {
		notificationDetailRepository.deleteById(id);
	}
}
