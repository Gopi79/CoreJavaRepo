package com.multipleinheritance;

public class Puffins extends Bird implements Swim, Flyable
{
	public void walk()
	{
		System.out.println("Walk.");
	}
	public static void main(String[] args)
	{
		System.out.println("Puffins");
		Puffins puf=new Puffins();
		puf.fly();
		puf.swimming();
		puf.walk();
	}
}
