package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.Payment;
public interface PaymentRepository extends CrudRepository<Payment, Integer>
{
}
