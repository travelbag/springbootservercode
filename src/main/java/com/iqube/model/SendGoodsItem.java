package com.iqube.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the send_goods_item database table.
 * 
 */
@Entity
@Table(name="send_goods_item")
public class SendGoodsItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ITEMID")
	private int itemId;

	@Column(name="ISACTIVE")
	private int isActive;

	@Column(name="ITEM")
	private String item;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}