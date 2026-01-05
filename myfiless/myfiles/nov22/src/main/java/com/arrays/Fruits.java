package com.arrays;

public class Fruits {
	
	private String fruitname;
	private String color;
	private double cost;
	
	public double costperDozen(Fruits fruit) {
		return fruit.cost*12;
		
	}

	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Fruits(String fruitname, String color, double cost) {
		super();
		this.fruitname = fruitname;
		this.color = color;
		this.cost = cost;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
