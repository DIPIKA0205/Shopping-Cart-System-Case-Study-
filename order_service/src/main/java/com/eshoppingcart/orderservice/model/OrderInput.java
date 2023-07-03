package com.eshoppingcart.orderservice.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "orders")
public class OrderInput {
	
	private String fullName;
	private String fullAddress;
	private String contactNumber;
	private String alternateContactNumber;
	private List<OrderProductQuantity>orderProductQuantityList;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}
	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}
	public List<OrderProductQuantity> getOrderProductQuantityList() {
		return orderProductQuantityList;
	}
	public void setOrderProductQuantityList(List<OrderProductQuantity> orderProductQuantity) {
		this.orderProductQuantityList = orderProductQuantity;
	}
	public OrderInput(String fullName, String fullAddress, String contactNumber, String alternateContactNumber,
			List<OrderProductQuantity> orderProductQuantity) {
		super();
		this.fullName = fullName;
		this.fullAddress = fullAddress;
		this.contactNumber = contactNumber;
		this.alternateContactNumber = alternateContactNumber;
		this.orderProductQuantityList = orderProductQuantity;
	}
	public OrderInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
