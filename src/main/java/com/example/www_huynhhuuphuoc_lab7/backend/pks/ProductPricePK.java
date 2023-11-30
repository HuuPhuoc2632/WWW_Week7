package com.example.www_huynhhuuphuoc_lab7.backend.pks;

import com.example.www_huynhhuuphuoc_lab7.backend.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter @Getter
public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;
}
