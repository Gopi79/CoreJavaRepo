package com.blocklevel;

public class Classlock implements Runnable
{
	@Override
	public void run() 
	{
		lock();
	}
	
	public void lock()
	{
		System.out.println(Thread.currentThread().getName());
		
		synchronized (Classlock.class)
		{
			System.out.println("in block : "+Thread.currentThread().getName()+" in block : "+Thread.currentThread().getName()+" end");
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		Classlock cl1=new Classlock();
		Thread t1=new Thread(cl1);
		Thread t2=new Thread(cl1);
		
		Classlock cl2=new Classlock();
		Thread t3=new Thread(cl2);
		
		t1.setName("T-1");
		t2.setName("T-2");
		t3.setName("T-3");
		
		t1.start();
		t2.start();
		t3.start();
	}	
}
