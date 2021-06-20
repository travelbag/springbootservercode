package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the deliver_goods database table.
 * 
 */
@Entity
@Table(name="deliver_goods")
public class DeliverGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DG_ID")
	private int dgId;

	@Column(name="ARRIVAL_DATE")
	private String arrivalDate;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="DELETED")
	private int deleted;

	@Column(name="ISACCOMPANY")
	private int isAccompany;

	@Column(name="ISACTIVE")
	private int isActive;
	
	@Column(name="ITEMID")
	private String itemId;

	@Column(name="ITEMNAME")
	private String itemName;

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

	private int userId;

	private String weight;

	public DeliverGood() {
	}

	public int getDgId() {
		return this.dgId;
	}

	public void setDgId(int dgId) {
		this.dgId = dgId;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getDeleted() {
		return this.deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getIsAccompany() {
		return this.isAccompany;
	}

	public void setIsAccompany(int isAccompany) {
		this.isAccompany = isAccompany;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTipAmount() {
		return this.tipAmount;
	}

	public void setTipAmount(String tipAmount) {
		this.tipAmount = tipAmount;
	}

	public String getTransportName() {
		return this.transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getTransportType() {
		return this.transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getTravellingDate() {
		return this.travellingDate;
	}

	public void setTravellingDate(String travellingDate) {
		this.travellingDate = travellingDate;
	}

	public String getTravellingFrom() {
		return this.travellingFrom;
	}

	public void setTravellingFrom(String travellingFrom) {
		this.travellingFrom = travellingFrom;
	}

	public String getTravellingTo() {
		return this.travellingTo;
	}

	public void setTravellingTo(String travellingTo) {
		this.travellingTo = travellingTo;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}