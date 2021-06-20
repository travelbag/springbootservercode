package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.DeliverGood;
import com.iqube.repository.DeliverGoodRepository;

@Service
public class DeliverGoodService {
	@Autowired
	DeliverGoodRepository deliverGoodRepository;

	// getting all deliverGood records
	public List<DeliverGood> getAllDeliverGood() {
		List<DeliverGood> deliverGoods = new ArrayList<DeliverGood>();
		deliverGoodRepository.findAll().forEach(deliverGood -> deliverGoods.add(deliverGood));
		return deliverGoods;
	}

	// getting a specific record
	public DeliverGood getDeliverGoodById(int id) {
		return deliverGoodRepository.findById(id).get();
	}

	public void saveOrUpdate(DeliverGood deliverGood) {
		deliverGoodRepository.save(deliverGood);
	}

	// deleting a specific record
	public void delete(int id) {
		deliverGoodRepository.deleteById(id);
	}
}
