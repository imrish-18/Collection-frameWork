package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapImpl {

	public static void main(String[] args) {
	// insertion order is preserved underlying ds is linked list + hashtable  1.4v
LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
map.put(1, "virat");
map.put(2, "shikhar");
map.put(5, "dhoni");
map.put(3, "shreyas");
map.put(4, "rohit");
System.out.println(map);
	}

}
