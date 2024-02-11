package com.example.repo;
import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.productmodel.DiscountOrTax;
import com.example.productmodel.Product;

@Repository
public class ProductRepo {
	
public List<Product> products=new ArrayList<>();

public List<Product> getAll() {
	// TODO Auto-generated method stub
	return products;
}

public Product addProduct(Product product) {
	products.add(product);
	return  product;
}

public String editProduct(Product product) {
	for(Product i:products) {
		if(i.productId==product.productId) {
			i=product;
		}
	}
	return "Edited successfully";
}

public String deleteProduct(int id) {
	
	Product p=new Product();
	for(Product i:products) {
		if(i.productId==id) {
			p=i;
		}
	}
	products.remove(p);
	return "Deleted successfully";
}

public Product readProduct(int id) {
	Product p=new Product();
	for(Product i:products) {
		if(i.productId==id) {
			p=i;
		}
	}
	return p;
}
public String ApplyDiscountOrTax(DiscountOrTax discountModel) {
	
	Product t=new Product();
	for(Product i:products) {
		if(i.productId==discountModel.productId) {
			switch (discountModel.type.toLowerCase()) {
		    case "discount":
		        t=applyDiscount(i, discountModel.percentage);
		        i=t;
		       return  "Update price of "+t.name.toLowerCase()+" is "+t.price;
		       
		    case "tax":
		        t=applyTax(i, discountModel.percentage);
		        i=t;
		        return  "Update price of "+t.name.toLowerCase()+" is "+t.price;
		    default:
		        return "Invalid operation type";
		}
		}
	}

	return "Error occured";
}

private Product applyDiscount(Product product, double discountPercentage) {
    double discountedPrice = product.getPrice() * (1 - discountPercentage / 100);
    product.price= (int) discountedPrice;
    return product;
}

private Product applyTax(Product product, double taxRate) {
    double taxedPrice = product.getPrice() * (1 + taxRate / 100);
    product.price= (int) taxedPrice;
    return product;
   
}


}
