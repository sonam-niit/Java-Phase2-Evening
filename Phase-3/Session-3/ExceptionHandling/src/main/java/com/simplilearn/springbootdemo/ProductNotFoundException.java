package com.simplilearn.springbootdemo;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException() {
		super();
	}
	public ProductNotFoundException(String mes) {
		super(mes);
	}
	@Override
	public String toString() {
		return "ProductNotFoundException "+ super.toString();
	}
	
}
