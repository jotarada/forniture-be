package com.confort.house.serverpage.repo;

import com.confort.house.serverpage.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    public List<Product> findAllByActiveTrue();
}
