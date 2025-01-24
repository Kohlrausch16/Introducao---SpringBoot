package com.springProject.introducao_Spring.controller;


import com.springProject.introducao_Spring.model.Product;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        System.out.println("Saved product: " + product);
        return product;
    }

}
