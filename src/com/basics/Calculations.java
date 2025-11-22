package com.basics;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter operator");
		op=s.next().charAt(0);
		switch(op) {
		case '+': 
			System.out.println(a+b);
		    break;
		case '-':
			System.out.println(a-b);
	        break;
		case '*': 
			System.out.println(a*b);
		    break;
		case '/': 
			System.out.println((float)(a/b));
		    break;
		default:
			System.out.println("Not valid operator");	
		}
	}
}
