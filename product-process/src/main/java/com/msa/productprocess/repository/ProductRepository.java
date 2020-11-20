package com.msa.productprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msa.productprocess.entity.Product;

@Repository("ProductRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
