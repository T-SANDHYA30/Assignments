package com.practice.OopsPractice;

public class bankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		savingAcc sa=new savingAcc(34567444,"sandhya","icici","Muddanur12111", 456, 33000);
		System.out.println(sa);
		sa.withDraw(3000);
		System.out.println(sa);
		sa.deposit(6000);
		System.out.println(sa);

	}

}
