package com.assesments;

public class App {
	public static void main(String[] args) {
//		Logger l= Logger.getInstance();
//		System.out.println(l.hashCode());
//		l.getText("sandhya");
//		Logger l2= Logger.getInstance();
//		System.out.println(l2.hashCode());
//		l2.getText("banglore");
//		
		ConfigurationManager cm= ConfigurationManager.getInstance();
		System.out.println(cm.hashCode());
		ConfigurationManager cm1= ConfigurationManager.getInstance();
		System.out.println(cm1.hashCode());
		
		
		
	}
	


}
