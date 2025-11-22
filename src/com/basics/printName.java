package com.basics;

import java.util.Scanner;

public class printName {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char choice;
		do {
			System.out.println("do you wanna repeat y/n");
			choice=s.next().charAt(0);
		}
		while(choice!='n');
		System.out.println("thank you..");

	}

}
