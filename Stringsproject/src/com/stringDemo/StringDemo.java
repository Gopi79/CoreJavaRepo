package com.stringDemo;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String str = new String("gopi");
		String str1 = new String("gopi");
		System.out.println(str.hashCode() == str1.hashCode());
		String str2 = "gopi";
		String str3 = "krishna";
		System.out.println(str2 == str3);
	}
}
