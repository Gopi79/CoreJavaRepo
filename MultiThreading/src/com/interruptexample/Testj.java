package com.interruptexample;

public class Testj 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThreadj.mj=Thread.currentThread();
		
		Thread.currentThread().setName("Parent");
		
		MyThreadj mj=new MyThreadj();
		mj.setName("Child");
		mj.start();
		mj.interrupt();
		try 
		{
			mj.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("I got Interrupted");
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent thead is Executed : "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}
