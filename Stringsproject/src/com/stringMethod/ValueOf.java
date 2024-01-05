package com.stringMethod;

public class ValueOf 
{
	public static void main(String[] args) 
	{
		int x=10;
	    int y=20;
	    System.out.println(x+y);   
	    String s1="10";
	    String s2 ="20";
	    System.out.println(s1+s2);   
	    String str=String.valueOf(x)+String.valueOf(y);
	    System.out.println(str);
	}
}
