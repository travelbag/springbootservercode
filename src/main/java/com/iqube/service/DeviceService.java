package com.iqube.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.iqube.model.Device;
import com.iqube.model.Device;
import com.iqube.repository.DeviceRepository;
@Service
public class DeviceService
{
	@Autowired
	DeviceRepository deviceRepository;
	//getting all device records
	public List<Device> getAllDevice() 
	{
	List<Device> devices = new ArrayList<Device>();
	deviceRepository.findAll().forEach(device -> devices.add(device));
	return devices;
	}
	//getting a specific record
	public Device getDeviceById(int id) 
	{
	return deviceRepository.findById(id).get();
	}
	public void saveOrUpdate(Device device) 
	{
	deviceRepository.save(device);
	}
	//deleting a specific record
	public void delete(int id) 
	{
		deviceRepository.deleteById(id);
	}
}
