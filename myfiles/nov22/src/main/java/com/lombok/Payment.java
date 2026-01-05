package com.lombok;


@FunctionalInterface

public interface Payment {
	
	public void pay(double amount);
	
	public default void generateReceipt(double amount) {
		System.out.println("Receipt generated: "+amount);
		
		
	}
	public static boolean validateAmount(double amount) {
		return amount>0;
	}

}
