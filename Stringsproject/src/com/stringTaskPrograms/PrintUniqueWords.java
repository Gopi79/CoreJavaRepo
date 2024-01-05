package com.stringTaskPrograms;

public class PrintUniqueWords 
{
	public static void main(String[] args)
	{
		String str ="gopi krishna";
		printUniqueWords(str);
	}
	public static void printUniqueWords(String str) 
	{		
		int count;
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			count =0;
			for(int j=i+1;j<words.length;j++) 
			{
				if (words[i].equalsIgnoreCase(words[j]))
				{
					count++;   
		            words[j] += ""; 
				}
			}
			if (count == 0 && words[i] != "")
				System.out.println(words[i]);
		}
	}
}
