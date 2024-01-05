package com.stringbasic;

public class Test 
{
	public static void main(String[] args) 
	{
		//String literals
		String str="hello";
		String str3="hello";
		
		//String class
		String str1=new String("hello");
		String str4=new String("hello");
		
		System.out.println(str==str3);
		System.out.println(str==str1);
		System.out.println(str1==str4);
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str));
	}
}
