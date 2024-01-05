package com.multipleinheritance;

public class Duck implements Swimmable, Walkable
{
	@Override
	public void walk()
	{
		System.out.println("Duck is walking.");
	}
	@Override
	public void swim()
	{
		System.out.println("Duck is swimming.");
	}
}
