package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(45);ll.add(78);ll.add(44);ll.add(90);ll.add(45);ll.add(100);
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(ll.offer(98));
		System.out.println(ll);
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.offerLast(88));
		System.out.println(ll);
		System.out.println(ll.addAll(6, ll));
		System.out.println(ll);
		System.out.println(ll.contains(45));
		System.out.println(ll.pop());
		
	}

}
