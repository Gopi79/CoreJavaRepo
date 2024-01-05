package com.userdefinedtheads;

public class Task implements Runnable
{

	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" is Running.");
		}
		catch (Exception e)
		{
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args)
	{
		int n=4;
		for(int x=1;x<=n;x++)
		{
			Task ts=new Task();
			Thread t=new Thread(ts);
			t.start();
		}
	}
}
