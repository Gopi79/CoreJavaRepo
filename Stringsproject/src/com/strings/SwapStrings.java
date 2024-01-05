package com.strings;

public class SwapStrings 
{
	public static void main(String[] args)
	{
		String s="java";
		String t="programs";
		
		s=s+t;
		
		t=s.substring(0,s.length()-t.length());
		s=s.substring(t.length());
		
		System.out.println(s);
		System.out.println(t);
	}
}
