package com.anonymusexample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread 
{
	public static void main(String[] args)
	{
		Thread t=new Thread() {
			@Override
			public void run() 
			{
				System.out.println("thead by using run method.");
			}
		};
		t.start();
		
		Runnable r=new Runnable()
		{
			@Override
			public void run() 
			{
				System.out.println("thread by using Runnable interface.");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		
		Callable c=new Callable()
		{
			@Override
			public Object call() throws Exception 
			{
				System.out.println("callable thread is running.");
				return null;
			}
		};
		ExecutorService exService=Executors.newFixedThreadPool(1);
		exService.submit(c);
	}
}
