package com.priorityexamples;

public class Test 
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		mt.setName("main");
		mt.start();
		
		Thread t=new Thread(mt);
		t.setName("thread-1");
		t.setPriority(4);
		t.start();
		
		Thread t1=new Thread(mt);
		t1.setName("thread-2");
		t1.setPriority(5);
		t1.start();
		
		Thread t2=new Thread(mt);
		t2.setName("thread-3");
		t2.setPriority(7);
		t2.start();
		
	}
}
