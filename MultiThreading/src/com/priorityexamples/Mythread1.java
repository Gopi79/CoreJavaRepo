package com.priorityexamples;

public class Mythread1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Running thread : "+Thread.currentThread().getName());
		}
	}
}
