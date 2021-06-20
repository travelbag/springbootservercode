package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.SendGood;
import com.iqube.repository.SendGoodRepository;

@Service
public class SendGoodService {
	@Autowired
	SendGoodRepository sendGoodRepository;

	// getting all sendGood records
	public List<SendGood> getAllSendGood() {
		List<SendGood> sendGoods = new ArrayList<SendGood>();
		sendGoodRepository.findAll().forEach(sendGood -> sendGoods.add(sendGood));
		return sendGoods;
	}

	// getting a specific record
	public SendGood getSendGoodById(int id) {
		return sendGoodRepository.findById(id).get();
	}

	public void saveOrUpdate(SendGood sendGood) {
		sendGoodRepository.save(sendGood);
	}

	// deleting a specific record
	public void delete(int id) {
		sendGoodRepository.deleteById(id);
	}
}
