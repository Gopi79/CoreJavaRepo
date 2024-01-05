package com.programe20strings;

public class MergeTwoStringArrays 
{
	public static void main(String[] args)
	{
		String [] str= {"hi","hello"};
		String [] str1= {"java","strings"};
		String [] mergarr=new String[str.length+str1.length];
		for(int i=0;i<str.length;i++)
		{
			mergarr[i]=str[i];
		}
		for(int j=0;j<str1.length;j++)
		{
			mergarr[str.length+j]=str1[j];
		}
		System.out.println("MergedTwoStringArrays");
		for(int x=0;x<mergarr.length;x++)
		{
			System.out.print(mergarr[x]+" ");
		}
	}
}
