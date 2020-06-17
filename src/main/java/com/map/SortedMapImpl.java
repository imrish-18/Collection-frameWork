package com.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapImpl {

	public static void main(String[] args) {
		SortedMap<Integer, String> map=new TreeMap<>(); 
		// map.put(null, "virat"); npe occurs to store null keys
		Integer i=new Integer(6);
		Integer i1=new Integer(6);
		map.put(1,"virat");
		map.put(2,"dhoni");
		map.put(3,"rohit");
		map.put(4,"sikhar");
		map.put(5,"sachin");
        map.put(i, "sehwag");
      //  map.put(i1, "shreayas");// in case of indentityhasmap jvm will use equals to identify duplicates keys
		System.out.println(map);

	}

}
