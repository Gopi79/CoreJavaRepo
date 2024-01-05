package com.stringTaskPrograms;

public class IterateCharFromString 
{
	public static void main(String[] args) 
	{
		String str ="Vtalent";
		traverseString(str);
	}
	public static void traverseString(String str) 
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}
