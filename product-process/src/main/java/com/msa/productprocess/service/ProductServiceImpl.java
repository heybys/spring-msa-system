package com.msa.productprocess.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.msa.productprocess.entity.Product;
import com.msa.productprocess.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(int id) {

		return productRepository.findById(id);
	}

	@Override
	public Optional<Product> addProduct(Product product) {

		return Optional.of(productRepository.save(product));
	}

	@Override
	public Optional<Product> updateProduct(int id, Product product) {

		if (!productRepository.existsById(id)) {
			return Optional.empty();
		}

		product.setId(id);

		return Optional.of(productRepository.save(product));
	}

	@Override
	public Optional<Product> updateProductPartial(int id, Map<String, Object> partial) {

		Optional<Product> curProduct = productRepository.findById(id);

		if (curProduct.isEmpty()) {
			return Optional.empty();
		}

		partial.forEach((key, value) -> {
			Field field = ReflectionUtils.findField(Product.class, key);
			field.setAccessible(true);
			ReflectionUtils.setField(field, curProduct.get(), value);
		});

		return Optional.of(productRepository.save(curProduct.get()));
	}

	@Override
	public void deleteProductById(int id) {
		
		productRepository.deleteById(id);
	}

}
