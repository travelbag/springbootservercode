package com.iqube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqube.model.GoodsItem;
import com.iqube.repository.GoodsItemRepository;

@Service
public class GoodsItemService {
	@Autowired
	GoodsItemRepository goodsItemRepository;

	// getting all goodsItem records
	public List<GoodsItem> getAllGoodsItem() {
		List<GoodsItem> goodsItems = new ArrayList<GoodsItem>();
		goodsItemRepository.findAll().forEach(goodsItem -> goodsItems.add(goodsItem));
		return goodsItems;
	}

	// getting a specific record
	public GoodsItem getGoodsItemById(int id) {
		return goodsItemRepository.findById(id).get();
	}

	public void saveOrUpdate(GoodsItem goodsItem) {
		goodsItemRepository.save(goodsItem);
	}

	// deleting a specific record
	public void delete(int id) {
		goodsItemRepository.deleteById(id);
	}
}
