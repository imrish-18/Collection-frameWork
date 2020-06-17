package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		System.out.println("hello rishabh sharma");
		List<String> list=new ArrayList<>();
		list.add(0,"rishabh");
		list.add(1,"sachin");
		list.add(0,"robin");
		list.add(3,"sattu");
		list.add(null);
	System.out.println(list);
		ListIterator<String> it=list.listIterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(it.previous());
		it.add("6");
		//it.set("7");
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
//		ArrayList l=new ArrayList();
//		l.add(1);
//		l.add("virat");// heterogeneous element allowed
//		l.add(null);// null is allowed
//		System.out.println(l);

	}

}
