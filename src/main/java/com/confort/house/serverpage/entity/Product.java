package com.confort.house.serverpage.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {
    @Id
    private String productId;
    private String url;
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<ProductPart> productParts;
    private boolean active;
    private String description;
}
