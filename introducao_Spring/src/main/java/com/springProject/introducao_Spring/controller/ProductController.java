package com.springProject.introducao_Spring.controller;

import com.springProject.introducao_Spring.model.Product;
import com.springProject.introducao_Spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProductController {

    @Autowired
   private ProductRepository productRepository;


    @GetMapping("/product")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductByID(@PathVariable String id){
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }

}
