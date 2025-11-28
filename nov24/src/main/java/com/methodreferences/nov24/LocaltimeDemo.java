package com.datestimes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocaltimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime t1=LocalTime.of(22,30);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(10,45,30);
		System.out.println(t2);
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
		//convert string to localtime
		String strTime="11:35:20";
		LocalTime convertedTime=LocalTime.parse(strTime);
		System.out.println(convertedTime);
		
		//converting to specfic format
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(df);
		System.out.println(formattedTime);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		
		//convert string to localdatetime
		DateTimeFormatter df1=DateTimeFormatter.ofPattern("yyyy-MM-yy hh:mm:ss a");
		//LocalDateTime lt=LocalDateTime.of(2024, 11,22,15,45,50);
		//String str=df.format(lt);
		//System.out.println(str);
		
		String str1="2024-11-22 15:45:50";
		LocalDateTime parsedDateTime=LocalDateTime.parse(str1,df1);
		System.out.println(parsedDateTime);
		
	
		
		

	}

}
