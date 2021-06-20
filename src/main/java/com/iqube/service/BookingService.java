package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.Booking;
import com.iqube.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;

	// getting all booking records
	public List<Booking> getAllBooking() {
		List<Booking> bookings = new ArrayList<Booking>();
		bookingRepository.findAll().forEach(booking -> bookings.add(booking));
		return bookings;
	}

	// getting a specific record
	public Booking getBookingById(int id) {
		return bookingRepository.findById(id).get();
	}

	public void saveOrUpdate(Booking booking) {
		bookingRepository.save(booking);
	}

	// deleting a specific record
	public void delete(int id) {
		bookingRepository.deleteById(id);
	}
}
