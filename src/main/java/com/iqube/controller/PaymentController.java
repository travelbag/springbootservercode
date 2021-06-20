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

import com.iqube.model.Payment;
import com.iqube.service.PaymentService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PaymentController {
	//autowired the PaymentService class
	@Autowired
	PaymentService paymentService;

	//creating a get mapping that retrieves all the payments detail from the database 
	@GetMapping("/payment")
	private List<Payment> getAllPayment() {
		return paymentService.getAllPayment();
	}

	//creating a get mapping that retrieves the detail of a specific payment
	@GetMapping("/payment/{id}")
	private Payment getPayment(@PathVariable("id") int id) {
		return paymentService.getPaymentById(id);
	}

	//creating a delete mapping that deletes a specific payment
	@DeleteMapping("/payment/{id}")
	private void deletePayment(@PathVariable("id") int id) {
		paymentService.delete(id);
	}

	//creating post mapping that post the payment detail in the database
	@PostMapping("/payment")
	private int savePayment(@RequestBody Payment payment) {
		paymentService.saveOrUpdate(payment);
		return payment.getPaymentId();
	}
}
