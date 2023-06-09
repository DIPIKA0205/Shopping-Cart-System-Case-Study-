package com.cg.eShoppingzone.productservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eShoppingzone.productservice.entity.Product;
import com.cg.eShoppingzone.productservice.exception.ProductNotFoundException;
import com.cg.eShoppingzone.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	private Logger logger=LoggerFactory.getLogger(ProductServiceImpl.class);	
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();

	}

	@Override
	public Product getProductById(int productId)throws ProductNotFoundException
	{
//		Optional<Product>product=productRepository.findById(productId);
//		return product;
		 Optional<Product> optionalProduct = productRepository.findById(productId);
	        if (optionalProduct.isPresent()) {
	            return optionalProduct.get();
	        } else {
	            throw new ProductNotFoundException("Product not found with productId: " + productId);
	        }
	}



	@Override
	public List<Product> getProductsByName(String productName)throws ProductNotFoundException {
	   // return productRepository.findByProductName(productName);
	    List<Product> products = productRepository.findByProductName(productName);

	    if (products.isEmpty()) {
	        throw new ProductNotFoundException("No products found with name: " + productName);
	    }

	    return products;
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
		
		
	}

	@Override
	public void deleteProductById(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<Product> getProductsByCategory(String category)throws ProductNotFoundException {
		//return productRepository.findByCategory(category);
		List<Product> products = productRepository.findByProductName(category);

	    if (products.isEmpty()) {
	        throw new ProductNotFoundException("No products found with name: " + category);
	    }

	    return products;
	}

	@Override
	public List<Product> getProductsByType(String productType) {
		return productRepository.findByProductType(productType);
	}

}
