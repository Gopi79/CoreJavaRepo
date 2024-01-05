package com.yieldexamples;

public class Rthread implements Runnable
{
	@Override
	public void run()
	{
		int i=1;
		while (i<=5)
		{
			System.out.println("Running thread : "+Thread.currentThread().getName());
			
			Thread.yield();
			
			i++;
		}
	}
}
