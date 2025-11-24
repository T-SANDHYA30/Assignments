package com.datestimes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Date date=new Date(2025-1900, 10, 24);
        //System.out.println(date);
		//System.out.println(new java.util.date());
	    //java.util.Date utilDate=new java.util.date();
		
		Date today=new Date();
		java.sql.Date sqlDate=new java.sql.Date(today.getTime());
		System.out.println(today);
		System.out.println(sqlDate);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String formatedDate=sdf.format(today);
		sqlDate=java.sql.Date.valueOf(formatedDate);
		System.out.println(sqlDate);
          
	}

}
