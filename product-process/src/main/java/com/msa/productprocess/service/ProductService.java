package com.msa.productprocess.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.msa.productprocess.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Optional<Product> getProductById(int id);

	public Optional<Product> addProduct(Product product);

	public Optional<Product> updateProduct(int id, Product product);

	public Optional<Product> updateProductPartial(int id, Map<String, Object> productPartial);

	public void deleteProductById(int id);
}
