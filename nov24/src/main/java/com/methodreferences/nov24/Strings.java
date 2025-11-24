package com.methodreferences.nov24;

import java.util.function.Function;
import java.util.function.Supplier;

public class Strings {
	
	static class stringUtil{
		
		public static int strLen(String name) {
			return strLen(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="sandhya";
		Function<String, Integer> strLenUsingLambda=(name)->stringUtil.strLen(name);
		Function<String, Integer> strLenUsingmR=stringUtil::strLen;
		
	
	}

}
