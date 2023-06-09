package com.cg.eShoppingzone.productservice.productService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.eShoppingzone.productservice.entity.Product;
import com.cg.eShoppingzone.productservice.repository.ProductRepository;
import com.cg.eShoppingzone.productservice.service.ProductServiceImpl;

@SpringBootTest
class ProductServiceApplicationTests {

	
//	@Mock
//    private ProductRepository productRepository;
//
//    @InjectMocks
//    private ProductServiceImpl productService;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//    
//    @Test
//    public void testAddProduct() {
//    	Map<Integer, Double> rating = new HashMap<>();
//        rating.put(1, 4.5);
//        rating.put(2, 3.8);
//
//        // Create and initialize the review map
//        Map<Integer, String> review = new HashMap<>();
//        review.put(1, "Good product");
//        review.put(2, "Average product");
//
//        // Create and initialize the image list
//        List<String> image = List.of("image1.jpg", "image2.jpg", "image3.jpg");
//
//        // Create and initialize the specification map
//        Map<String, String> specification = new HashMap<>();
//        specification.put("Size", "Medium");
//        specification.put("Color", "Black");
//
//        
//        Product product = new Product(1,"Electronics", "Laptop", "Computers", rating,
//                review, image, 999.99, "High-performance laptop", specification);
//         // Create a test product
//
//        productService.addProduct(product);
//
//        Mockito.verify(productRepository, Mockito.times(1)).save(product);
//    }
//    
//    @Test
//    public void testGetAllProducts() {
//    	Map<Integer, Double> rating = new HashMap<>();
//        rating.put(1, 4.5);
//        rating.put(2, 3.8);
//        
//        Map<Integer, Double> rating1 = new HashMap<>();
//        rating.put(1, 5.0);
//        rating.put(2, 3.9);
//
//        // Create and initialize the review map
//        Map<Integer, String> review = new HashMap<>();
//        review.put(1, "Good product");
//        review.put(2, "Average product");
//        
//        Map<Integer, String> review1 = new HashMap<>();
//        review.put(1, "Awesome");
//        review.put(2, "Best product");
//
//        // Create and initialize the image list
//        List<String> image = List.of("image1.jpg", "image2.jpg", "image3.jpg");
//        List<String> image1 = List.of("image1.jpg", "image2.jpg", "image3.jpg");
//
//        // Create and initialize the specification map
//        Map<String, String> specification = new HashMap<>();
//        specification.put("Size", "Medium");
//        specification.put("Color", "Black");
//        
//        Map<String, String> specification1= new HashMap<>();
//        specification.put("Size", "small");
//        specification.put("Color", "Grey");
//        
//        List<Product> productList = new ArrayList<>(); // Create a test product list
//        
//        productList.add(new Product(1,"Electronics", "Laptop", "Computers", rating,
//                review, image, 999.99, "High-performance laptop", specification));
//        productList.add(new Product(2,"Electronics", "Mobile", "Computers", rating1,
//                review1, image1, 999.99, "High-performance laptop", specification1));
//        
//        Mockito.when(productRepository.findAll()).thenReturn(productList);
//
//        List<Product> result = productService.getAllProducts();
//
//        Assertions.assertEquals(productList, result);
//    }
//    
//    @Test
//    public void testGetProductById() {
//    	Map<Integer, Double> rating = new HashMap<>();
//        rating.put(1, 4.5);
//        rating.put(2, 3.8);
//
//        // Create and initialize the review map
//        Map<Integer, String> review = new HashMap<>();
//        review.put(1, "Good product");
//        review.put(2, "Average product");
//
//        // Create and initialize the image list
//        List<String> image = List.of("image1.jpg", "image2.jpg", "image3.jpg");
//
//        // Create and initialize the specification map
//        Map<String, String> specification = new HashMap<>();
//        specification.put("Size", "Medium");
//        specification.put("Color", "Black");
//
//        int productId = 2;
//        Product product = new Product(1,"Electronics", "Laptop", "Computers", rating,
//                review, image, 999.99, "High-performance laptop", specification); // Create a test product
//        Mockito.when(productRepository.findById(productId)).thenReturn(Optional.of(product));
//
//        Optional<Product> result = productService.getProductById(productId);
//
//        Assertions.assertEquals(Optional.of(product), result);
//    }


}
