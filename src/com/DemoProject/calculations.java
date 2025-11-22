package com.DemoProject;

public class calculations {
	public static void main(String args[]) {
		int a=10;
		int b=4;
		System.out.println(a+b);    //14
		System.out.println(a-b);    //6
		System.out.println(a*b);    //40
		System.out.println(a/b);    //2
		System.out.println(a%b);    //2
		System.out.println(a++);    //10
		System.out.println(++a);    //12
		int c= a++; //Assign then increment c=12,a=12+1=13
        int d= ++a;  //Inc then Assign      a=13+1=14 d=14
        System.out.println(a);
        System.out.println(c);   //12
        System.out.println(d);   //14 
        
        //bitwise
        
        int i=4;int j=5;
        System.out.println(i&j);   //4
        System.out.println(i|j);   //5
        System.out.println(i^j);   //1
        System.out.println(i<<1);  //8
        System.out.println(i>>1);  //2
        System.out.println(~~j);
        
        System.out.println((a>b)?(a>c)?a:c:(b>c)?b:c); 
        System.out.println(a>b?(a>c?a:c):(b>c?b:c));
        
        
				
	}

}
