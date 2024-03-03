package com.anonymous;

public class Driver 
{
	public static void main(String[] args) throws InterruptedException 
	{
		new Thread(()->{
			for(int x=0;x<10;x++)
			{
				System.out.println("Child 1 Thread");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(()->{
			for(int x=0;x<10;x++)
			{
				System.out.println("Child 2 Thread");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}).start();
		
		for(int y=0;y<10;y++)
		{
			System.out.println("Parent Thread");
			Thread.sleep(3000);
		}
	}
}