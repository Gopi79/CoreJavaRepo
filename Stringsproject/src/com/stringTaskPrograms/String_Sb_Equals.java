package com.stringTaskPrograms;

public class String_Sb_Equals 
{
	public static void main(String[] args) 
	{
		String s1 = "gopi";
		String s2 = "gopi";
	    System.out.println(s1.equals(s2));
	    StringBuffer sb1 = new StringBuffer("gopi");
		StringBuffer sb2 = new StringBuffer("gopi");
		System.out.println(sb1.equals(sb2));
		System.out.println((sb1.toString()).equals(sb2.toString()));
	    System.out.println(s1.equals(sb1));
	    System.out.println(s1.equals(sb1.toString()));
	}
}
