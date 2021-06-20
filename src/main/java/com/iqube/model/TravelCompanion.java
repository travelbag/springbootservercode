package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the travel_companion database table.
 * 
 */
@Entity
@Table(name="travel_companion")
public class TravelCompanion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TC_ID")
	private int tcId;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="DELETED")
	private int deleted;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="ITEM")
	private String item;

	@Column(name="TIPAMOUNT")
	private String tipAmount;

	@Column(name="TRANSPORT_NAME")
	private String transportName;

	@Column(name="TRANSPORT_TYPE")
	private String transportType;

	@Column(name="TRAVELLING_DATE")
	private String travellingDate;

	@Column(name="TRAVELLING_FROM")
	private String travellingFrom;

	@Column(name="TRAVELLING_TO")
	private String travellingTo;

	@Column(name="USERID")
	private int userId;

	public int getTcId() {
		return tcId;
	}

	public void setTcId(int tcId) {
		this.tcId = tcId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTipAmount() {
		return tipAmount;
	}

	public void setTipAmount(String tipAmount) {
		this.tipAmount = tipAmount;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getTravellingDate() {
		return travellingDate;
	}

	public void setTravellingDate(String travellingDate) {
		this.travellingDate = travellingDate;
	}

	public String getTravellingFrom() {
		return travellingFrom;
	}

	public void setTravellingFrom(String travellingFrom) {
		this.travellingFrom = travellingFrom;
	}

	public String getTravellingTo() {
		return travellingTo;
	}

	public void setTravellingTo(String travellingTo) {
		this.travellingTo = travellingTo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}