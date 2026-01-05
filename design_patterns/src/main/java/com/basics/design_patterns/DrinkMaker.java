package com.basics.design_patterns;

public abstract class DrinkMaker{ 
	
	abstract void makeDrink();
	abstract void addExtras();
	
	public final void prepareDrink() {
		boilWater();
		makeDrink();
		addExtras();
		serve();
	}
	public void boilWater() {
		System.out.println("water boiled");
	}
	public void serve() {
		System.out.println("drink served");
	}


}
