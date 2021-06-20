package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.RequestStatus;
public interface RequestStatusRepository extends CrudRepository<RequestStatus, Integer>
{
}
