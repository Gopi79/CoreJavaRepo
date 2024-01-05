package com.stringTaskPrograms;

public class RemoveGivenWordFromString 
{
	public static void main(String[] args) 
	{
		String str ="My name is abc gopi krishna";
		str =str.replaceAll("is","");
		str=str.trim();
		System.out.println(str);
	}
}
