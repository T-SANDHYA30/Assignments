package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.practice.nov26.Person;

public class DemoOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList alist=new ArrayList();
		alist.add(56);
		alist.add("sandhya");
		alist.add(true);
		alist.add(78.34);
		Person p=new Person("sandhya",23434);
		alist.add(p);
		System.out.println(alist);
		System.out.println(alist.get(2));
		alist.add(34);
		alist.add("sandhya");
		alist.add(null);
		alist.add(null);
		System.out.println(alist);
		
		//using syso
		System.out.println("using syso");
		ArrayList<String> namesList=new ArrayList<String>();
		namesList.add("amit");
		namesList.add("preethi");
		namesList.add("Preethi");
		namesList.add("rreenu");
		System.out.println(namesList);
		
		//enhanced forloop
		for(String name:namesList)
			System.out.println(name);
		
		//iterator
		System.out.println("using iterator");
		Iterator<String> itr=namesList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//listiterator
		System.out.println("using listItertor");
		ListIterator<String> litr=namesList.listIterator();
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("using listItertor forward direction");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		System.out.println(namesList.contains("amit"));
		System.out.println("for each");
		namesList.forEach(name -> System.out.println(name));  //consumer using lambda
		
		namesList.forEach(System.out::println);  //consumer using mr
		
		System.out.println("remove");
		System.out.println(namesList.remove(1));
		
		Integer[] arr= {23,5,6,7,7};
		Integer[] brr= {9,8,7,6,3,2,1};
		List<Integer> numList1= new ArrayList (Arrays.asList(arr));       //converting arraylist to list
		List<Integer> numList2= new ArrayList (Arrays.asList(brr));
		System.out.println("before retainall operation"+numList1);
		numList1.retainAll(numList2);
		System.out.println("before retainall operation"+numList1);
		numList2.retainAll(numList2);
		
		
		System.out.println("Nameslist:"+namesList);
		
		Collections.sort(namesList);                           //here collection is utility class
		//namesList.sort(null);
		System.out.println("After sorting\n"+namesList);             //sorting based on ascii values
		
		ArrayList<String> clonedNamesList= (ArrayList<String>) namesList.clone();
		System.out.println(namesList.hashCode());
		System.out.println(clonedNamesList.hashCode());
		
		clonedNamesList.add("swapna");
		System.out.println(clonedNamesList.hashCode());
		
		
		
		 ArrayList<Student> studentList = new ArrayList<>();

	        studentList.add(new Student(1, "sandhya", 23, "kadapa", 100));
	        studentList.add(new Student(2, "madhu", 17, "hyd", 75));
	        studentList.add(new Student(3, "renu", 13, "goa", 40));
	        studentList.add(new Student(4, "devi", 12, "pune", 80));
	        studentList.add(new Student(5, "sanu", 29, "kerala", 50));

	        studentList.add(new Student(6, "sandhya", 23, "kadapa", 20));
	        studentList.add(new Student(7, "swathi", 23, "hyd", 85));
	        studentList.add(new Student(8, "abhi", 13, "goa", 45));
	        studentList.add(new Student(9, "devi", 12, "pune",60));
	        studentList.add(new Student(5, "sanu", 29, "kerala", 50));

	        studentList.add(new Student(1, "sandhya", 23, "kadapa", 100));
	        studentList.add(new Student(8, "prass", 19, "hyd", 99));
	        studentList.add(new Student(3, "renu", 13, "goa", 40));
	        studentList.add(new Student(4, "devi", 12, "pune", 34));
	        studentList.add(new Student(5, "sanu", 29, "kerala", 90));
//
	        for(Student s:studentList)
	        	System.out.println(s);
//	        
	        studentList.sort(new CityComparator().thenComparing(new NameComparator()));
	        System.out.println("***After sorting*****");
            for(Student s:studentList)
        	System.out.println(s);
	        

		
		
	}

}
