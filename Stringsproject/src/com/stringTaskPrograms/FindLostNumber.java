package com.stringTaskPrograms;

public class FindLostNumber 
{
	public static void main(String[] args) 
	{
		String str="1 5 3 4 8 ";
		FindLostNumber.findLostCount(str);
	}
	public static void findLostCount(String str) 
	{		
		int count=str.split(" ").length-1;
		if(str.indexOf(Integer.toString(count))!=-1)
			System.out.println("Number of elements:"+count);
		else 
			System.out.println(-1);
		}
}
