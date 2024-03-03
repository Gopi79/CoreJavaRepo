package com.methodreference;

public class Test 
{
	public static void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
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
	public static void main(String[] args) throws InterruptedException
	{
		Runnable r=Test::m1;
		Thread t=new Thread(r);
		//Thread t1=new Thread(r);
		t.start();
		//t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Parent Thread");
			Thread.sleep(2000);
		}
		
	}
}