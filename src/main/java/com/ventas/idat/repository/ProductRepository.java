package com.ventas.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.idat.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

  List<Product> findByName(String name);
}
