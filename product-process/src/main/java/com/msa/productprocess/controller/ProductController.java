package com.msa.productprocess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.productprocess.entity.Product;
import com.msa.productprocess.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productService;

	@RequestMapping("")
	public List<Product> getAllProducts() {
		return productService.getAllProduct();
		
	}

}
