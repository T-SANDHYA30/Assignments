package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(68);
		ts.add(99);
		ts.add(12);
		ts.add(23);
		System.out.println(ts);
		System.out.println(ts.ceiling(99));
		System.out.println(ts.floor(39));
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(ts.headSet(68));
		System.out.println(ts.tailSet(68));
		System.out.println(ts.higher(99));
		
		 TreeSet<Student> studentTree = new TreeSet<>();

		 studentTree.add(new Student(1, "sandhya", 23, "kadapa", 100));
		 studentTree.add(new Student(2, "madhu", 17, "hyd", 75));
		 studentTree.add(new Student(3, "renu", 13, "goa", 40));
		 studentTree.add(new Student(4, "devi", 12, "pune", 80));
		 studentTree.add(new Student(5, "sanu", 29, "kerala", 50));
         for(Student s:studentTree)
	     System.out.println(s);
		

	

		

	}

}
