package com.map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize method is called");
	}
}
public class WeakHashMapImpl {

	public static void main(String[] args) throws InterruptedException {
WeakHashMap map=new WeakHashMap();	
Temp t=new Temp();
map.put(t,"rishabh");
System.out.println(map);
t=null;
// gc cann't destroy this object because it is associated with hashmap
// but in case of weakhashMap gc can destroy this object 
System.gc();
Thread.sleep(5000);
System.out.println(map);

	}

}
