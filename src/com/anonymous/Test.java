package com.anonymous;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int x=0;x<10;x++)
				{
					System.out.println("Child Thread");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		
		for(int x=0;x<10;x++)
		{
			System.out.println("Parent Thread");
			t.sleep(3000);
		}
	}
}