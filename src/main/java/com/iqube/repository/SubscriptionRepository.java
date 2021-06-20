package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.Subscription;
public interface SubscriptionRepository extends CrudRepository<Subscription, Integer>
{
}
