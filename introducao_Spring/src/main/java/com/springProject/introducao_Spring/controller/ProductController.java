package com.springProject.introducao_Spring.controller;

import com.springProject.introducao_Spring.model.Product;
import com.springProject.introducao_Spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProductController {

    @Autowired
   private ProductRepository productRepository;


    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }

}
