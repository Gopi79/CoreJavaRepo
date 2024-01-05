package com.yieldexamples;

public class YieldDemo implements Runnable 
{
	@Override
	public void run()
	{
		int i=1;
		while (i<=5)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.yield();
			i++;
		}
	}
	public static void main(String[] args) 
	{
		YieldDemo yd=new YieldDemo();
		
		Thread t=new Thread(yd);
		t.setName("thread-1");
		t.setPriority(7);
		t.start();
		
		Thread t1=new Thread(yd);
		t1.setName("thread-2");
		t1.setPriority(4);
		t1.start();
	}

}
