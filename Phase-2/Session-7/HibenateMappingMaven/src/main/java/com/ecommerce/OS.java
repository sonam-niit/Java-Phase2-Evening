package com.ecommerce;

public class OS {

	private long OSID;
	private String name;

	public OS() {

	}

	public OS(String name) {
		this.OSID = 0;
		this.name = name;
	}

	public long getOSID() {
		return this.OSID;
	}

	public String getName() {
		return this.name;
	}

	public void setOSID(long id) {
		this.OSID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
