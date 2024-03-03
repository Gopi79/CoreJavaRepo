package com.methodreference;

public class MyThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chaild Thread");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Parent Thread");
			Thread.sleep(2000);
		}
	}
}