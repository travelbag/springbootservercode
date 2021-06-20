package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.PaymentDetail;
import com.iqube.repository.PaymentDetailRepository;

@Service
public class PaymentDetailService {
	@Autowired
	PaymentDetailRepository paymentDetailRepository;

	// getting all paymentDetail records
	public List<PaymentDetail> getAllPaymentDetail() {
		List<PaymentDetail> paymentDetails = new ArrayList<PaymentDetail>();
		paymentDetailRepository.findAll().forEach(paymentDetail -> paymentDetails.add(paymentDetail));
		return paymentDetails;
	}

	// getting a specific record
	public PaymentDetail getPaymentDetailById(int id) {
		return paymentDetailRepository.findById(id).get();
	}

	public void saveOrUpdate(PaymentDetail paymentDetail) {
		paymentDetailRepository.save(paymentDetail);
	}

	// deleting a specific record
	public void delete(int id) {
		paymentDetailRepository.deleteById(id);
	}
}
