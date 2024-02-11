package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productmodel.DiscountOrTax;
import com.example.productmodel.Product;
import com.example.repo.ProductRepo;

@Service
public class ApiService {
	
	@Autowired
	ProductRepo productrepo;

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productrepo.getAll();
	}

	public Product addProduct(Product product) {
		
		return productrepo.addProduct(product);
	}

	public String editProduct(Product product) {
		
		return productrepo.editProduct(product);
	}

	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productrepo.deleteProduct(id);
	}

	public Product readProduct(int id) {
		// TODO Auto-generated method stub
		return productrepo.readProduct(id);
	}

	public String ApplyDiscountOrTax(DiscountOrTax type) {
		return productrepo.ApplyDiscountOrTax(type);
	}

}
