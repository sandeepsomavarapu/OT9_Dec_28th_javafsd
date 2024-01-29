package com.ot9.oops;

public class ProductClient {
	public static void main(String[] args) {
		Product product = new Product(111, "samsung", 9000, "electronics");

		System.out.println(product.getProductName());
		product.setProductPrice(12345);
		System.out.println(product.getProductPrice());
	}
}
