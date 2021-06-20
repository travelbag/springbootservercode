package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.Payment;
import com.iqube.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	// getting all payment records
	public List<Payment> getAllPayment() {
		List<Payment> payments = new ArrayList<Payment>();
		paymentRepository.findAll().forEach(payment -> payments.add(payment));
		return payments;
	}

	// getting a specific record
	public Payment getPaymentById(int id) {
		return paymentRepository.findById(id).get();
	}

	public void saveOrUpdate(Payment payment) {
		paymentRepository.save(payment);
	}

	// deleting a specific record
	public void delete(int id) {
		paymentRepository.deleteById(id);
	}
}
