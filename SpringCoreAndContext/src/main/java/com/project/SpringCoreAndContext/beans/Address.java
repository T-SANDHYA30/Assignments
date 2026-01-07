package com.project.SpringCoreAndContext.beans;

public class Address {
	
	private int addrId;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int addrId, String city, String state) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
