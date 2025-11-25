package com.arrays;

import java.util.Arrays;

public class ArrayUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,80,30,40};
		int[] arr1= {10,20,30,40};
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for(int i:arr)
			System.out.println(i);
		System.out.println(Arrays.binarySearch(arr, 30));
		System.out.println(arr.equals(arr1));
		int[] arr3= {45,10,30,40};
		int[] arr4= {10,45,30,40};
		System.out.println(Arrays.equals(arr3,arr4));
		
		int crr[]=Arrays.copyOf(arr,10);
		for(int ele:crr)
			System.out.println(ele);
		Arrays.fill(arr1,34);
		for(int x:crr)
			System.out.println(x);
		
		
		
	}

}
