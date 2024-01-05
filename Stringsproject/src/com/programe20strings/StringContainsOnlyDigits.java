package com.programe20strings;

public class StringContainsOnlyDigits 
{
	public static void main(String[] args) 
	{
		String str="143a";
		int y=0;
		while(y<str.length())
		{
			char ch=str.charAt(y);
			if((ch<'0'||ch>'9'))
				break;
			y++;
		}
		if(y==str.length())
			System.out.println("String contains Digits");
		else
			System.out.println("String contains latters not Digits");
	}
}
