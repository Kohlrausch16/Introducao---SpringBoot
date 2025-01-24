package com.springProject.introducao_Spring.repository;

import com.springProject.introducao_Spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
