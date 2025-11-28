package com.collections;

import java.util.LinkedHashSet;

public class DemoOnLinkedHashSet {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(56);
		lhs.add(76);
		lhs.add(23);
		lhs.add(45);
		lhs.add(56);
		lhs.add(67);
		System.out.println(lhs);
		
		System.out.println(lhs.newHashSet(54));
	}

}
