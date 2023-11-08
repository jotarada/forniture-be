package com.confort.house.serverpage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ProductPart {

    @Id
    private String partId;
    @ManyToOne
    @JsonIgnore
    private Product product;
    private String description;
    @OneToOne(mappedBy = "productPart")
    private Price price;

}
