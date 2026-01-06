package com.tax.model;
public class PropertyBaseClass {
	private int id;
	private int buildArea;
	private double basePrice;
	private int age;
	private char inCity;
	private double propertyTax;
 
	public PropertyBaseClass(int id, int buildArea, double basePrice, int age, char inCity, double propertyTax) {
		this.id = id;
		this.buildArea = buildArea;
		this.basePrice = basePrice;
		this.age = age;
		this.inCity = inCity;
		this.propertyTax = propertyTax;
	}
 
	// Getters and setters
	public int getId() {
		return id;
	}
 
	public int getBuildArea() {
		return buildArea;
	}
 
	public double getBasePrice() {
		return basePrice;
	}
 
	public int getAge() {
		return age;
	}
 
	public char getInCity() {
		return inCity;
	}
 
	public double getPropertyTax() {
		return propertyTax;
	}
 
	public void setPropertyTax(double propertyTax) {
		this.propertyTax = propertyTax;
	}
}
 
 