package com.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {

	private long id;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	public EProductEntity() {}
	
	public EProductEntity(String name, BigDecimal price, Date dateAdded) {
		super();
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
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
	@Override
	public String toString() {
		return "EProductEntity [id=" + id + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + "]";
	}
	
}
