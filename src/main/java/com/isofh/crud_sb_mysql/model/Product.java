package com.isofh.crud_sb_mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadein() {
        return madein;
    }

    public float getPrice() {
        return price;
    }
}