package com.genrics;

public class ArrayPrinter<T>{
	
	private T[] arr;

	public ArrayPrinter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayPrinter(T[] arr) {
		super();
		this.arr = (T[])arr;
	}
	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = (T[])arr;
	}

	@Override
	public String toString() {
		return "ArrayPrinter []";
	}
	

}
