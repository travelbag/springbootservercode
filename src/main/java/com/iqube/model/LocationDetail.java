package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the location_details database table.
 * 
 */
@Entity
@Table(name="location_details")
public class LocationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="FROM_ADDRESS")
	private String fromAddress;

	@Column(name="FROM_CITY")
	private String fromCity;

	@Column(name="FROM_COUNTRY")
	private String fromCountry;

	@Column(name="FROM_STATE")
	private String fromState;

	@Column(name="GOODSID")
	private String goodsId;

	@Column(name="GOODSTYPE")
	private String goodstype;

	@Column(name="TO_ADDRESS")
	private String toAddress;

	@Column(name="TO_CITY")
	private String toCity;

	@Column(name="TO_COUNTRY")
	private String toCountry;

	@Column(name="TO_STATE")
	private String toState;

	public LocationDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromAddress() {
		return this.fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getFromCity() {
		return this.fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getFromCountry() {
		return this.fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getFromState() {
		return this.fromState;
	}

	public void setFromState(String fromState) {
		this.fromState = fromState;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodstype() {
		return this.goodstype;
	}

	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}

	public String getToAddress() {
		return this.toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getToCity() {
		return this.toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getToCountry() {
		return this.toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public String getToState() {
		return this.toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

}