package com.stringBuilder;

public class BuilderDemo 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		sb.append(" programs");
		System.out.println(sb);
	}
}
