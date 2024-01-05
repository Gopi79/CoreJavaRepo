package com.stringDemo;

public class Primitive_String 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		System.out.println(x==y);
		if (x==y)
			System.out.println("Both references pointed to same object");
		else 
			System.out.println("Both references not pointed to same object");
	}
}
