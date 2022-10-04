package com.backendcrud.demo.service;

import java.util.List;

import com.backendcrud.demo.model.Product;

public interface ProductService {

	public List<Product> getProductList();

	public Product saveProduct(Product product);

	public Product getProductById(int productId);

	public String deleteProductById(int productId);

	public Product updateProduct(int productId, Product product);
	
	

}
