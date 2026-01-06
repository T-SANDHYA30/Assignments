package com.basics.design_patterns;

public class CoffeeMaker extends DrinkMaker{
	
	@Override
	void makeDrink() {
		System.out.println("make coffee");
	}
	void addExtras() {
		System.out.println("add sugar");
		
	}

}
