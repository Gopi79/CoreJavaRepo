package com.stringbasic;

public class Findgandrs 
{
	public static void main(String[] args) 
	{
		String str="java is a programming language";
		char [] ch=str.toCharArray();
		int g_count=0;
		int r_count=0;
		for(int  i=0;i<ch.length;i++)
		{
			if(ch[i]=='g')
				g_count+=1;
			if(ch[i]=='r')
				r_count+=1;
		}
		System.out.println("g's count is:"+g_count);
		System.out.println("r's count is:"+r_count);
	}
}
