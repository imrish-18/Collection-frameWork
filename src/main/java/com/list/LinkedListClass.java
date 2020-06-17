package com.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class LinkedListClass {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	List<String> list1=new ArrayList<>();
	list.add("1");
	list.add("2");
	list.add(null);
list.add("3");
list.addFirst("5");
System.out.println(list);

System.out.println(list instanceof Serializable); 
	System.out.println(list1 instanceof Serializable); 
	System.out.println(list instanceof Cloneable); 
	System.out.println(list1 instanceof Cloneable); 
	System.out.println(list instanceof RandomAccess); // linked list does not implement the RandomAccess interface (marker Interface)
	System.out.println(list1 instanceof RandomAccess);
Iterator<String> it=	list.iterator();
while(it.hasNext())
	System.out.println(it.next());
it.remove();
while(it.hasNext())
	System.out.println(it.next());

System.out.println(list);

	}

}
