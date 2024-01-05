package com.constructor;

public class Dogconstructor 
{
	public static void main(String[] args)
	{
		Dog d= new Dog("Charlie", "white", 35);
		System.out.println(d.dname+" "+d.colour+" "+d.weight);
	}
}
