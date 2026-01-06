//package com.project.spEL.beans;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SpELDemoClass {
//	
//	@Value("#{10+20}")
//	private int add;
//	@Value("#{5*7}")
//	private int mul;
//	@Value("#{5/2}")
//	private float division;
//	@Value("#{'sandhya'.length()>7?'hello'}")              //"swapna".length()>&?
//	private String result;
//	@Value("#{5>3}")
//	private boolean flag;
//	@Value("#{'hello'.concat(' world ')}")
//	private String concatStr;
//	@Value ("#{T(java.time.LocalDate).now()}")
//	private LocalDate todayDate;
//	@Value("#{T(java.lang.Math).pow(5,3)}")
//	private double power;
//	@Value("#{T{java.util.Arrays).asList('swapna','sandy','sammy)}")
//	private List<String> names;
//	
//	
//	public void printAll() {
//		System.out.println("Add of nums using SpEL" +add);
//		System.out.println(mul);
//		System.out.println(division);
//		System.out.println(result);
//		System.out.println(flag);
//		System.out.println(concatStr);
//		System.out.println(todayDate);
//		System.out.println(power);
//		names.forEach(System.out::println);
//	}
//
//}
