package com.ecommerce;

public class Finance {
	private long FINANCEID;
	private String name;
	private String ftype;

	public Finance() {

	}

	public Finance(String name, String ftype) {
		this.FINANCEID = 0;
		this.name = name;
		this.ftype = ftype;
	}

	public long getFINANCEID() {
		return this.FINANCEID;
	}

	public String getName() {
		return this.name;
	}

	public String getFtype() {
		return this.ftype;
	}

	public void setFINANCEID(long id) {
		this.FINANCEID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

}
