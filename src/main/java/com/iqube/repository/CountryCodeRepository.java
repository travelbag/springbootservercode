package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.CountryCode;
public interface CountryCodeRepository extends CrudRepository<CountryCode, Integer>
{
}
