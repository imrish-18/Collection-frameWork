package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
	
           // Queue q=new LinkedList(); from 1.5 v linked list also implement queue interface and always follow fifo
		Queue<String> qu=new PriorityQueue<>();
		qu.offer("hello");
		qu.offer("rishabh");
		System.out.println(qu.poll());
		// if queue is empty then return null;
		System.out.println(qu.remove());// if queue is empty then RE:nosuchElement exception
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.element());
		// if queue is empty then RE:nosuchElement exception
	}

}
