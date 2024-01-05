package com.stringTaskPrograms;

public class UpperCaseCharToEndOfString 
{
	public static void main(String[] args) 
	{
		String str = "Welcome to Hyderbad";
		System.out.println("Before Operation: " + str);
		System.out.println("After Operation: " + move(str));
	}
	public static String move(String str) {
		int length = str.length();
		String low = "";
		String upr = "";
		char ch;
		for (int i = 0; i < length; i++) {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') 
				upr += ch;
			else 
				low += ch;
		}
		return low + upr;
	}
}
