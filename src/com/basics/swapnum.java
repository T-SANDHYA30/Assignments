package com.basics;

public class swapnum {
	public static void main(String args[]) {
		int a=2;
		int b=3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("after swaping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("a="+a);
		
		
		//swapping 3 numbers
		int i=5;
		int j=6;
		int k=7;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		i=i+j+k;
		j=i-j-k;
		k=i-j-k;
		i=i-j-k;
		System.out.println("after swaping");
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
	}

}
