package com.confort.house.serverpage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Price {

    @Id
    private String priceId;
    private BigDecimal amount;
    private BigDecimal discountAmount;
    @OneToOne
    @JoinColumn(name = "part_price_id")
    @JsonIgnore
    private ProductPart productPart;
}
