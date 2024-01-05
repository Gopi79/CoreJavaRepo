package com.sleepexamples;

public class Test 
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		mt.setName("main");
		mt.setPriority(5);
		mt.start();
		
		Thread t=new Thread(mt);
		t.setName("thead-1");
		t.setPriority(7);
		t.start();
		
		Thread t1=new Thread(mt);
		t1.setName("thead-2");
		t1.setPriority(4);
		t1.start();
		
		Thread t2=new Thread(mt);
		t2.setName("thead-3");
		t2.setPriority(5);
		t2.start();
	}
}
