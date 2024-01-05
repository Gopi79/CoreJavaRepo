package com.stringbasic;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str="srinivas";
		String [] ch=str.split("");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
