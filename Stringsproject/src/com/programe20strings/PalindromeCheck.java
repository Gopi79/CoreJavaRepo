package com.programe20strings;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		String str="abcdcba";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		if(str.equals(temp))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");
	}
}
