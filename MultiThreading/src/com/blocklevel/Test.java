package com.blocklevel;

public class Test 
{
	public static void main(String[] args)
	{
		Display display=new Display();
		Display display1=new Display();
		
		MyThread mt=new MyThread(display,"john");
		MyThread mt1=new MyThread(display1,"Alex");
		mt.setName("thread-1");
		mt1.setName("thread-2");
		mt.start();
		mt1.start();
		
	}
}
