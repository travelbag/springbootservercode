package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the deliver_goods_item database table.
 * 
 */
@Entity
@Table(name="deliver_goods_item")
public class DeliverGoodsItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DGI_ID")
	private int dgiId;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="ITEM")
	private String item;

	public DeliverGoodsItem() {
	}

	public int getDgiId() {
		return this.dgiId;
	}

	public void setDgiId(int dgiId) {
		this.dgiId = dgiId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}