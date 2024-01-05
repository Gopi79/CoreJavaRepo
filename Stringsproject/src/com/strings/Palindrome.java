package com.strings;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String s="madam";
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp+=s.charAt(i);
		}
		if(temp.equals(s))
			System.out.println("palindrom");
		else
			System.out.println("Not Palindrom");
	}
}
