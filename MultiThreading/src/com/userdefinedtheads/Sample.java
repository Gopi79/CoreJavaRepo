package com.userdefinedtheads;

public class Sample extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Present Running Service : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		Sample s=new Sample();
		
		Thread t=new Thread(s);
		t.setName("AWS Service");
		t.start();
		
		Thread t1=new Thread(s);
		t1.setName("IBM Cloud Service");
		t1.start();
		
		Thread t2=new Thread(s);
		t2.setName("GCP Service");
		t2.start();
		
		Thread t3=new Thread(s);
		t3.setName("Azure Service");
		t3.start();
		
		Thread t4=new Thread(s);
		t4.setName("Alibaba Service");
		t4.start();
	}
}
