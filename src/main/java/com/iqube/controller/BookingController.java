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

import com.iqube.model.Booking;
import com.iqube.service.BookingService;

@RestController
public class BookingController {
	// autowired the BookingService class
	@Autowired
	BookingService bookingService;

	// creating a get mapping that retrieves all the bookings detail from the
	// database
	@GetMapping("/booking")
	private List<Booking> getAllBooking() {
		return bookingService.getAllBooking();
	}

	// creating a get mapping that retrieves the detail of a specific booking
	@GetMapping("/booking/{id}")
	private Booking getBooking(@PathVariable("id") int id) {
		return bookingService.getBookingById(id);
	}

	// creating a delete mapping that deletes a specific booking
	@DeleteMapping("/booking/{id}")
	private void deleteBooking(@PathVariable("id") int id) {
		bookingService.delete(id);
	}

	// creating post mapping that post the booking detail in the database
	@PostMapping("/booking")
	private int saveBooking(@RequestBody Booking booking) {
		bookingService.saveOrUpdate(booking);
		return booking.getBookingId();
	}
}
