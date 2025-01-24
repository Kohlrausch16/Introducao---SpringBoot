package com.springProject.introducao_Spring.controller;

import com.springProject.introducao_Spring.model.Product;
import com.springProject.introducao_Spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

    @Autowired
   private ProductRepository productRepository;


    @GetMapping("/product")
    public List<Product> getProduct(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }

}
