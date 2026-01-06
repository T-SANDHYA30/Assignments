package com.unittesting.junit;

public class App 
{
	 public String sayHell() {
	    	return "Hello";
	    }
	 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app=new App();
        app.sayHell();
        
    }
    public String checkTest() {
    	String str="sandhya";
    	return str;
    }
   
}
