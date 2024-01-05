package com.daemonexamples;

public class Demo implements Runnable
{

	@Override
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread executed.");
		}
		else
		{
			System.out.println("Normal thread executed.");
		}
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		
		Thread t1=new Thread(d);
		t1.setDaemon(true);
		t1.start();
	}
}
