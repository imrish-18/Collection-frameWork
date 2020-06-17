package com.map;

import java.util.Hashtable;

class Temp1
{
	int i;
	public Temp1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+"";
	}
}
public class HashtableImpl {

	public static void main(String[] args) {
	Hashtable h=new Hashtable();
	h.put(new Temp1(5),"A");
	h.put(new Temp1(2),"rohitB");
	h.put(new Temp1(6),"rohitV");
	h.put(new Temp1(15),"rohitF");
	h.put(new Temp1(16),"rohit");
	System.out.println(h);
	System.out.println(h.size());

	}

}
