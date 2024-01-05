package com.sleepexamples;

public class SleepDemo implements Runnable 
{
	@Override
	public void run() 
	{
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+" "+i);
			 try 
			 {
				Thread.sleep(1000);
			 }
			 catch(InterruptedException e)
			 {
				e.printStackTrace();
			 }
		 }
	}
	public static void main(String[] args)
	{
		SleepDemo sd=new SleepDemo();
		
		Thread t=new Thread(sd);
		t.setName("thread-1");
		t.setPriority(6);
		t.start();
		
		Thread t1=new Thread(sd);
		t1.setName("thread-2");
		t1.setPriority(8);
		t1.start();
	}
}
