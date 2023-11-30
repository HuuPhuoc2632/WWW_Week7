package com.example.www_huynhhuuphuoc_lab7.frontend.controller;

import com.example.www_huynhhuuphuoc_lab7.backend.models.Product;
import com.example.www_huynhhuuphuoc_lab7.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return productService.findAll();
    }
    @DeleteMapping("/delete-by-id")
    public void deleteById(@RequestParam long id){
//        long productId = Long.parseLong(id);
//        System.err.println(id);
        productService.deleteById(id);
    }

}
