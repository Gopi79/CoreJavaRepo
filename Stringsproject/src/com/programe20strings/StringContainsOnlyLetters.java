package com.programe20strings;

public class StringContainsOnlyLetters 
{
	public static void main(String[] args) 
	{
		String str="Helloworld";
		int y=0;
		while(y<str.length())
		{
			char ch=str.charAt(y);
			if((ch<'A'||ch>'Z')&&(ch<'a'||ch>'z'))
				break;
			y++;
		}
		if(y==str.length())
			System.out.println("String contains latters");
		else
			System.out.println("String not contains latters");
	}
}
