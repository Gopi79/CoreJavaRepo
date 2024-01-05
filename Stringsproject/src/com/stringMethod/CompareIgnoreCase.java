package com.stringMethod;

public class CompareIgnoreCase 
{
	public static void main(String[] args) 
	{
		String s1 ="Gopi";
		String s2 ="Gopi";
		String s3 ="GOPI";
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
	}
}
