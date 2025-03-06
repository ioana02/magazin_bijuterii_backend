package com.example.jewelry.repository;
import com.example.jewelry.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {}