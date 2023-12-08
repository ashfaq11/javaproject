package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/products/all")
	public Page<Product> getProducts() {

		return productService.getAllProducts();

	}

	@GetMapping("/products/{productName}")
	public List<Product> getProducts(@PathVariable String productName) {
		return productService.findByDynamicFilter(productName, "Nike");
	}

	@GetMapping("/products/add")
	public Product addProduct() {
		
		return productService.addProduct();
	}
}
