package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.PaymentDetail;
public interface PaymentDetailRepository extends CrudRepository<PaymentDetail, Integer>
{
}
