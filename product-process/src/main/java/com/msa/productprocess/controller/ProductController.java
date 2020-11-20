package com.msa.productprocess.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msa.productprocess.entity.Product;
import com.msa.productprocess.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> getAllProducts() {

		return productService.getAllProducts();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Product> getProductById(@PathVariable int id) {

		return productService.getProductById(id);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Optional<Product> addProduct(@RequestBody Product product) {

		return productService.addProduct(product);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Optional<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {

		return productService.updateProduct(id, product);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public Optional<Product> updateProductPartial(@PathVariable int id, @RequestBody Map<String, Object> partial) {

		return productService.updateProductPartial(id, partial);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteProductById(@PathVariable int id) {

		productService.deleteProductById(id);
	}
}
