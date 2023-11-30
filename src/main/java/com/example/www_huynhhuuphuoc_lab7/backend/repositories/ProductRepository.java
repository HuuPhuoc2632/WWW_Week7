package com.example.www_huynhhuuphuoc_lab7.backend.repositories;

import com.example.www_huynhhuuphuoc_lab7.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
