package com.lombok;

public class Creditcard implements Payment{
	
	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount))
		{
			System.out.println("amount paid "+amount+" using creditcard");
			generateReceipt(amount);
		}
		else {
			System.out.println("payment failed, invalid amount");
		}
	}

}
