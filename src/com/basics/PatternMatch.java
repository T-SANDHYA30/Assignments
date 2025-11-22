package com.basics;

import java.util.Scanner;

public class PatternMatch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String mobilenum=s.next();
		if(mobilenum.matches("[6-9]\\d{9}"))
			System.out.println("valid Number");
		else
			System.out.println("not valid");
		

	}

}
