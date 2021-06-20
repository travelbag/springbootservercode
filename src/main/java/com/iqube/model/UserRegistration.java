package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_registration database table.
 * 
 */
@Entity
@Table(name="user_registration")
public class UserRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USERID")
	private int userId;

	@Column(name="ACCEPTTC")
	private int acceptTC;

	@Column(name="ACCESS_TOKEN")
	private String accessToken;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="CREATEDATE")
	private Timestamp createdate;

	@Column(name="EMAILID")
	private String emailId;

	@Column(name="FIRSTNAME")
	private String firstName;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="LASTNAME")
	private String lastName;

	@Column(name="MOBILE_VERIFY")
	private int mobileVerify;

	@Column(name="MOBILENUMBER")
	private String mobileNumber;

	@Column(name="OTPMSG")
	private String otpmsg;

	@Column(name="PAID_USER")
	private int paidUser;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="PHONE_DISPLAY")
	private int phoneDisplay;

	@Column(name="PROFILE_PICTURE")
	private String profilePicture;

	@Column(name="SIGNATURE")
	private String signature;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAcceptTC() {
		return acceptTC;
	}

	public void setAcceptTC(int acceptTC) {
		this.acceptTC = acceptTC;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Timestamp getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobileVerify() {
		return mobileVerify;
	}

	public void setMobileVerify(int mobileVerify) {
		this.mobileVerify = mobileVerify;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOtpmsg() {
		return otpmsg;
	}

	public void setOtpmsg(String otpmsg) {
		this.otpmsg = otpmsg;
	}

	public int getPaidUser() {
		return paidUser;
	}

	public void setPaidUser(int paidUser) {
		this.paidUser = paidUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhoneDisplay() {
		return phoneDisplay;
	}

	public void setPhoneDisplay(int phoneDisplay) {
		this.phoneDisplay = phoneDisplay;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}