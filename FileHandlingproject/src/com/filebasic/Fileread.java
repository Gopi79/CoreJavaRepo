package com.filebasic;

import java.io.FileReader;
import java.io.IOException;

public class Fileread 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
	}
}
