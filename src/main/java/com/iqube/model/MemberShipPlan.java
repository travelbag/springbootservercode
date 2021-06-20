package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the membership_plan database table.
 * 
 */
@Entity
@Table(name="membership_plan")
public class MemberShipPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEMBERSHIPPLANID")
	private int membershipPlanId;

	@Column(name="AUTORENEWAL")
	private byte autoRenewal;

	@Column(name="CREATEDATE")
	private Timestamp createdate;

	@Column(name="ISACTIVE")
	private String isActive;

	@Column(name="PLAN_EXPIREDATE")
	private String planExpiredate;

	@Column(name="PLAN_STARTDATE")
	private String planStartdate;

	@Column(name="PLANID")
	private String planId;

	@Column(name="STATUS")
	private String status;

	@Column(name="SUBSCRIPTION_CANCELID")
	private String subscriptionCancelId;

	@Column(name="SUBSCRIPTIONID")
	private String subscriptionId;

	private int userId;

	public MemberShipPlan() {
	}

	public int getMembershipPlanId() {
		return this.membershipPlanId;
	}

	public void setMembershipPlanId(int membershipPlanId) {
		this.membershipPlanId = membershipPlanId;
	}

	public byte getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(byte autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPlanExpiredate() {
		return this.planExpiredate;
	}

	public void setPlanExpiredate(String planExpiredate) {
		this.planExpiredate = planExpiredate;
	}

	public String getPlanStartdate() {
		return this.planStartdate;
	}

	public void setPlanStartdate(String planStartdate) {
		this.planStartdate = planStartdate;
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}

	public String getSubscriptionCancelId() {
		return subscriptionCancelId;
	}

	public void setSubscriptionCancelId(String subscriptionCancelId) {
		this.subscriptionCancelId = subscriptionCancelId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}