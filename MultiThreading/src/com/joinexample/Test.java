package com.joinexample;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread.mt=Thread.currentThread();
		
		Thread.currentThread().setName("Parent Thread");
		
		MyThread mt=new MyThread();
		mt.setName("Child Thread");
		mt.start();
//		mt.join();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Parent thead is Executed : "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
	}
}
