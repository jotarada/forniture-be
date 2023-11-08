package com.confort.house.serverpage.repo;

import com.confort.house.serverpage.entity.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, String> {
}
