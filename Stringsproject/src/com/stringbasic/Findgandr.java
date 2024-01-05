package com.stringbasic;

public class Findgandr 
{
	public static void main(String[] args) 
	{
		String str="java is a programming language";
		int count_g=0;
		int count_r=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='g')
				count_g+=1;
			if(ch=='r')
				count_r+=1;
		}
		System.out.println("g's count:"+count_g);
		System.out.println("r's count:"+count_r);
	}
}
