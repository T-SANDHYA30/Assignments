package com.practice.OopsPractice;

public abstract class Account {
	
	private long accno;
	private String holder;
	private String bankname;
	private String iFSC;
	private int pin;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accno, String holder, String bankname, String iFSC, int pin) {
		super();
		this.accno = accno;
		this.holder = holder;
		this.bankname = bankname;
		this.iFSC = iFSC;
		this.pin = pin;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getiFSC() {
		return iFSC;
	}
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", holder=" + holder + ", bankname=" + bankname + ", iFSC=" + iFSC + ", pin="
				+ pin + "]";
	}
	public abstract void withDraw(double amount);
	
	
}
	