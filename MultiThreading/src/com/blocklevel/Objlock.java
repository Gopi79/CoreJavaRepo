package com.blocklevel;

public class Objlock implements Runnable
{
	@Override
	public void run() 
	{
		lock();
	}
	
	public void lock()
	{
		System.out.println(Thread.currentThread().getName());
		
		synchronized (this)
		{
			System.out.println("in block : "+Thread.currentThread().getName()+" in block : "+Thread.currentThread().getName()+" end");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		Objlock objlock=new Objlock();
		Thread t1=new Thread(objlock);
		Thread t2=new Thread(objlock);
		
		Objlock objlock1=new Objlock();
		Thread t3=new Thread(objlock1);
		
		t1.setName("T-1");
		t2.setName("T-2");
		t3.setName("T-3");
		
		t1.start();
		t2.start();
		t3.start();
	}	
}