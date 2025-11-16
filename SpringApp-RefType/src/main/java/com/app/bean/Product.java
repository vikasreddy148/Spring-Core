package com.app.bean;

public class Product {
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + "]";
	}
	
}
