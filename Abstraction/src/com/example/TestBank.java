package com.example;

public class TestBank 
{
	public static void main(String[] args)
	{
		Bank b;
		b=new ICICI();
		b.checkBalence();
		b.moneyTransfer();
		b=new HDFC();
		b.checkBalence();
		b.moneyTransfer();
	}
}
