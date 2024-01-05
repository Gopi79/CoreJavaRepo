package com.sleepexamples;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Running Thread : "+Thread.currentThread().getName());
			
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			try 
			{
				Thread.sleep(2000, 1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
