package com.eshoppingcart.orderservice.service;

import com.eshoppingcart.orderservice.model.OrderInput;

public interface OrderService {

	public void placeOrder(int productId,OrderInput orderInput);
	    
    
}
