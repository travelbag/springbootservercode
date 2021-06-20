package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the request_status database table.
 * 
 */
@Entity
@Table(name="request_status")
public class RequestStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REQUESTID")
	private int requestId;

	@Column(name="ACCEPT_GOODSID")
	private int acceptGoodsId;

	@Column(name="ACCEPT_GOODSTYPE")
	private String acceptGoodsType;

	@Column(name="ACCEPT_USERID")
	private int acceptUserId;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="GOODSID")
	private int goodsId;

	@Column(name="GOODSTYPE")
	private String goodsType;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="NOTIFICATION")
	private int notification;

	@Column(name="SEND_USERID")
	private int sendUserId;

	@Column(name="STATUS")
	private String status;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getAcceptGoodsId() {
		return acceptGoodsId;
	}

	public void setAcceptGoodsId(int acceptGoodsId) {
		this.acceptGoodsId = acceptGoodsId;
	}

	public String getAcceptGoodsType() {
		return acceptGoodsType;
	}

	public void setAcceptGoodsType(String acceptGoodsType) {
		this.acceptGoodsType = acceptGoodsType;
	}

	public int getAcceptUserId() {
		return acceptUserId;
	}

	public void setAcceptUserId(int acceptUserId) {
		this.acceptUserId = acceptUserId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getNotification() {
		return notification;
	}

	public void setNotification(int notification) {
		this.notification = notification;
	}

	public int getSendUserId() {
		return sendUserId;
	}

	public void setSendUserId(int sendUserId) {
		this.sendUserId = sendUserId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}