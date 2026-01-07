package com.datestimes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		//Date date=new Date(2025-1900, 10, 24);
        //System.out.println(date);
		//System.out.println(new java.util.date());
	    //java.util.Date utilDate=new java.util.date();
		
		Date today=new Date();
		java.sql.Date sqlDate=new java.sql.Date(today.getTime());
		System.out.println(today);
		System.out.println(sqlDate);
		
		
		//util to sql using simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String formatedDate=sdf.format(today);
		sqlDate=java.sql.Date.valueOf(formatedDate);
		System.out.println(sqlDate);
		
		//converting string to util date then to sql date
		String strDate="15-08-2025";
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(strDate);
		java.sql.Date sDate=new java.sql.Date(uDate.getTime());
        
		
		//convert sql date to util date using valueOf
		java.sql.Date sqlDate1= java.sql.Date.valueOf("2025-10-24");
		java.util.Date utilDate1=new java.util.Date(sqlDate1.getTime());
		java.util.Date utilDate2=sqlDate1;
		
		
		//using simple dateformat to convert util to sql
		java.sql.Date sqlDate2=java.sql.Date.valueOf("2025-03-25");
		String str=sqlDate.toString();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.parseObject(str));
		
		//convert string to sql date then to util date
		String myDate="2023-06-26";
		sqlDate1=java.sql.Date.valueOf(myDate);
		System.out.println(sqlDate1);
		utilDate1=new java.util.Date(sqlDate1.getTime());
		System.out.println(utilDate1);
	
	}

}
