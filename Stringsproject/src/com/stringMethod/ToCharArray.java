package com.stringMethod;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		String str ="JavaTech";
		char arr[] =str.toCharArray();
		for(char Char:arr) 
		{
			System.out.print(Char+" ");
		}
	}
}
