package com.programe20strings;

public class SwapTwoStrings 
{
	public static void main(String[] args)
	{
		String str="hello";
		String str1="hi";
		
		System.out.println("Befoure Swaping Two Strings");
		System.out.println(str);
		System.out.println(str1);
		
		str=str+str1;
		str1=str.substring(0,str.length()-str1.length());
		str=str.substring(str1.length());
		
		System.out.println("After Swaping Two Strings");
		System.out.println(str);
		System.out.println(str1);
	}
}
