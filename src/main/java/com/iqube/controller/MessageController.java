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

import com.iqube.model.Message;
import com.iqube.service.MessageService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MessageController {
	//autowired the MessageService class
	@Autowired
	MessageService messageService;

	//creating a get mapping that retrieves all the messages detail from the database 
	@GetMapping("/message")
	private List<Message> getAllMessage() {
		return messageService.getAllMessage();
	}

	//creating a get mapping that retrieves the detail of a specific message
	@GetMapping("/message/{id}")
	private Message getMessage(@PathVariable("id") int id) {
		return messageService.getMessageById(id);
	}

	//creating a delete mapping that deletes a specific message
	@DeleteMapping("/message/{id}")
	private void deleteMessage(@PathVariable("id") int id) {
		messageService.delete(id);
	}

	//creating post mapping that post the message detail in the database
	@PostMapping("/message")
	private int saveMessage(@RequestBody Message message) {
		messageService.saveOrUpdate(message);
		return message.getId();
	}
}
