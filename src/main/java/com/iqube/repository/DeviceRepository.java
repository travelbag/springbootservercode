package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.Device;
public interface DeviceRepository extends CrudRepository<Device, Integer>
{
}
