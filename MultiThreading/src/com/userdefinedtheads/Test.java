package com.userdefinedtheads;

public class Test implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Running Theads are : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		Test t=new Test();
		
		Thread t1=new Thread(t);
		t1.start();
		
		Thread t2=new Thread(t);
		t2.start();
		
		Thread t3=new Thread(t);
		t3.start();
		
		Thread t4=new Thread(t);
		t4.start();
	}
}
