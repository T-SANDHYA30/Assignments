package com.stringss.nov22;

import java.util.StringTokenizer;

public class Mutuable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer sb= new StringBuffer();
		 sb.append("sandhya,hello");
		 sb.append("lovely");
		 sb.append(" soulful");
		 System.out.println(sb);
		 System.out.println(sb.capacity());
		 
		 sb.ensureCapacity(40);
		 System.out.println(sb.capacity());
		 
		 StringBuilder sb1= new StringBuilder("  sandhya Nice");
		 System.out.println(sb1);
		 sb1.trimToSize();
		 //System.out.print(sb1.trimToSize());
		 sb1.replace(0,7,"****");
		 System.out.println(sb1);
		 
		 
		 String str="apple,guava,cherry,banana";
		 StringTokenizer tokenizer =new StringTokenizer(str,",");
		 while(tokenizer.hasMoreTokens())
			 System.out.println(tokenizer.nextToken());
		 

	}

}
