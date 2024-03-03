package com.functinalinter;

public class ThreadDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * Runnable r=new MyRunnable(); Thread t=new Thread(r); t.start(); for(int
		 * x=0;x<10;x++) { System.out.println("Parent Thread"); t.sleep(3000); }
		 */
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++)
		{
			System.out.println("Parent Thread");
			t.sleep(3000);
		}
	}
}
