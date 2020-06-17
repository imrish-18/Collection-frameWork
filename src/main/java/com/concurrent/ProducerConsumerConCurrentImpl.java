package com.concurrent;
import java.util.concurrent.CopyOnWriteArrayList;


class Producer implements Runnable
{

	CopyOnWriteArrayList<Integer> copyOnWriteArrayList;
	int i=0;
	public Producer(CopyOnWriteArrayList<Integer> copyOnWriteArrayList) {
		super();
		this.copyOnWriteArrayList=copyOnWriteArrayList;
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				produce(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void produce(int i) throws InterruptedException
	{
		synchronized (copyOnWriteArrayList) {
			
	
		while(copyOnWriteArrayList.size()==5)
		{
			System.out.println("CopyOnWriteArrayList is full please wait for the consumer to  consume it");
			copyOnWriteArrayList.wait();
		}
		}
		synchronized (copyOnWriteArrayList) {
	
		System.out.println("producer is producing some items....."+i);
		copyOnWriteArrayList.addIfAbsent(i);
		Thread.sleep(1000);
		copyOnWriteArrayList.notify();
	}
		
		}
}
class Consumer implements Runnable
{
	CopyOnWriteArrayList<Integer> copyOnWriteArrayList;
	public Consumer(CopyOnWriteArrayList<Integer> copyOnWriteArrayList) {
		this.copyOnWriteArrayList=copyOnWriteArrayList;
	}

	@Override
	public void run() {
	try {
		consume();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public void consume() throws InterruptedException
	{
		synchronized (copyOnWriteArrayList) {
			
	
		while(copyOnWriteArrayList.isEmpty())
		{
			System.out.println("copyOnWriteArrayList is empty please wait to producer to produce item....");
			copyOnWriteArrayList.wait();
		}
		}
		synchronized (copyOnWriteArrayList) {
			
	
		Thread.sleep(1000);
		System.out.println("consumed item is......."+copyOnWriteArrayList.remove(0));
		copyOnWriteArrayList.notify();
	}
	}
	
}

public class ProducerConsumerConCurrentImpl {

	public static void main(String args[])
	{
		CopyOnWriteArrayList<Integer> copyOnWriteArrayList=new CopyOnWriteArrayList<Integer>();
		Thread t1=new Thread(new Producer(copyOnWriteArrayList));
		Thread t2=new Thread(new Consumer(copyOnWriteArrayList));
		t1.start();
		t2.start();
		
		
	}
}

