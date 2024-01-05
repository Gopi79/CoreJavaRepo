package com.programe20strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateWords 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the String:");
		String str=br.readLine();
		String [] st=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
					System.out.print(st[i]+" ");
			}
		}
	}
}
