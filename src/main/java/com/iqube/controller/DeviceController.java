package com.iqube.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.Device;
import com.iqube.service.DeviceService;

@RestController
public class DeviceController
{
	//autowired the DeviceService class
	@Autowired
	DeviceService deviceService;

	//creating a get mapping that retrieves all the devices detail from the database 
	@GetMapping("/device")
	private List<Device> getAllDevice() {
		return deviceService.getAllDevice();
	}

	//creating a get mapping that retrieves the detail of a specific device
	@GetMapping("/device/{id}")
	private Device getDevice(@PathVariable("id") int id) {
		return deviceService.getDeviceById(id);
	}

	//creating a delete mapping that deletes a specific device
	@DeleteMapping("/device/{id}")
	private void deleteDevice(@PathVariable("id") int id) {
		deviceService.delete(id);
	}

	//creating post mapping that post the device detail in the database
	@PostMapping("/device")
	private int saveDevice(@RequestBody Device device) {
		deviceService.saveOrUpdate(device);
		return device.getId();
	}
}
