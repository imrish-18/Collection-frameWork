package com.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapImpl  extends Thread
{
	 static ConcurrentMap<Integer,String> map=new ConcurrentHashMap<Integer, String>() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	};
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating map");
     map.put(3,"d");
	}
	public static void main(String args[]) throws InterruptedException
	{
		
		map.put(1, "A");
		map.put(2, "B");
	ConcurrentHashMapImpl con=new ConcurrentHashMapImpl();
	
	con.start();
	Set s=map.keySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
		System.out.println( "main thread iterating map and current entry is "+map.get(it.next()));
		Thread.sleep(3000);
	}
	System.out.println(map);
	
	/*	map.put(1,"A");
		System.out.println(map);
		map.putIfAbsent(2, "B");
		map.putIfAbsent(2,"c");
		map.remove(1, "b");
		map.replace(1, "a");
		System.out.println(map);
		map.remove(1,"a");
		map.replace(2, "B","c");
		System.out.println(map );
	*/
}
	}

