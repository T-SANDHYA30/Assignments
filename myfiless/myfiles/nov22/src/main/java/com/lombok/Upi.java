package com.lombok;

public class Upi implements Payment{
	
	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount))
		{
			System.out.println("amount paid"+amount+"using UPI");
			generateReceipt(amount);
		}
		else {
			System.out.println("payment failed, invalid amount");
		}
	}

}
