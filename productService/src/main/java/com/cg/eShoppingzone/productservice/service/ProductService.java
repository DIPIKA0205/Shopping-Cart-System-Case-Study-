package com.cg.eShoppingzone.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.eShoppingzone.productservice.entity.Product;
import com.cg.eShoppingzone.productservice.exception.ProductNotFoundException;
@Service
public interface ProductService {
	
	public void addProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int productId) throws ProductNotFoundException;
	
	List<Product> getProductsByName(String productName) throws ProductNotFoundException;
	
	public Product updateProduct(Product product);
	
	public void deleteProductById(int productId);
	
	public List<Product> getProductsByCategory(String category)throws ProductNotFoundException;
	
	public List<Product> getProductsByType(String productType);

	//Product productById(int productId);
	
	

}
