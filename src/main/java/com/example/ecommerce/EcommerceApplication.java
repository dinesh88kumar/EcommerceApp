package com.example.ecommerce;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ApiController;
import com.example.productmodel.Product;
import com.example.repo.ProductRepo;
import com.example.service.ApiService;


@EnableAutoConfiguration
@AutoConfigurationPackage
@SpringBootApplication
@ComponentScan(basePackageClasses = {ApiController.class,ProductRepo.class,ApiService.class})
public class EcommerceApplication implements CommandLineRunner {
    
	@Autowired
	ProductRepo productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product p1=new Product(0, "laptop", "hp model 12", 42999, 1);
		Product p2=new Product(1, "headphones", "plugged 12", 999, 2);
		productRepo.products.addAll(Arrays.asList(p1,p2));
		// TODO Auto-generated method stub
		
	}

}
