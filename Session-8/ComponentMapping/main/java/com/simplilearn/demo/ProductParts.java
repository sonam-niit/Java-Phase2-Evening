package com.simplilearn.demo;

public class ProductParts {

	private String hdd;
	private String ram;
	private String cpu;
	public ProductParts() {}
	public ProductParts(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
