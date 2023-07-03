package com.eshoppingcart.orderservice.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eshoppingcart.orderservice.model.OrderDetail;
import com.eshoppingcart.orderservice.model.OrderInput;
import com.eshoppingcart.orderservice.model.OrderProductQuantity;
import com.eshoppingcart.orderservice.model.Product;
import com.eshoppingcart.orderservice.repository.OrderRepository;
import com.eshoppingcart.orderservice.repository.ProductRepository;


@Service
public class OrderServiceImpl implements OrderService{
	
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;
	
	@Autowired 
	 private RestTemplate resTemplate;
	//private final UserDao userDao;
	private static final String ORDER_PLACED="Placed";
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    public OrderServiceImpl(OrderRepository orderRepository,ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository=productRepository;
       // this.userDao=userDao;
    }


    public void placeOrder(int productId,OrderInput orderInput) {
		List<OrderProductQuantity> productQuantityList = orderInput.getOrderProductQuantityList();
		if (productQuantityList != null && !productQuantityList.isEmpty()) {
			for (OrderProductQuantity o : productQuantityList) {
				try {
					Product product = this.resTemplate.getForObject("http://localhost:9002/product/"+productId,Product.class);
					OrderDetail orderDetail = new OrderDetail(
							orderInput.getFullName(),
							orderInput.getFullAddress(),
							orderInput.getContactNumber(),
							orderInput.getAlternateContactNumber(),
							ORDER_PLACED,
							product.getPrice() * o.getQuantity(),
							product
					);
					orderRepository.save(orderDetail);
				} catch (NoSuchElementException e) {
					logger.error("Failed to find product with ID: {}", o.getProductId());
					 // Handle the exception or throw a custom exception
				} catch (Exception e) {
					logger.error("An error occurred while placing the order: {}", e.getMessage());
					// Handle the exception or throw a custom exception
				}
			}
		} else {
			logger.warn("No product quantity list provided for placing the order");
			// Handle the case when productQuantityList is null or empty
		}
	}
    
//    public OrderDetail placeOrder(int productId,OrderInput orderInput)
//    {
//    	Product product =  this.resTemplate.getForObject("http://localhost:9002/product/"+productId,Product.class);
//		
//		OrderDetail orderDetails = new OrderDetail();
//	    order.setOrderId(generateOrderId());
//	    order.setProducts(cart.getItems());
//	    order.setOrderDate(LocalDate.now());
//	    order.setCustomerId(userInput.getCustomerId());
//	    order.setAddress(userInput);
//	    order.setAmountToPay(cart.getFinalPrice());
//	    order.setQuantity(calculateTotalQuantity(cart.getItems()));
//	    
//		return orderRepository.save(order);
//    }

    
}
