package com.simplilearn.demo;

import java.math.BigDecimal;
import java.util.Date;

public class EProduct {

	private long id;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	private ProductParts parts;
	public EProduct() {}
	public EProduct(String name, BigDecimal price, Date dateAdded, ProductParts parts) {
		super();
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
		this.parts = parts;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public ProductParts getParts() {
		return parts;
	}
	public void setParts(ProductParts parts) {
		this.parts = parts;
	}
	
	
}
