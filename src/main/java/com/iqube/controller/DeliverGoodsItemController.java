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

import com.iqube.model.DeliverGoodsItem;
import com.iqube.service.DeliverGoodsItemService;

@RestController
public class DeliverGoodsItemController {
	//autowired the DeliverGoodsItemService class
	@Autowired
	DeliverGoodsItemService deliverGoodsItemService;

	//creating a get mapping that retrieves all the deliverGoodsItems detail from the database 
	@GetMapping("/deliverGoodsItem")
	private List<DeliverGoodsItem> getAllDeliverGoodsItem() {
		return deliverGoodsItemService.getAllDeliverGoodsItem();
	}

	//creating a get mapping that retrieves the detail of a specific deliverGoodsItem
	@GetMapping("/deliverGoodsItem/{id}")
	private DeliverGoodsItem getDeliverGoodsItem(@PathVariable("id") int id) {
		return deliverGoodsItemService.getDeliverGoodsItemById(id);
	}

	//creating a delete mapping that deletes a specific deliverGoodsItem
	@DeleteMapping("/deliverGoodsItem/{id}")
	private void deleteDeliverGoodsItem(@PathVariable("id") int id) {
		deliverGoodsItemService.delete(id);
	}

	//creating post mapping that post the deliverGoodsItem detail in the database
	@PostMapping("/deliverGoodsItem")
	private int saveDeliverGoodsItem(@RequestBody DeliverGoodsItem deliverGoodsItem) {
		deliverGoodsItemService.saveOrUpdate(deliverGoodsItem);
		return deliverGoodsItem.getDgiId();
	}
}
