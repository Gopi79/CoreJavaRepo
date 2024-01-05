package com.stringTaskPrograms;

public class StringToByteArray 
{
	public static void main(String[] args) 
	{
		String str = "gopikrishna";
		byte[] byteArray=str.getBytes();
		for(int i=0;i<byteArray.length;i++)
		{
			System.out.print(byteArray[i]+" ");
		}
	}
}
