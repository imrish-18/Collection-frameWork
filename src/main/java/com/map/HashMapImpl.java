package com.map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapImpl {

	public static void main(String[] args) {
		// insertion order is not preserved but it is based on hash code of value underlying ds is hashtable
		// no thread safe not synchronized 1.2v
		Map<Integer,String> map=new HashMap<>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		/*
		 * map.put(1, "sachin"); map.put(2, "rohan"); map.put(1, "robin"); map.put(4,
		 * "sachin"); map.put(3, "rohan"); map.put(5, "robin");
		 * System.out.println(map.containsValue("robin")); System.out.println(map);
		 * Set<Integer> set=map.keySet(); System.out.println(map.values());
		 * System.out.println(set);
		 * 
		 * 
		 * 
		 * Set<Entry<Integer, String>> s=map.entrySet(); System.out.println(s);
		 * Iterator<Entry<Integer, String>> it=s.iterator(); while(it.hasNext()) {
		 * Entry<Integer, String> me=it.next();
		 * System.out.println(me.getKey()+"  "+me.getValue()); }
		 */
		map.put(i1, "rohit");
		map.put(i2,"shikhar");
		System.out.println(map);
		// in case of hashmap jvm will use equals() to identify duplicates keys and new value is replaced with old value
		
	}

}
