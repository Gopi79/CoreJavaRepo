package com.strings;

public class SBpalindrom 
{
	public static void main(String[] args) 
	{
		String s="DAD";
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		
		String str=sb.toString();
		if(s.equals(str))
			System.out.println("Palindrom");
		else
			System.out.println("Not-Palindrom");
	}
}
