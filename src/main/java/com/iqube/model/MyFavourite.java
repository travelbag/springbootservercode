package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the my_favourite database table.
 * 
 */
@Entity
@Table(name="my_favourite")
public class MyFavourite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MY_FAVID")
	private int myFavId;

	@Column(name="CREATEDATE")
	private Timestamp createDate;

	@Column(name="GOODSID")
	private int goodsId;

	@Column(name="GOODSTYPE")
	private String goodsType;

	@Column(name="ISACTIVE")
	private String isActive;

	@Column(name="MAINGOODSID")
	private int mainGoodsId;

	@Column(name="USERID")
	private int userId;

	public int getMyFavId() {
		return myFavId;
	}

	public void setMyFavId(int myFavId) {
		this.myFavId = myFavId;
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getMainGoodsId() {
		return mainGoodsId;
	}

	public void setMainGoodsId(int mainGoodsId) {
		this.mainGoodsId = mainGoodsId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}