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

import com.iqube.model.NotificationDetail;
import com.iqube.service.NotificationDetailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class NotificationDetailController {
	//autowired the NotificationDetailService class
	@Autowired
	NotificationDetailService notificationDetailService;

	//creating a get mapping that retrieves all the notificationDetails detail from the database 
	@GetMapping("/notificationDetail")
	private List<NotificationDetail> getAllNotificationDetail() {
		return notificationDetailService.getAllNotificationDetail();
	}

	//creating a get mapping that retrieves the detail of a specific notificationDetail
	@GetMapping("/notificationDetail/{id}")
	private NotificationDetail getNotificationDetail(@PathVariable("id") int id) {
		return notificationDetailService.getNotificationDetailById(id);
	}

	//creating a delete mapping that deletes a specific notificationDetail
	@DeleteMapping("/notificationDetail/{id}")
	private void deleteNotificationDetail(@PathVariable("id") int id) {
		notificationDetailService.delete(id);
	}

	//creating post mapping that post the notificationDetail detail in the database
	@PostMapping("/notificationDetail")
	private int saveNotificationDetail(@RequestBody NotificationDetail notificationDetail) {
		notificationDetailService.saveOrUpdate(notificationDetail);
		return notificationDetail.getNotificationId();
	}
}
