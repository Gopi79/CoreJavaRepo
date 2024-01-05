package com.oopsbasics;

public class Car
{
	void start()
	{
		class Starter extends Thread
		{
			public void run()
			{
				System.out.println("Starting...");
			}
		}
		new Starter().start();
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.start();
	}
}
