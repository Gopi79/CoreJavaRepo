package com.priorityexamples;

public class Test1 
{
	public static void main(String[] args)
	{
		Mythread1 mt=new Mythread1();
		
		Thread t=new Thread(mt);
		t.setPriority(6);
		t.setName("thread-1");
		t.start();
		
		Thread t1=new Thread(mt);
		t1.setPriority(4);
		t1.setName("thread-2");
		t1.start();
		
		Thread t2=new Thread(mt);
		t2.setPriority(9);
		t2.setName("thread-3");
		t2.start();
	}
}
