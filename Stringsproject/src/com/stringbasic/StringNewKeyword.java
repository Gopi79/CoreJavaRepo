package com.stringbasic;


public class StringNewKeyword 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2=new String("Hello");
		if(s1.equals(s2)) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
