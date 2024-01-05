package com.stringTaskPrograms;

public class FindFirst_LastChar 
{
	public static void main(String[] args) 
	{
		String str = "vtalent";
		firstAndLastCharacter(str);
	}
	public static void firstAndLastCharacter(String str) 
	{
		int n = str.length();
		char first = str.charAt(0);
		char last = str.charAt(n - 1);
		System.out.println("First Character: " + first);
		System.out.println("Last Character: " + last);
	}
}
