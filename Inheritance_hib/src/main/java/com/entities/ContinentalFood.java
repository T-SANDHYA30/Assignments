package com.entities;

import jakarta.persistence.Id;

public class ContinentalFood extends Food{
	
	@Id
	private int rating;
	private double price;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ContinentalFood(int foodId, String foodName, int rating, double price) {
		super(foodId, foodName);
		this.rating = rating;
		this.price = price;
	}
	public ContinentalFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContinentalFood(int foodId, String foodName) {
		super(foodId, foodName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContinentalFood [rating=" + rating + ", price=" + price + "]";
	}
	
	
	
	

}
