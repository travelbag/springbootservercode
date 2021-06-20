package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notificationdetails database table.
 * 
 */
@Entity
@Table(name="notificationdetails")
public class NotificationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOTIFICATION_ID")
	private int notificationId;

	@Column(name="BOOKINGID")
	private int bookingId;

	@Column(name="CREATEDATE")
	private Date createDate;

	@Column(name="IS_READY")
	private int isReady;

	@Column(name="MESSAGE")
	private String message;

	@Column(name="SENDER_USERID")
	private int senderUserId;

	@Column(name="TO_USERID")
	private int toUserId;

	@Column(name="TYPE")
	private String type;

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getIsReady() {
		return isReady;
	}

	public void setIsReady(int isReady) {
		this.isReady = isReady;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSenderUserId() {
		return senderUserId;
	}

	public void setSenderUserId(int senderUserId) {
		this.senderUserId = senderUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getToUserId() {
		return toUserId;
	}

	public void setToUserId(int toUserId) {
		this.toUserId = toUserId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}