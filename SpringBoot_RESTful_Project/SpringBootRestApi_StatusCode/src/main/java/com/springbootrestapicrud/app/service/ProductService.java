package com.springbootrestapicrud.app.service;

import com.springbootrestapicrud.app.model.Product;

public interface ProductService {

	public Product saveProduct(Product p);

	public Iterable<Product> getProduct();

	public Product updateProduct(Long productId, Product p);

    public void deleteProduct(Long productId);

	public Product getByProduct(Long productId);

	

}
