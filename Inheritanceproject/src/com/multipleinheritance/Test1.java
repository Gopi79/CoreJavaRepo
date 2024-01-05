package com.multipleinheritance;

public class Test1 implements User1, User2 
{
	@Override
	public void read()
	{
		System.out.println("Read");
	}
	@Override
	public void write()
	{
		System.out.println("Write");
	}
	@Override
	public void execute() {
		System.out.println("Execute");
	}

}
