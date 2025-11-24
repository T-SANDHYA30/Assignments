package com.datestimes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.xml.crypto.Data;

public class DemoonLocaldate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
		
		LocalDate mydate=LocalDate.of(2025,6,23);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is"+today.plusDays(3));
		System.out.println("5 days ahead today is"+today.minusDays(5));
		
		LocalDate date1= LocalDate.of(2023,  5, 15);
		LocalDate date2= LocalDate.of(2020,  7, 13);
		System.out.println(date1.isBefore(date2));
		
		
		//converting string to localdate
		String strDate="2024-04-19";
		LocalDate ldate=LocalDate.parse(strDate);
		System.out.println(ldate);
		
		//converting local date to sql date
		
		Date sqlDate=java.sql.Date.valueOf(ldate);
		
		//converting localdate to given format
		DateTimeFormatter df =DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String formatted=today.format(df);
		System.out.println("formatted");
		
		
		today=LocalDate.now();
		LocalDate dob=LocalDate.of(1981,  06, 26);
		Period p=Period.between(dob, today);
		System.out.println("My age is "+p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days");
		
	}

}
