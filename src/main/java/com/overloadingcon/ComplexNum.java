package com.overloadingcon;

public class ComplexNum {
	int real;
	int imag;

	public ComplexNum() {
		super();
	}

	public ComplexNum(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "ComplexNum [real=" + real + ", imag=" + imag + "]";
	}

	public void add(ComplexNum c1, ComplexNum c2) {
		ComplexNum c3=new ComplexNum();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+i"+c3.imag);

	}
	public static void main(String[] args) {
		ComplexNum c4=new ComplexNum();
		ComplexNum c1=new ComplexNum(1,2);
		ComplexNum c2=new ComplexNum(7,2);
		c4.add(c1,c2);
	}

}
