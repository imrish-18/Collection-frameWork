package com.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
//	Integer i1=(Integer)obj1;
//	Integer i2=(Integer)obj2;
	//return i1.compareTo(i2);
	return ((String) obj1).compareTo((String) obj2);
//	if(i1<i2)
//		return 1;
//	else if(i1>i2)
//		return -1;
//	
//	return 0;
	}
	
}

public class SortedSetImpl {

	public static void main(String[] args) {
		NavigableSet<String> tset=new TreeSet<String>(); 
		TreeSet t=new TreeSet<>();
		//tset.add(null); null is not allowed in treeset
		tset.add("1");
//		//tset.add(null);
		tset.add("rishabh");
		tset.add("hello");
		//tset.add(null);
		
		System.out.println(tset);
//		
//		t.add(new StringBuffer("a"));
//		t.add(new StringBuffer("b"));
//		t.add(new StringBuffer("A")); because stringBuffer class does not implements comparable interface
//		t.add(new StringBuffer("B"));
//		System.out.println(t);
		
		TreeSet <String>set=new TreeSet<String>(new Comparator<String>()
				{

					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return -((String) o1).compareTo((String) o2);
					}
			
				});
		/*
		 * set.add(10); set.add(4); set.add(19);
		 */
		set.add("rohan");
		set.add("aakash");
		set.add("rishabh");
		set.add("akshay");
		System.out.println(set);
		
	

	}

}
