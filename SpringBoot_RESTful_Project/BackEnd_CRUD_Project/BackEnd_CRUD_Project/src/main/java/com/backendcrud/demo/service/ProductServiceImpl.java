package com.backendcrud.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcrud.demo.model.Product;
import com.backendcrud.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	
	@Autowired
	ProductRepository pr;

	@Override
	public List<Product> getProductList() {
		List<Product> listproduct=new ArrayList<>();
		try
		{
		listproduct=pr.findAll();
		}
		catch(Exception e)
		{
			System.out.println("Exception while getting list of Product");
			
		}
		return listproduct;
	}

	@Override
	public Product saveProduct(Product product) {
		Product savepro=new Product();
		try
		{
			savepro=pr.save(product);
		}
		catch(Exception e)
		{
			System.out.println("Exception while adding Product");
			
		}
		return savepro;
	}

	@Override
	public Product getProductById(int productId) 
	{
		
		Optional<Product>prod= pr.findById(productId);
		if(prod.isPresent())
		{
			Product product=prod.get();
			
			 return product;
		}
		else 
		{
			System.out.println("Prodcut Not Available");
			return null;
		}
	}
	
	
	@Override
	public String deleteProductById(int productId)
	{
		String result;
		
		try {
			pr.deleteById(productId);
			
			result="Product Succesfully Deleted";
		}
		catch(Exception e)
		{
			result="Exception while removing Product";
			
		}
		return result;
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		Optional<Product>op=pr.findById(productId);
		if(op.isPresent())
		{
			Product prod=op.get();
			prod.setProductName(product.getProductName());
			prod.setProductQuantity(product.getProductQuantity());
			prod.setProductPrice(product.getProductPrice());
			
			pr.save(prod);
			System.out.println("Product Updating Successfully ");
		}
		else
		{
			System.out.println("Product not available");
		}
		return product;
	}
	

}
