package com.example.www_huynhhuuphuoc_lab7.backend.repositories;

import com.example.www_huynhhuuphuoc_lab7.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
