package com.stringTaskPrograms;

public class PrintQuotationMarks 
{
	public static void main(String[] args) 
	{
		String str ="\"gopi krishna\"";
		System.out.println(str);
        char value ='"';
        String str1 =value+"gopi krishna"+value;
        System.out.println(str1);
        String str2 ='\u0022'+"gopi krishna"+'\u0022';
        System.out.println(str2);
	}
}
