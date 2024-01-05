package com.joinexample;

public class MyThread extends Thread
{
	static Thread mt;
	
	@Override
	public void run()
	{
		try
		{
			mt.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread is executed : "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
