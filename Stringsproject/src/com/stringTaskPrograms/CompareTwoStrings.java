package com.stringTaskPrograms;

public class CompareTwoStrings 
{
	public static void main(String[] args) 
	{
		String s1 = "Gopi";
		String s2 ="Krishna";
		String s3 ="Gopi";
		String s4="gopi";
		String s5=new String("Gopi");
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));		
		System.out.println(s1==s3); 
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s4));
	}
}
