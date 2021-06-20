package com.iqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.DeliverGood;
import com.iqube.service.DeliverGoodService;

@RestController
public class DeliverGoodController {
	//autowired the DeliverGoodService class
	@Autowired
	DeliverGoodService deliverGoodService;

	//creating a get mapping that retrieves all the deliverGoods detail from the database 
	@GetMapping("/deliverGood")
	private List<DeliverGood> getAllDeliverGood() {
		return deliverGoodService.getAllDeliverGood();
	}

	//creating a get mapping that retrieves the detail of a specific deliverGood
	@GetMapping("/deliverGood/{id}")
	private DeliverGood getDeliverGood(@PathVariable("id") int id) {
		return deliverGoodService.getDeliverGoodById(id);
	}

	//creating a delete mapping that deletes a specific deliverGood
	@DeleteMapping("/deliverGood/{id}")
	private void deleteDeliverGood(@PathVariable("id") int id) {
		deliverGoodService.delete(id);
	}

	//creating post mapping that post the deliverGood detail in the database
	@PostMapping("/deliverGood")
	private int saveDeliverGood(@RequestBody DeliverGood deliverGood) {
		deliverGoodService.saveOrUpdate(deliverGood);
		return deliverGood.getDgId();
	}
}
