package com.entities;

public class Car extends Vehicle{
	private String brand;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(String id, String type, String brand, String color) {
		super(id, type);
		this.brand = brand;
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String id, String type) {
		super(id, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "]";
	}
	
	

}
