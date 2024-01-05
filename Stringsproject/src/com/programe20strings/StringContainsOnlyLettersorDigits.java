package com.programe20strings;

public class StringContainsOnlyLettersorDigits 
{
	public static void main(String[] args) 
	{
		String str="Helloworld#1232";
		int y=0;
		while(y<str.length())
		{
			char ch=str.charAt(y);
			if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')))
				break;
			y++;
		}
		if(y==str.length())
			System.out.println("String contains latters and Digits");
		else
			System.out.println("String not contains latters and Digits");
	}
}
