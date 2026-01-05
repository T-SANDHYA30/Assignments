package com.methodreferences.nov24;

import java.util.function.Function;

public class Strings {
	
	static class stringUtil{
		
		public static int strLen(String name) {
			return name.length();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name="sandhya";
		Function<String, Integer> strLenUsingLambda=(name)->stringUtil.strLen(name);
		Function<String, Integer> strLenUsingmR=stringUtil::strLen;
		
		System.out.println(strLenUsingLambda.apply("sandhya"));
		System.out.println(strLenUsingmR.apply("sandhya"));
		
	
	}

}
