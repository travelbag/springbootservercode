package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the send_goods database table.
 * 
 */
@Entity
@Table(name="send_goods")
public class SendGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SDID")
	private int sdId;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="DELETED")
	private int deleted;

	@Column(name="DELIVERYLOCATION")
	private String deliveryLocation;

	@Column(name="ISACCOMPANY")
	private int isAccompany;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="ITEM")
	private String item;

	@Column(name="ITEMID")
	private String itemId;

	@Column(name="ITEMNAME")
	private String itemName;

	@Column(name="SENDFROM")
	private String sendFrom;

	@Column(name="SIGNATURE")
	private String signature;

	@Column(name="TIPAMOUNT")
	private String tipAmount;

	@Column(name="USERID")
	private int userId;

	@Column(name="WEIGHT")
	private String weight;

	public int getSdId() {
		return sdId;
	}

	public void setSdId(int sdId) {
		this.sdId = sdId;
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

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public int getIsAccompany() {
		return isAccompany;
	}

	public void setIsAccompany(int isAccompany) {
		this.isAccompany = isAccompany;
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

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSendFrom() {
		return sendFrom;
	}

	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTipAmount() {
		return tipAmount;
	}

	public void setTipAmount(String tipAmount) {
		this.tipAmount = tipAmount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}