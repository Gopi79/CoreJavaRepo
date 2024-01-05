package com.example;

public class HDFC implements Bank 
{
	@Override
	public void moneyTransfer()
	{
		System.out.println("Money Transfer form HDFC");
	}
	@Override
	public void checkBalence()
	{
		System.out.println("Checking Balance from HDFC");
	}
}
