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

import com.iqube.model.Subscription;
import com.iqube.service.SubscriptionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SubscriptionController {
	//autowired the SubscriptionService class
	@Autowired
	SubscriptionService subscriptionService;

	//creating a get mapping that retrieves all the subscriptions detail from the database 
	@GetMapping("/subscription")
	private List<Subscription> getAllSubscription() {
		return subscriptionService.getAllSubscription();
	}

	//creating a get mapping that retrieves the detail of a specific subscription
	@GetMapping("/subscription/{id}")
	private Subscription getSubscription(@PathVariable("id") int id) {
		return subscriptionService.getSubscriptionById(id);
	}

	//creating a delete mapping that deletes a specific subscription
	@DeleteMapping("/subscription/{id}")
	private void deleteSubscription(@PathVariable("id") int id) {
		subscriptionService.delete(id);
	}

	//creating post mapping that post the subscription detail in the database
	@PostMapping("/subscription")
	private int saveSubscription(@RequestBody Subscription subscription) {
		subscriptionService.saveOrUpdate(subscription);
		return subscription.getId();
	}
}
