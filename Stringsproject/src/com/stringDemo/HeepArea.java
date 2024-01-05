package com.stringDemo;

public class HeepArea 
{
	public static void main(String[] args) 
	{
		String s1= new String("gopi");
		String s2 = new String("gopi");
		if(s1==s2)
			System.out.println("Both references pointed to same object");
		else 
			System.out.println("Both references not pointed to same object");
	}
}
