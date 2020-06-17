package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsImpl {

	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(10);
		list.add(7);
		list.add(0);
		Collections.sort(list);
System.out.println(list);		
System.out.println(Collections.binarySearch(list, 4));// return insertion position where you can store that element 
System.out.println(Collections.binarySearch(list,3));// return index of that number if there are more element return last index
	
	Collections.reverse(list);
	System.out.println(Collections.binarySearch(list, 4));// return insertion position where you can store that element 
	System.out.println(Collections.binarySearch(list,3));
	System.out.println(list);
	}
}
