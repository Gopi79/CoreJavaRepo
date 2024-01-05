package com.stringbasic;

public class ReverseString2 
{
	public static void main(String[] args) 
	{
		String str="srinivas";
		String revstr="";
		for(int x=str.length()-1;x>=0;x--)
		{
			revstr+=str.charAt(x);
		}
		System.out.println("Reverse String is:"+revstr);
	}
}
