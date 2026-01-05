package com.methodreferences.nov24;

import java.util.function.Function;
import java.util.function.Predicate;

public class DemoonMethodReferences {
	
	//classname::methodname
	//objname::methodname
	
	static class NumberUtil{
		
		public static int squareNum(int num) {
			return num*num;
		}
		
		public static double log(double num) {
			return Math.log(num);
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
	}
	
	public static void main(String[] args) {
		Function<Integer,Integer> squareFunctionUsingLambda=(num)->NumberUtil.squareNum(num);
		Function<Integer,Integer> squareFunctionMR=NumberUtil::squareNum;
		System.out.println(squareFunctionUsingLambda.apply(6));
		System.out.println(squareFunctionMR.apply(8));
		
		Function<Double,Double> logUsingMR=NumberUtil::log;
		Function<Double,Double> logUsingLambda=(num)->NumberUtil.log(num);
		
		System.out.println(logUsingLambda.apply(67.6));
		System.out.println(logUsingMR.apply(100.0));
		
		Predicate<Integer> isEvenusingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenusingMR=NumberUtil::isEven;
		
		System.out.println(isEvenusingLambda.test(67));
		System.out.println(isEvenusingMR.test(100));
		
		
	};
	

}
