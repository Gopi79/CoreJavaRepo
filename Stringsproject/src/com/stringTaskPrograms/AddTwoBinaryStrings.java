package com.stringTaskPrograms;

public class AddTwoBinaryStrings 
{
	public static void main(String[] args)
	{
		String str1 = "1011";
		String str2 = "11101";
		System.out.println(add_Binary(str1, str2));
	}
	public static String add_Binary(String str1, String str2) 
	{
		int num1 = Integer.parseInt(str1, 2);
		int num2 = Integer.parseInt(str2, 2);
		int sum = num1 + num2;
		System.out.println(sum);
		String Binary_Sum = Integer.toBinaryString(sum);
		return Binary_Sum;
	}
}
