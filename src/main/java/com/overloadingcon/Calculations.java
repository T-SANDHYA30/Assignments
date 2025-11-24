package com.overloadingcon;

public class Calculations {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(long a,int b) {
		System.out.println(b+a);
	}
	public void add(int a,long b) {
		System.out.println(b+a);
	}
	public void add(long l,double d) {
		System.out.println(l+d);
	}
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	

	public static void main(String[] args) {
		
		Calculations c=new Calculations();
		c.add(2, 3);
		
	
	}
	

}
