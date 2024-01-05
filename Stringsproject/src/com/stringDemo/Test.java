package com.stringDemo;

public class Test {
	public static void main(String[] args) 
	{
		String s1 = "gopi";
		String s2 = "krishna";
		String s3 = new String("gopi");
		s3 = null;
		if (s1 == s2) 
		{
			System.out.println("Both rferences poinetd to same object");

		} 
		else 
		{
			System.out.println("Both references not pointed to same object");
		}
	}
}
