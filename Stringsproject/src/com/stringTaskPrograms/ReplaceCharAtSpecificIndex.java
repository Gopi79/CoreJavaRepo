package com.stringTaskPrograms;

public class ReplaceCharAtSpecificIndex 
{
	public static void main(String[] args) 
	{
		String str = "Wecome";
		int index = 2;
		char ch = 'l';
		System.out.println(str);
		str = str.substring(0, index) + ch + str.substring(index + 1);
		System.out.println(str);
	}
}
