package com.exceptionss;

public class CustomExceptions {
	
	//try catch

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("swapna",123,2);
		System.out.println(p);
		try {
			p.checkEligibility();
		}
		catch(AgeNotSufficientException e) {
			e.printStackTrace();
		}*/
	
	//throws
		public static void main(String[] args) throws AgeNotSufficientException {
			// TODO Auto-generated method stub
			
			Person p=new Person("swapna",123,2);
			System.out.println(p);
			p.checkEligibility();
			System.out.println("application closed");

	}

}
