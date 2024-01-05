package com.filebasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferreder
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			
			line=br.readLine();
		}
	}
}
