package com.stringMethod;

public class InternMethod 
{
	public static void main(String[] args) 
	{
		String str ="gopikrishna";
		String str1 =str.intern();
		System.out.println(str==str1);
		String str2=str;
		System.out.println(str==str2);
	}
}
