package com.example.www_huynhhuuphuoc_lab7.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {
    @GetMapping("/my-home")
    public String myPage() {
        return "shopping/home";
    }

    @GetMapping("/list-product")
    public String listProduct() {
        return "admin/product/list-product";
    }
}
