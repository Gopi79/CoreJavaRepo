package com.constructoroverloading;

public class Details
{
	int id;
	String name;
	String company;
	int sal;
	String loc;
	
	public Details(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public Details(int id, String name, String company, int sal, String loc)
	{
		this.id = id;
		this.name = name;
		this.company = company;
		this.sal = sal;
		this.loc = loc;
	}
}
