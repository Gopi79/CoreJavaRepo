package com.callablexamples;

import java.util.concurrent.Callable;

public class MyThread implements Callable
{

	@Override
	public  Object call() throws Exception {
		System.out.println("this logic is created by child thread : "+Thread.currentThread().getName());
		String str="Thread Execution completed Successfully";
		return str;
	}
	
}
