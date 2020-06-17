package com.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetImpl {

	public static void main(String[] args) {
	NavigableSet<String> set=new TreeSet<>();
	set.add("1");
	set.add("2");
	set.add("3");
	//set.add("4");
	set.add("5");
	set.add("6");
	set.add("7");
	set.add("8");
	System.out.println(set);
	System.out.println(set.floor("4"));// either before or equal to object
	System.out.println(set.lower("4"));// before object
	System.out.println(set.higher("4"));// after object
	System.out.println(set.ceiling("4")); // after or equal to object
System.out.println(set.descendingSet());
System.out.println(set.pollFirst());// remove and return first element
System.out.println(set.pollLast());// remove and return last element
System.out.println(set);
	}

}
