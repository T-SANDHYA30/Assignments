package com.practice.OopsPractice;

public class savingAcc extends Account{
	private double balance;

	public savingAcc(long accno, String holder, String bankname, String iFSC, int pin, double balance) {
		super(accno, holder, bankname, iFSC, pin);
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "savingAcc [balance=" + balance + ", getAccno()=" + getAccno() + ", getHolder()=" + getHolder()
				+ ", getBankname()=" + getBankname() + ", getiFSC()=" + getiFSC() + ", getPin()=" + getPin();
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
		else
			System.out.println("insufficient funds");
	}
	
	public void deposit(double amount) {
			this.balance=this.balance+amount;
			System.out.println("Deposited successfully");
	}
	
	
	//code for generate pin change pin
	

}
