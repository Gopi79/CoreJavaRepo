package com.stringTaskPrograms;

public class StringToFloatDemo 
{
	public static void main(String[] args)
	{
		String s1 ="";
		String s2 = null;
		String s3 ="Navya";
		convertsStringToFloat(s1);
		convertsStringToFloat(s2);
		convertsStringToFloat(s3);
	}
	public static void convertsStringToFloat(String str) 
	{
        try 
        {
        	float floatValue=Float.parseFloat(str);
        	System.out.println(str+"after converting into float="+" "+floatValue);
	    }
        catch(Exception e) 
        {
        	System.out.println(str+"cannot be converted to float"+e.getMessage());	
        }
	}
}
