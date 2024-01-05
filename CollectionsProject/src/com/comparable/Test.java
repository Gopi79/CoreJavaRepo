package com.comparable;

public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("A".compareTo("Z")); // -ve
		System.out.println("Z".compareTo("K")); // +ve
		System.out.println("A".compareTo("A")); // 0 zero
		
		/*
		 * System.out.println("A".compareTo(new Integer(10))); // Exception or Error
		 */	
		
		/*
		 * System.out.println("A".compareTo(null)); //NullPointerException
		 */	
	}
}
