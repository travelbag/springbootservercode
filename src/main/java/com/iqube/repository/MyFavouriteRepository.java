package com.iqube.repository;
import org.springframework.data.repository.CrudRepository;

import com.iqube.model.MyFavourite;
public interface MyFavouriteRepository extends CrudRepository<MyFavourite, Integer>
{
}
