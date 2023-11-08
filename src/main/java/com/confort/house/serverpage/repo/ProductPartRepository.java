package com.confort.house.serverpage.repo;

import com.confort.house.serverpage.entity.ProductPart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPartRepository extends CrudRepository<ProductPart, String> {
}
