package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentImpl extends Thread {

	static ArrayList<String> l=new ArrayList<>();
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
      l.add("d");
		
	}
	public static void main(String args[]) throws InterruptedException
	{
		
		l.add("A");
		l.add("b");
		l.add("c");
		l.add("C");
		ConcurrentImpl con=new ConcurrentImpl();
		con.start();
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Thread.sleep(3000);
		}
		System.out.println(l);
		
	}
}
