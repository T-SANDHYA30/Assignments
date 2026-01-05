package com.entities;

public class Bike extends Vehicle {
	
	private String bikeBrand;
	private double cost;
	public String getBikeBrand() {
		return bikeBrand;
	}
	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Bike(String id, String type, String bikeBrand, double cost) {
		super(id, type);
		this.bikeBrand = bikeBrand;
		this.cost = cost;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String id, String type) {
		super(id, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [bikeBrand=" + bikeBrand + ", cost=" + cost + "]";
	}
	
	
	
	

}
