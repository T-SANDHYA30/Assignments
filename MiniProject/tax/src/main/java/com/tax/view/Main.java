package com.tax.view;


import java.util.Scanner;
public class Main {
	//main method for login of user
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----welcome to tax application----");
		System.out.println("please Login to continue--");
		System.out.print("user-\n");
		String name = sc.nextLine();
		System.out.print("password-");
		String pass = sc.nextLine();
		if (name.equals("admin") && pass.equals("admin@123")) {
			System.out.println("login Succesfully");
			HomePage.process();
		} else {
			System.out.println("password or userid incorrect");
		}
		
	}
 
}