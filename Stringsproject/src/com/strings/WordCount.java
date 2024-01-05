package com.strings;

public class WordCount 
{
	public static void main(String[] args) 
	{
		String s="hello hi   my    friend";
		String [] arr=s.split("\\s+");
		
		System.out.println(arr.length);
	}
}