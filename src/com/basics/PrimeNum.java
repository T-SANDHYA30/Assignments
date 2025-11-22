package com.basics;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("Enter num:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count!=0)
			System.out.println("not prime number");
		else
			System.out.println("prime");
	}

}
