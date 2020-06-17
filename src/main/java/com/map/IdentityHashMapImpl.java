package com.map;

import java.util.IdentityHashMap;

public class IdentityHashMapImpl {

	public static void main(String[] args) {
	IdentityHashMap<Integer,String> map=new IdentityHashMap<>();
	// in case of indentityhasmap jvm will use == to identify duplicates keys
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	map.put(i1,"virat");
	map.put(i2, "dhoni");
	System.out.println(map);
	 map.put(1, "sachin"); 
	 map.put(2, "rohan");
	 map.put(1, "robin"); 
	 map.put(4, "sachin");
	 map.put(3, "rohan"); 
	 map.put(5, "robin");
	 System.out.println(map);

	}

}
