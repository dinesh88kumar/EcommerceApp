package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmodel.DiscountOrTax;
import com.example.productmodel.Product;
import com.example.service.ApiService;

import java.util.*;
@RestController
@RequestMapping("/ecom")
public class ApiController {
	
	@Autowired 
	ApiService apiservice;

	@GetMapping("/getall")
	public List<Product> getAll() {
		return apiservice.getAll();
	}
	
	@PostMapping("/Add")
	public Product createProduct(@RequestBody Product product) {
		return apiservice.addProduct(product);
	}
	
	@PostMapping("/Edit")
	public String editProduct(@RequestBody Product product) {
		return apiservice.editProduct(product);
	}
	
	@PostMapping("/Delete")
	public String deleteProduct(@RequestParam int id) {
		return apiservice.deleteProduct(id);
	}
	
	@PostMapping("/Read")
	public Product readProduct(@RequestParam int id) {
		return apiservice.readProduct(id);
	}
	@PostMapping("/Apply/discountOrtax")
	public String createProduct(@RequestBody DiscountOrTax type) {
		return apiservice.ApplyDiscountOrTax(type);
	}
}
