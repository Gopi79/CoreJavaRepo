package com.strings;

public class WordCount1 
{
	public static void main(String[] args) 
	{
		String s="  hello hi  java  ";
		String [] sarr=s.trim().split("\\s+");
		
		System.out.println(sarr.length);
	}
}
