package com.yieldexamples;

public class Rtest 
{
	public static void main(String[] args)
	{
		Rthread rt=new Rthread();
		
		Thread t=new Thread(rt);
		t.setName("Thread-1");
		t.setPriority(7);
		t.start();
		
		Thread t1=new Thread(rt);
		t1.setName("Thread-2");
		t1.setPriority(3);
		t1.start();
				
	}
}
