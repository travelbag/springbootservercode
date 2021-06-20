package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.Message;
import com.iqube.repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
	MessageRepository messageRepository;

	// getting all message records
	public List<Message> getAllMessage() {
		List<Message> messages = new ArrayList<Message>();
		messageRepository.findAll().forEach(message -> messages.add(message));
		return messages;
	}

	// getting a specific record
	public Message getMessageById(int id) {
		return messageRepository.findById(id).get();
	}

	public void saveOrUpdate(Message message) {
		messageRepository.save(message);
	}

	// deleting a specific record
	public void delete(int id) {
		messageRepository.deleteById(id);
	}
}
