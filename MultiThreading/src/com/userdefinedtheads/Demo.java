package com.userdefinedtheads;

public class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("running threads are : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		Demo d=new Demo();
		
		Thread t=new Thread(d);
		t.start();
		
		Thread t1=new Thread(d);
		t1.start();
		
		Thread t2=new Thread(d);
		t2.start();
		
		Thread t3=new Thread(d);
		t3.start();
	}
}
