package com.multipleinheritance;

public class Bird implements Flyable, Swim
{
	@Override
	public void swimming()
	{
		System.out.println("Swimable");
	}
	@Override
	public void fly()
	{
		System.out.println("Flyable");
	}

}
