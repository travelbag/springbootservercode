package com.iqube.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@Table(name="Booking")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BOOKINGID")
	private int bookingId;

	@Column(name="CREATEDATE")
	private Date createDate;
	
	@Column(name="ISACTIVE")
	private int isActive;
	
	@Column(name="RECEIVER_GOODSID")
	private int receiverGoodsId;
	
	@Column(name="RECEIVER_GOODSTYPE")
	private String receiverGoodsType;
	
	@Column(name="RECEIVER_USERID")
	private int receiverUserId;

	@Column(name="SENDER_GOODSID")
	private int senderGoodsId;

	@Column(name="SENDER_GOODSTYPE")
	private String senderGoodsType;

	@Column(name="SENDER_USERID")
	private int senderUserId;

	@Column(name="STATUS")
	private String status;

	@Column(name="STATUS_CODE")
	private int statusCode;
	
	public Booking() {
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getReceiverGoodsId() {
		return receiverGoodsId;
	}

	public void setReceiverGoodsId(int receiverGoodsId) {
		this.receiverGoodsId = receiverGoodsId;
	}

	public String getReceiverGoodsType() {
		return receiverGoodsType;
	}

	public void setReceiverGoodsType(String receiverGoodsType) {
		this.receiverGoodsType = receiverGoodsType;
	}

	public int getReceiverUserId() {
		return receiverUserId;
	}

	public void setReceiverUserId(int receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public int getSenderGoodsId() {
		return senderGoodsId;
	}

	public void setSenderGoodsId(int senderGoodsId) {
		this.senderGoodsId = senderGoodsId;
	}

	public String getSenderGoodsType() {
		return senderGoodsType;
	}

	public void setSenderGoodsType(String senderGoodsType) {
		this.senderGoodsType = senderGoodsType;
	}

	public int getSenderUserId() {
		return senderUserId;
	}

	public void setSenderUserId(int senderUserId) {
		this.senderUserId = senderUserId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


}