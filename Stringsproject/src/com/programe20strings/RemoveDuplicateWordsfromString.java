package com.programe20strings;

public class RemoveDuplicateWordsfromString 
{
	public static void main(String[] args)
	{
		String str="hi java hi hello hi";
		String [] strarr=str.split(" ");
		String temp="";
		for(int i=0;i<strarr.length;i++)
		{
			if(!(strarr[i].isEmpty()))
			{
				temp+=strarr[i]+" ";
				for(int j=i+1;j<strarr.length;j++)
				{
					if(strarr[j].equals(strarr[i]))
						strarr[j]="";
				}
			}
		}
		temp=temp.trim();
		System.out.println("Original String: "+str);
		System.out.println("String with Douplicate words Removed: "+temp);
	}
}
