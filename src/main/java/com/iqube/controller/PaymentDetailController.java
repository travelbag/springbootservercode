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

import com.iqube.model.PaymentDetail;
import com.iqube.service.PaymentDetailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PaymentDetailController {
	//autowired the PaymentDetailService class
	@Autowired
	PaymentDetailService paymentDetailService;

	//creating a get mapping that retrieves all the paymentDetails detail from the database 
	@GetMapping("/paymentDetail")
	private List<PaymentDetail> getAllPaymentDetail() {
		return paymentDetailService.getAllPaymentDetail();
	}

	//creating a get mapping that retrieves the detail of a specific paymentDetail
	@GetMapping("/paymentDetail/{id}")
	private PaymentDetail getPaymentDetail(@PathVariable("id") int id) {
		return paymentDetailService.getPaymentDetailById(id);
	}

	//creating a delete mapping that deletes a specific paymentDetail
	@DeleteMapping("/paymentDetail/{id}")
	private void deletePaymentDetail(@PathVariable("id") int id) {
		paymentDetailService.delete(id);
	}

	//creating post mapping that post the paymentDetail detail in the database
	@PostMapping("/paymentDetail")
	private int savePaymentDetail(@RequestBody PaymentDetail paymentDetail) {
		paymentDetailService.saveOrUpdate(paymentDetail);
		return paymentDetail.getPaymentId();
	}
}
