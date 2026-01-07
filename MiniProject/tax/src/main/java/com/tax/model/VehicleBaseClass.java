package com.tax.model;
 
public class VehicleBaseClass {
	private int regNo;
	private String brand;
	private int velocity;
	private int seats;
	private String vehicleType;
	private double cost;
	private double tax;
 
	public VehicleBaseClass(int regNo, String brand, int velocity, int seats, String vehicleType, double cost,
			double tax) {
		this.regNo = regNo;
		this.brand = brand;
		this.velocity = velocity;
		this.seats = seats;
		this.vehicleType = vehicleType;
		this.cost = cost;
		this.tax = tax;
	}
 
	// Getters and setters
	public int getRegNo() {
		return regNo;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public int getVelocity() {
		return velocity;
	}
 
	public int getSeats() {
		return seats;
	}
 
	public String getVehicleType() {
		return vehicleType;
	}
 
	public double getCost() {
		return cost;
	}
 
	public double getTax() {
		return tax;
	}
 
	public void setTax(double tax) {
		this.tax = tax;
	}
}
 
 