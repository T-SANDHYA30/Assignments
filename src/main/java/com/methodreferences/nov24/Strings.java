package com.methodreferences.nov24;

import java.util.Arrays;
import java.util.function.Function;

public class Strings {
	
	static class stringUtil{
		
		public static int strLen(String name) {
			return name.length();
		}
		

         public static String[] sortStrings(String[] input) {
            if (input == null) return null;
            String[] copy = Arrays.copyOf(input, input.length);
            Arrays.sort(copy, String::compareToIgnoreCase);
            return copy;

	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name="sandhya";
		Function<String, Integer> strLenUsingLambda=(name)->stringUtil.strLen(name);
		Function<String, Integer> strLenUsingmR=stringUtil::strLen;
		
		System.out.println(strLenUsingLambda.apply("sandhya"));
		System.out.println(strLenUsingmR.apply("sandhya"));
		
		String[] input= {"sandhya","nandhu","renu"};
		Function<String[], String[]> sortedByLambda = arr -> stringUtil.sortStrings(arr);
		Function<String[], String[]> sortedByMR = stringUtil::sortStrings;

        System.out.println("Sorted (Lambda): " + Arrays.toString(sortedByLambda.apply(input)));
        System.out.println("Sorted (Method Reference): " + Arrays.toString(sortedByMR.apply(input)));
	}
	}

