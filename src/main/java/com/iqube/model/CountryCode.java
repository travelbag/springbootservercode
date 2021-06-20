package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country_code database table.
 * 
 */
@Entity
@Table(name="country_code")
public class CountryCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="CODE")
	private String code;

	@Column(name="COUNTRY")
	private String country;

	@Column(name="ORDERING")
	private int ordering;

	@Column(name="REFERURL")
	private String referUrl;

	public CountryCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getOrdering() {
		return this.ordering;
	}

	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}

	public String getReferUrl() {
		return this.referUrl;
	}

	public void setReferUrl(String referUrl) {
		this.referUrl = referUrl;
	}

}