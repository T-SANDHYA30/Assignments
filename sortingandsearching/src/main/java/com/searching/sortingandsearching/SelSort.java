package com.searching.sortingandsearching;

public class SelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,34,21,46,39,22};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int mi=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[mi])
					mi=j;
			int temp=arr[i];
			arr[i]=arr[mi];
			arr[mi]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

}
