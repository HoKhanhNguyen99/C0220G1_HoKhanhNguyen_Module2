package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByNameProductContaining(String name);

}
