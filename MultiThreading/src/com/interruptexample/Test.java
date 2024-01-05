package com.interruptexample;

public class Test 
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setName("Parent");
		
		MyThread mt=new MyThread();
		mt.setName("Child");
		mt.start();
		
		mt.interrupt();
		
	}
}
