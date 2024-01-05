package com.blocklevel;

public class Display 
{
	public void wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("non-syunc area : "+Thread.currentThread().getName());
		}
		synchronized (Display.class)
		{
			for (int i = 1; i <= 5; i++)
			{
				System.out.print("Good Morning : ");
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
	}
}
