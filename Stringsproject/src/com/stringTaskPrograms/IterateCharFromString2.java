package com.stringTaskPrograms;

public class IterateCharFromString2 
{
	public static void main(String[] args) 
	{
		String str ="VTALENT";
		 traverseString(str);
	}
	public static void traverseString(String str)
	{
		String[] stringArray = str.split("");
		for(String ch:stringArray)
		{
			System.out.print(ch+" ");
		}
	}
}
