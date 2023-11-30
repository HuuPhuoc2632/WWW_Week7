package com.example.www_huynhhuuphuoc_lab7.backend.services;

import com.example.www_huynhhuuphuoc_lab7.backend.models.Product;
import com.example.www_huynhhuuphuoc_lab7.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> findPaginated(int pageNo, int pageSize, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return productRepository.findAll(pageable);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public void deleteById(long id){
       productRepository.deleteById(id);
    }

}
