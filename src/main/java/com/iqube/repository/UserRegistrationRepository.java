package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.UserRegistration;
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Integer>
{
	UserRegistration findByMobileNumber(String mobileNumber);
}
