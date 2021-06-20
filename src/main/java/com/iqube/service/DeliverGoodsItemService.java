package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.DeliverGoodsItem;
import com.iqube.repository.DeliverGoodsItemRepository;

@Service
public class DeliverGoodsItemService {
	@Autowired
	DeliverGoodsItemRepository deliverGoodsItemRepository;

	// getting all deliverGoodsItem records
	public List<DeliverGoodsItem> getAllDeliverGoodsItem() {
		List<DeliverGoodsItem> deliverGoodsItems = new ArrayList<DeliverGoodsItem>();
		deliverGoodsItemRepository.findAll().forEach(deliverGoodsItem -> deliverGoodsItems.add(deliverGoodsItem));
		return deliverGoodsItems;
	}

	// getting a specific record
	public DeliverGoodsItem getDeliverGoodsItemById(int id) {
		return deliverGoodsItemRepository.findById(id).get();
	}

	public void saveOrUpdate(DeliverGoodsItem deliverGoodsItem) {
		deliverGoodsItemRepository.save(deliverGoodsItem);
	}

	// deleting a specific record
	public void delete(int id) {
		deliverGoodsItemRepository.deleteById(id);
	}
}
