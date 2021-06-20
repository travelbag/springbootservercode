package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the device database table.
 * 
 */
@Entity
@Table(name="device")
public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="CREATEDATE")
	private Date createDate;

	@Column(name="DEVICE_ID")
	private String device_Id;

	@Column(name="DEVICE_NAME")
	private String deviceName;

	@Column(name="ISACTIVE")
	private int isactive;

	@Column(name="USERID")
	private int userId;

	public Device() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDevice_Id() {
		return this.device_Id;
	}

	public void setDevice_Id(String device_Id) {
		this.device_Id = device_Id;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getIsactive() {
		return this.isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}