package com.study.pattern.bo;

public class Customer {
	
	private String cusId;	
	private String name;	
	private String refId;

	public Customer(String cusId, String name, String refId) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.refId = refId;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	

}
