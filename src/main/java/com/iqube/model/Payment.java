package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@Table(name="payment")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYMENTID")
	private int paymentId;

	@Column(name="AMOUNT")
	private String amount;

	@Column(name="AMOUNTTYPE")
	private String amountType;

	@Column(name="CARDNAME")
	private String cardName;

	@Column(name="CARDNUMBER")
	private String cardnumber;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="CVV2")
	private String cvv2;

	@Column(name="EXPMONTH")
	private int expMonth;

	@Column(name="EXPYEAR")
	private int expYear;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="STATUS")
	private String status;

	@Column(name="STRIPECUSTOMERID")
	private String stripeCustomerId;

	@Column(name="USERID")
	private int userId;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStripeCustomerId() {
		return stripeCustomerId;
	}

	public void setStripeCustomerId(String stripeCustomerId) {
		this.stripeCustomerId = stripeCustomerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}