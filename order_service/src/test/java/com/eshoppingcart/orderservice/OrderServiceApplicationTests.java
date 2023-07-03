//package com.eshoppingcart.orderservice;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import com.eshoppingcart.orderservice.model.Order;
//import com.eshoppingcart.orderservice.repository.OrderRepo;
//import com.eshoppingcart.orderservice.service.OrderServiceImpl;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//@SpringBootTest
//class OrderServiceApplicationTests {
//
//	List<Order> orders = new ArrayList<>();
//	Order order;
//	Order order1;
//
//	@Autowired
//	private OrderServiceImpl orderserviceImpl;
//
//	@MockBean
//	private OrderRepo orderRepo;
//	
//	@InjectMocks
//    private OrderServiceImpl orderService;
//	
//	@BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
//	
//	 @Test
//	    public void testGetAllOrders() {
//	        // Create a list of orders for testing
//	        List<Order> orders = new ArrayList<>();
//	        orders.add(new Order());
//	        orders.add(new Order());
//
//	        // Mock the behavior of the orderRepo.findAll() method
//	        Mockito.when(orderRepo.findAll()).thenReturn(orders);
//
//	        // Call the getAllOrders() method of the orderService
//	        List<Order> result = orderService.getAllOrders();
//
//	        // Assert that the returned list is not null and has the expected size
//	        assertNotNull(result);
//	        assertEquals(2, result.size());
//	    }
//	 
//	 @Test
//	    public void testGetAllOrderById() {
//	        long orderId = 1L;
//	        Order order = new Order();
//	        order.setOrderId(orderId);
//
//	        // Mock the behavior of the orderRepo.findById() method
//	        Mockito.when(orderRepo.findById(orderId)).thenReturn(Optional.of(order));
//
//	        // Call the getAllOrderById() method of the orderService
//	        Order result = orderService.getAllOrderById(orderId);
//
//	        // Assert that the returned order is not null and has the expected id
//	        assertNotNull(result);
//	        assertEquals(orderId, result.getOrderId());
//	    }
//	 
//	
//
//	 
//	 @Test
//	    public void testSetOrderDetails() {
//	        Order order = new Order();
//
//	        // Mock the behavior of the orderRepo.save() method
//	        Mockito.when(orderRepo.save(order)).thenReturn(order);
//
//	        // Call the setOrderDetails() method of the orderService
//	        Order result = orderService.setOrderDetails(order);
//
//	        // Assert that the returned order is not null
//	        assertNotNull(result);
//	    }
//
//	    @Test
//	    public void testUpdateOrderById() {
//	        Order order = new Order();
//	        order.setOrderId(1L);
//
//	        // Mock the behavior of the orderRepo.save() method
//	        Mockito.when(orderRepo.save(order)).thenReturn(order);
//
//	        // Call the updateOrderById() method of the orderService
//	        Order result = orderService.updateOrderById(order);
//
//	        // Assert that the returned order is not null and has the expected id
//	        assertNotNull(result);
//	        assertEquals(1L, result.getOrderId());
//	    }
//
//	    @Test
//	    public void testDeleteOrderById() {
//	        long orderId = 1L;
//
//	        // Call the deleteOrderById() method of the orderService
//	        orderService.deleteOrderById(orderId);
//
//	        // Verify that the orderRepo.deleteById() method was called with the correct orderId
//	        Mockito.verify(orderRepo).deleteById(orderId);
//	    }
//	
//	
//
//
//}
