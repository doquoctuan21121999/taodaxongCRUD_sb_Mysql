package com.isofh.crud_sb_mysql.service;

import java.util.List;

import com.isofh.crud_sb_mysql.model.Product;
import com.isofh.crud_sb_mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
    private final ProductRepository repo;
    @Autowired
    public ProductService (ProductRepository productRepository){
        this.repo = productRepository;
    }

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}