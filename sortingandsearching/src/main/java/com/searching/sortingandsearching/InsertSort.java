package com.searching.sortingandsearching;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,34,21,46,39,22};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+ " ");

	}

}
