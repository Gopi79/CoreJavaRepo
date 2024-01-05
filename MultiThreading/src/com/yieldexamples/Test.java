package com.yieldexamples;

public class Test 
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		mt.setName("main");
		mt.start();
		
		Thread t=new Thread(mt);
		t.setName("thead-1");
		t.setPriority(4);
		t.start();
		
		Thread t1=new Thread(mt);
		t1.setName("thead-2");
		t1.setPriority(7);
		t1.start();
		
	}
}
