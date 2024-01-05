package com.interruptexample;

public class Mythreadr implements Runnable {

	@Override
	public void run()
	{
//		for(int i=1;i<=5;i++)
//			{
				System.out.println("Chiled thread executed : "+Thread.currentThread().getName());
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					System.out.println("I got Interrupted");
				}
//			}
	}

}
