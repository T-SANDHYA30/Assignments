package com.entities;

import jakarta.persistence.Id;

public class IndianFood extends Food{
	
	@Id
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public IndianFood(int foodId, String foodName, String type) {
		super(foodId, foodName);
		this.type = type;
	}

	public IndianFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IndianFood(int foodId, String foodName) {
		super(foodId, foodName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IndianFood [type=" + type + "]";
	}
	
	

}
