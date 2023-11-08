package com.confort.house.serverpage.controller;

import com.confort.house.serverpage.entity.Price;
import com.confort.house.serverpage.entity.Product;
import com.confort.house.serverpage.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class PagesController {

    private ProductService productService;

    public PagesController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listProducts() {
        return productService.getAllProducts();
    }

}
