package com.app.bean;

public class OrderService {
private Customer customer;
private Product product;
public OrderService(Customer customer, Product product) {
	super();
	this.customer = customer;
	this.product = product;
}
public void order() {
	System.out.println(product.getPname() + " is Purchased from the customer : " + customer.getCname());
}
	
}
