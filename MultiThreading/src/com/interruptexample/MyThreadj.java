package com.interruptexample;

public class MyThreadj extends Thread
{
	static Thread mj;
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread executed : "+Thread.currentThread().getName());
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				System.out.println("I got Interrupted. by sleep.");
			}
			try
			{
				mj.join();
			}
			catch (InterruptedException e)
			{
				System.out.println("I got Interrupted. by join");
			}
		}
	}
}
