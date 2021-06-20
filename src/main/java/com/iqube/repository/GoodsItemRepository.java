package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.GoodsItem;
public interface GoodsItemRepository extends CrudRepository<GoodsItem, Integer>
{
}
