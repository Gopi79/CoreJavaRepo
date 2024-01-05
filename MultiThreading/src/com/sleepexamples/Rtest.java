package com.sleepexamples;

public class Rtest 
{
	public static void main(String[] args)
	{
		Rthread rt=new Rthread();
		
		Thread t=new Thread(rt);
		t.setName("thread-1");
		t.setPriority(8);
		t.start();
		
		Thread t1=new Thread(rt);
		t1.setName("thread-2");
		t1.setPriority(4);
		t1.start();
		
		Thread t2=new Thread(rt);
		t2.setName("thread-3");
		t2.setPriority(5);
		t2.start();
	}
}
