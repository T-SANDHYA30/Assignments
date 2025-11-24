package com.methodreferences.nov24;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoonObjectMethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myname="sandhya thummaluru";
		Supplier<Integer> lengthUsingLambda=()->myname.length();
		Supplier<Integer> lengthUsingMR=myname::length;
		
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=()->h.sayHello();
		Supplier<String> helloUsingMR=()->h.sayHello();
		
		System.out.println(helloUsingMR.get());
		System.out.println(helloUsingLambda.get());
		
		NumberUtil nu= new NumberUtil();
		Predicate<Integer> IsEvenNumUsingMR=nu::IsEvenNum;
		System.out.println(IsEvenNumUsingMR.test(45));
		
		Function<Integer,Integer> SquareNumMR=nu::SquareNum;
		System.out.println(SquareNumMR.apply(89));
		
		Function<Double,Double> logMR=nu::logNum;
		System.out.println(logMR.apply(2.00));
		
		int arr[]= {45,67,34,292};
		Consumer<int[]> printMR=nu::printNum;
		printMR.accept(arr);

	}

}

class Hello{
	
	public String sayHello() {
		return "heloooo";
	}
	
}

class NumberUtil{
	
	public int SquareNum(int num) {
		return  num*num;
	}
	
	public boolean IsEvenNum(int num) {
		return  num%2==0;
	}
	
	public double logNum(double num) {
		return  Math.log(num);
	}
	
	public void printNum(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(i);
	}
}
