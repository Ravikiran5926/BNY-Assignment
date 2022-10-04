package com.backendcrud.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendcrud.demo.model.Product;
import com.backendcrud.demo.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController 
{
	
    @Autowired
	ProductService ps;
    
    
    @PostMapping(value = "/addProduct")
    public Product saveProduct(@RequestBody Product product)
    {
		return ps.saveProduct(product);
    	
    }
    
    @GetMapping(value="/getAllProduct")
    public List<Product> getProductList()
    {
    	List<Product> products=new ArrayList<>();
    	
    	products=ps.getProductList();
    	
    	return products;
    }
    
    @GetMapping(value="/getProduct/{productId}")
    public Product getProductById(@PathVariable int productId)
    {
    	Product prod=ps.getProductById(productId);
		return prod;
    	
    }
    
    @PutMapping(value="/updateProduct/{productId}")
    public Product updateProduct(@PathVariable int productId,@RequestBody Product product)
    {   
    	Product prod=ps.updateProduct(productId,product);
      return prod;
    }
    
    @DeleteMapping(value="/deleteproduct/{productId}")
    public String deleteProductById(@PathVariable int productId)
    {
		return ps.deleteProductById(productId);
    	
    }
    
}
