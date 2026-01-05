package com.exceptionss;

public class DemoonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=5;int b=0;
		int a=5,b[]= {2,3,4,5};
		//String s1=new String();
		//String s2;
		//System.out.println(s1);
		try {
			for(int i=0;i<=b.length;i++)
			System.out.println(a/b[i]);
		}
		//try {
			//System.out.println(s1.charAt(2));
			//throw new NullPointerException();
		//}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		catch(RuntimeException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("Application closed");
		
		

	}

}
