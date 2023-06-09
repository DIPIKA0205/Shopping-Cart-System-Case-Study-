package com.cg.eShoppingzone.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cg.eShoppingzone.productservice.entity.Product;
import com.cg.eShoppingzone.productservice.exception.ProductNotFoundException;
import com.cg.eShoppingzone.productservice.repository.ProductRepository;
import com.cg.eShoppingzone.productservice.service.ProductService;
import com.cg.eShoppingzone.productservice.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	public ProductService productService;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId)throws ProductNotFoundException{
        return productService.getProductById(productId);
    }

    @GetMapping("/type/{productType}")
    public ResponseEntity<List<Product>> getProductsByType(@PathVariable("productType") String productType) {
        List<Product> products = productService.getProductsByType(productType);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/name/{productName}")
    public ResponseEntity<List<Product>> getProductsByName(@PathVariable("productName") String productName)throws ProductNotFoundException {
        List<Product> products = productService.getProductsByName(productName);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable("category") String category)throws ProductNotFoundException {
        List<Product> products = productService.getProductsByCategory(category);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("/products")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProductById(@PathVariable("productId") int productId)throws ProductNotFoundException {
        productService.deleteProductById(productId);
        return ResponseEntity.ok().build();
    }

    
}





