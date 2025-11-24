package com.practice.OopsPractice;

public class currentAcc extends Account{
	private double balance;

	public currentAcc(double balance) {
		super();
		this.balance = balance;
	}

	public currentAcc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public currentAcc(long accno, String holder, String bankname, String iFSC, int pin) {
		super(accno, holder, bankname, iFSC, pin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "currentAcc [balance=" + balance + ", getBalance()=" + getBalance() + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withDraw(double amount) {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("withdrawn successfully");
		}
		//else
			//System.out.println("insufficient funds");
	}
	
	public void deposit(double amount) {
			this.balance=this.balance+amount;
			System.out.println("Deposited successfully");
	}
	

}
