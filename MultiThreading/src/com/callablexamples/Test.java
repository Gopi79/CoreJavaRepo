package com.callablexamples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		MyThread mt=new MyThread();
		ExecutorService  exService=Executors.newFixedThreadPool(10);
		//exService.submit(mt);
		
		for(int i=1;i<=100;i++)
		{
			Future submit=exService.submit(mt);
			System.out.println(submit.get().toString());
		}
		
		exService.shutdown();
	}
}
