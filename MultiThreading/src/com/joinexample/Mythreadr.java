package com.joinexample;

public class Mythreadr implements Runnable 
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
		
		for(int i=1;i<=5;i++)
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
