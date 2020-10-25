package com.isofh.crud_sb_mysql.repository;

import com.isofh.crud_sb_mysql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}