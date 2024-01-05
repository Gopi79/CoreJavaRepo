package com.joinexample;

public class Testr {
	public static void main(String[] args) throws InterruptedException 
	{
		Mythreadr.mt = Thread.currentThread();

		Thread.currentThread().setName("Parent Thread");
		
		Mythreadr mt = new Mythreadr();
		
		Thread t=new Thread(mt);
		t.setName("Child Thread");
		t.start();
//		mt.join();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Parent thead is Executed : " + Thread.currentThread().getName());
			Thread.sleep(2000);
		}
	}
}
