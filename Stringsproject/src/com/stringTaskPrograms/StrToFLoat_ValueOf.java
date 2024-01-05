package com.stringTaskPrograms;

public class StrToFLoat_ValueOf 
{
	public static void main(String[] args)
	{
		String  stringValue ="15.0";
		float floatValue=convertStringToFloat(stringValue);
        System.out.println(stringValue+" "+"after converting into float="+floatValue);
	}
	public static Float convertStringToFloat(String str) 
	{		
			return Float.valueOf(str);		
	}
}
