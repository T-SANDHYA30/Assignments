package com.searching.sortingandsearching;

public class BubSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,0,40,56,23,41,80};
		int n=arr.length-1;
		int temp;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]<arr[j+1]) {
					temp=arr[i];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

}
