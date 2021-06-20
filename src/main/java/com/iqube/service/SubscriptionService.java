package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.Subscription;
import com.iqube.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
	@Autowired
	SubscriptionRepository subscriptionRepository;

	// getting all subscription records
	public List<Subscription> getAllSubscription() {
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		subscriptionRepository.findAll().forEach(subscription -> subscriptions.add(subscription));
		return subscriptions;
	}

	// getting a specific record
	public Subscription getSubscriptionById(int id) {
		return subscriptionRepository.findById(id).get();
	}

	public void saveOrUpdate(Subscription subscription) {
		subscriptionRepository.save(subscription);
	}

	// deleting a specific record
	public void delete(int id) {
		subscriptionRepository.deleteById(id);
	}
}
