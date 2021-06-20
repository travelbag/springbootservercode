package com.iqube.repository;

import org.springframework.data.repository.CrudRepository;

import com.iqube.model.PhoneNumber;

public interface PhoneNumberRepository extends CrudRepository<PhoneNumber, Integer> {
}
