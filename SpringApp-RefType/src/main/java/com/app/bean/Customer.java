package com.app.bean;

public class Customer {
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + "]";
	}
	
}
