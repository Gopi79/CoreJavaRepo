package com.constructoroverloading;

public class Product 
{
	int pid;
	String pname;
	double price;
	
	public Product(int pid)
	{
		this.pid = pid;
	}
	
	public Product(int pid, String pname)
	{
		this.pid = pid;
		this.pname = pname;
	}

	public Product(int pid, String pname, double price)
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
}
