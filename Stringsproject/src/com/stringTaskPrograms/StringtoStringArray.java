package com.stringTaskPrograms;

public class StringtoStringArray
{
	public static void main(String[] args) 
	{
		String str ="Java Program";
		String[] strArray = str.split("");
	 	for(int i=0;i<strArray.length;i++) 
	 	{
			System.out.print(strArray[i]+" ");
		}
	}
}
