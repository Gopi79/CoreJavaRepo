package com.sleepexamples;

public class Rthread implements Runnable
{
	@Override
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			System.out.println("Running thread : "+Thread.currentThread().getName());
			
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
				Thread.sleep(1000, 500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			i++;
		}
	}
}
