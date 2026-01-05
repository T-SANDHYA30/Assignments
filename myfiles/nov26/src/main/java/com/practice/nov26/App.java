package com.practice.nov26;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("immmutable class creation");
    	System.out.println("1.class need to be final"+ "\n 2.properties need to be final" + "\n 3.properties need to get value through constructor"+ "\n 4.no setters to modify data");
        Person p1=new Person("sandhya",7332);
        System.out.println(p1);
       
    }
}
