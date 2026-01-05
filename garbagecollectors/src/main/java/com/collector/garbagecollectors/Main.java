package com.collector.garbagecollectors;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("object creating");
			new MyClass();
			while(true) {
				System.out.println("object creating");
			}
		}

	}
	

}
class MyClass{
	static List<int[]> listItem=new ArrayList<int[]>();
}
