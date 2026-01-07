package com.unittesting.junit;

public class Calculator {
	
	public int addtest(int a,int b) {
		return a+b;
		
	}
	public int subtractiontest(int a,int b) {
		return a-b;
		
	}
	public int multiplicationtest(int a,int b) {
		return a*b;
		
	}
	public int divisiontest(int a,int b) {
		return a/b;
		
	}
	public boolean isEven(int a) {
		if(a%2==0)
			return true;
		else
			return false;
	}
	public int[] checkArrays() {
		int arr[]= {1,2,3,4,5};
		return arr;
	}
	public ArithmeticException checkAE() {
		return new ArithmeticException();
		
	}

}
