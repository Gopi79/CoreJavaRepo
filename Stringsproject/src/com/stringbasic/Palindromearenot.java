package com.stringbasic;

public class Palindromearenot 
{
	public static void main(String[] args) 
	{
		String str="reviver";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		if(str.equals(temp))
			System.out.println("str is palindrome");
		else
			System.out.println("str is not palindrome");
	}
}
