package com.stringTaskPrograms;

public class IterateCharFromString1 
{
	public static void main(String[] args) 
	{
		String str ="VTALENT";
		traverseString(str);
	}
	public static void traverseString(String str) 
	{
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]+" ");
		}
	}
}
