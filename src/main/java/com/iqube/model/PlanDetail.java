package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the plandetails database table.
 * 
 */
@Entity
@Table(name="plandetails")
public class PlanDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PLANID")
	private int planId;

	@Column(name="AMOUNT")
	private String amount;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="CURRENCY")
	private String currency;

	@Column(name="ISACTIVE")
	private String isActive;

	@Column(name="MONTH")
	private int month;

	@Column(name="PLANNAME")
	private String planName;

	@Column(name="STRIPEPLANID")
	private String stripePlanId;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getStripePlanId() {
		return stripePlanId;
	}

	public void setStripePlanId(String stripePlanId) {
		this.stripePlanId = stripePlanId;
	}

}