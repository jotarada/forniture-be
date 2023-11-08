package com.confort.house.serverpage.service;

import com.confort.house.serverpage.entity.Product;
import com.confort.house.serverpage.repo.PriceRepository;
import com.confort.house.serverpage.repo.ProductRepository;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    private PriceRepository priceRepository;

    public ProductService(ProductRepository productRepository, PriceRepository priceRepository) {
        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }

    public List<Product> getAllProducts() {
        List<Product> result = ImmutableList.copyOf(productRepository.findAllByActiveTrue());
        return result;
    }
}
