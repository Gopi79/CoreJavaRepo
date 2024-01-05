package com.programe20strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateCharacters {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter String");
		String str=br.readLine();
		for(int x=0;x<str.length();x++)
		{
			char ch=str.charAt(x);
			int count=0;
			for(int y=0;y<x;y++)
			{
				char chr=str.charAt(y);
				if(ch==chr)
					count+=1;
			}
			if(count>0)
				System.out.print(ch+" ");
		}
	}
}
