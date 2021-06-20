package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the payment_details database table.
 * 
 */
@Entity
@Table(name="payment_details")
public class PaymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYMENTID")
	private int paymentId;

	@Column(name="AMOUNT")
	private String amount;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="MEMBERSHIPPLANID")
	private int membershipPlanId;

	@Column(name="PLANID")
	private int planId;

	@Column(name="RECEIPT")
	private String receipt;

	@Column(name="SIGNATURE")
	private String signature;

	@Column(name="STATUS")
	private String status;

	@Column(name="TRANSACTION_ID")
	private String transactionId;

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

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getMembershipPlanId() {
		return membershipPlanId;
	}

	public void setMembershipPlanId(int membershipPlanId) {
		this.membershipPlanId = membershipPlanId;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}