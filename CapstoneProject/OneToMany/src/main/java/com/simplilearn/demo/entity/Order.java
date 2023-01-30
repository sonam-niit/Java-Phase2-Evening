package com.simplilearn.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int totalQuantity;
	private String status;
	public Order(){}
	public Order(int totalQuantity, String status, Set<OrderItem> orderItems) {
		super();
		this.totalQuantity = totalQuantity;
		this.status = status;
		this.orderItems = orderItems;
	}

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "order")
	private Set<OrderItem> orderItems= new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", totalQuantity=" + totalQuantity + ", status=" + status + ", orderItems="
				+ orderItems + "]";
	}
	
	
}
