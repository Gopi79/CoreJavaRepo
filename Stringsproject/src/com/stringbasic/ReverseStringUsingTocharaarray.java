package com.stringbasic;

public class ReverseStringUsingTocharaarray 
{
	public static void main(String[] args)
	{
		String str="srinivas";
		char [] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reverse String is:"+rev);
	}
}
