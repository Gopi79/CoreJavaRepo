package com.example;

public class ICICI implements Bank {

	@Override
	public void moneyTransfer()
	{
		System.out.println("Money Transfer from ICICI");
	}

	@Override
	public void checkBalence()
	{
		System.out.println("Checking Balance from ICICI");
	}

}
