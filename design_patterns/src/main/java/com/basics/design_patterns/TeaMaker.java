package com.basics.design_patterns;

public class TeaMaker extends DrinkMaker{
	
	@Override
	void makeDrink() {
		System.out.println("make tea");
	}
	@Override
	void addExtras() {
		System.out.println("add ginger");
		
	}

}
