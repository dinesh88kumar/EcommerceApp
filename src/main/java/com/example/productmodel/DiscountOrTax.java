package com.example.productmodel;

public class DiscountOrTax {
	public int productId;
	public String type;
	public int percentage;
	
	public DiscountOrTax() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DiscountOrTax(int productId, String type, int percentage) {
		super();
		this.productId = productId;
		this.type = type;
		this.percentage = percentage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
}
