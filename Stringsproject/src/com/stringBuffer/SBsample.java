package com.stringBuffer;

public class SBsample 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" hi");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Java");
		System.out.println(sb1.reverse());
		
		String str="gopi";
		str.concat(" hi");
		System.out.println(str);
	}
}
