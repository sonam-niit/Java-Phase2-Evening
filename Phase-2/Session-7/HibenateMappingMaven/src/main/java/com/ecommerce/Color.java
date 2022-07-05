package com.ecommerce;

public class Color {
	private long COLORID;
	private String name;

	public Color() {

	}

	public Color(String name) {
		this.COLORID = 0;
		this.name = name;
	}

	public long getCOLORID() {
		return this.COLORID;
	}

	public String getName() {
		return this.name;
	}

	public void setCOLORID(long id) {
		this.COLORID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [COLORID=" + COLORID + ", name=" + name + "]";
	}

	
}
