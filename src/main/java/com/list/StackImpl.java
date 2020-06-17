package com.list;

import java.util.Enumeration;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
	Stack s=new Stack();
	s.add("a");
	s.add("b");
	s.add("c");
	System.out.println(s);
	System.out.println(s.search("a"));
	System.out.println(s.search("z"));
	s.pop();
	System.out.println(s);
	s.peek();
	System.out.println(s);
	
	
Enumeration it=	s.elements();
while(it.hasMoreElements())
System.out.println(it.nextElement());
	}

}
