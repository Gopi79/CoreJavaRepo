package com.stringTaskPrograms;

public class ReverseWord 
{
	public static void main(String[] args) 
	{
		String str ="GOPI";
		String string ="";
		System.out.println("Original Word:"+str);
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);	
			string =ch+string;	
		}
		System.out.println("Reversed Word:"+string);
	}
}
