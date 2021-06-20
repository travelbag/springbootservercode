package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.Message;
public interface MessageRepository extends CrudRepository<Message, Integer>
{
}
