package com.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap
		
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "hyd");
		hashMap.put(12, "goa");
		hashMap.put(31, "bnlr");
		hashMap.put(4, "kdp");
		
		System.out.println(hashMap);
		hashMap.put(12, "pune");
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.getOrDefault(14, "delhi"));
		System.out.println(hashMap);
		
		Set<Integer> keySet=hashMap.keySet();
		Set<String> valueSet= new HashSet<String> (hashMap.values());
		Iterator<Integer> keyitr= keySet.iterator();
		while(keyitr.hasNext())
			System.out.println(keyitr.next());
		
		Iterator<Entry<Integer,String>> entryitr=hashMap.entrySet().iterator();
		while(entryitr.hasNext())
			System.out.println(entryitr.next());
		
		//treemap
		TreeMap<Integer, Integer> treeMap=new TreeMap<Integer, Integer>();
		treeMap.put(1,1);
		treeMap.put(12,4);
		treeMap.put(3,9);
		treeMap.put(11,121);
		treeMap.put(3,null);
		System.out.println(treeMap);
		System.out.println(treeMap.ceilingEntry(5));
		System.out.println(treeMap.floorEntry(5));
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap.descendingKeySet());
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastEntry());
		System.out.println(treeMap.higherKey(12));
		System.out.println(treeMap.navigableKeySet());
		System.out.println(treeMap.pollFirstEntry());
		
		//hash table
		Hashtable<Integer, String>table=new Hashtable<Integer, String>();
		table.put(1,"raja");
		table.put(2,"raju");
		table.put(3,"raj");
		table.put(4,"rajesh");
		table.put(5,"ravi");
		
		System.out.println(table);
		
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		Enumeration<String> values=table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
	}

}
