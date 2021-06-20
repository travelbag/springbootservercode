package com.iqube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqube.model.GoodsItem;
import com.iqube.service.GoodsItemService;

@RestController
public class GoodsItemController {
	//autowired the GoodsItemService class
	@Autowired
	GoodsItemService goodsItemService;

	//creating a get mapping that retrieves all the goodsItems detail from the database 
	@GetMapping("/goodsItem")
	private List<GoodsItem> getAllGoodsItem() {
		return goodsItemService.getAllGoodsItem();
	}

	//creating a get mapping that retrieves the detail of a specific goodsItem
	@GetMapping("/goodsItem/{id}")
	private GoodsItem getGoodsItem(@PathVariable("id") int id) {
		return goodsItemService.getGoodsItemById(id);
	}

	//creating a delete mapping that deletes a specific goodsItem
	@DeleteMapping("/goodsItem/{id}")
	private void deleteGoodsItem(@PathVariable("id") int id) {
		goodsItemService.delete(id);
	}

	//creating post mapping that post the goodsItem detail in the database
	@PostMapping("/goodsItem")
	private int saveGoodsItem(@RequestBody GoodsItem goodsItem) {
		goodsItemService.saveOrUpdate(goodsItem);
		return goodsItem.getId();
	}
}
