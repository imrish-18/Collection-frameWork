package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteALImpl {

	public static void main(String args[]) {
		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		copyOnWriteArrayList.add("A");
		copyOnWriteArrayList.addIfAbsent("B");
		copyOnWriteArrayList.addIfAbsent("B");
		copyOnWriteArrayList.addAll(list);
		System.out.println(copyOnWriteArrayList);
		list.add("A");
		list.add("D");
		copyOnWriteArrayList.addAllAbsent(list);
		System.out.println(copyOnWriteArrayList);
		Iterator it=copyOnWriteArrayList.iterator();
		copyOnWriteArrayList.add("E");
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(copyOnWriteArrayList);
		
		/*
		 * at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at com.concurrent.CopyOnWriteALImpl.main(CopyOnWriteALImpl.java:31)

		 * Iterator its=list.iterator(); list.add("F"); while(its.hasNext())
		 * System.out.println(its.next());
		 */
		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * 
		 * Iterator it=copyOnWriteArrayList.iterator(); while(it.hasNext()) { String
		 * str=(String)it.next(); if(str.equals("D")) it.remove();
		 * 
		 * }
		 */
	}
}
