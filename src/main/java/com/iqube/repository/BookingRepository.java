package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.Booking;
public interface BookingRepository extends CrudRepository<Booking, Integer>
{
}
