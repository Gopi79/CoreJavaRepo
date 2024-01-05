package com.userdefinedtheads;

public class Example extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" is Running.");
		}
		catch(Exception e)
		{
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args)
	{
		int n=8;
		for(int i=1;i<=n;i++)
		{
			Example e=new Example();
			Thread t=new Thread(e);
			t.start();
		}
	}
}
