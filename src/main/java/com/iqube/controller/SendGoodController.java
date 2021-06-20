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

import com.iqube.model.SendGood;
import com.iqube.service.SendGoodService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SendGoodController {
	// autowired the SendGoodService class
	@Autowired
	SendGoodService sendGoodService;

	//creating a get mapping that retrieves all the sendGoods detail from the database 
	@GetMapping("/sendGood")
	private List<SendGood> getAllSendGood() {
		return sendGoodService.getAllSendGood();
	}

	//creating a get mapping that retrieves the detail of a specific sendGood
	@GetMapping("/sendGood/{id}")
	private SendGood getSendGood(@PathVariable("id") int id) {
		return sendGoodService.getSendGoodById(id);
	}

	//creating a delete mapping that deletes a specific sendGood
	@DeleteMapping("/sendGood/{id}")
	private void deleteSendGood(@PathVariable("id") int id) {
		sendGoodService.delete(id);
	}

	//creating post mapping that post the sendGood detail in the database
	@PostMapping("/sendGood")
	private int saveSendGood(@RequestBody SendGood sendGood) {
		sendGoodService.saveOrUpdate(sendGood);
		return sendGood.getSdId();
	}
}
