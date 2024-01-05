package com.filebasic;

import java.io.File;
import java.io.IOException;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("example.txt");
		boolean status = f.createNewFile();
		System.out.println(status);
	}
}
