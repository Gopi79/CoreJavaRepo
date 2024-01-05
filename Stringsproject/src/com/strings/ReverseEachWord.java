package com.strings;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		String s="hello hi java";
		String [] sarr=s.split(" ");
		
		for(int i=0;i<sarr.length;i++)
		{
			String sa=sarr[i];
			StringBuffer sb=new StringBuffer(sa);
			sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
