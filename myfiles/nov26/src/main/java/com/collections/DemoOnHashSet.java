package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class DemoOnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data is stored using hash function
		//no duplication
		//no insertion order
		//can insert only 1 null
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(56);
		hashSet.add(34);
		hashSet.add(89);
		hashSet.add(99);
		hashSet.add(77);
		System.out.println(hashSet);
		hashSet.add(89);
		hashSet.add(89);
		System.out.println(hashSet);
		
		for(Integer i:hashSet)
			System.out.println(i);
		
		Iterator<Integer> itr=hashSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		hashSet.forEach(i->System.out.println(i));
		hashSet.forEach(System.out::println);
		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println(hashSet.equals(45));
		

	}

}
