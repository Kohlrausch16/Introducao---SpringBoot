package com.springProject.introducao_Spring.model;

import jakarta.persistence.*;
import lombok.Setter;
import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Double price;


    public Product(){

    }

    public Product(String id, Double price, String description, String name) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
