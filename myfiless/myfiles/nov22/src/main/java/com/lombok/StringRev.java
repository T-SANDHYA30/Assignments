package com.lombok;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse sr=(String str)-> System.out.println(new StringBuffer(str).reverse().toString());
		sr.stringReverse("sandhya");
		

	}

}
