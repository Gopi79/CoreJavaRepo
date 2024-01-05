package com.filebasic;

import java.io.File;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException
	{
		//File creation
		File f=new File("sample.txt");
		boolean status1 = f.createNewFile();
		System.out.println(status1);
		
		File nf=new File("demo.csv");
		boolean status2 = nf.createNewFile();
		System.out.println(status2);
		
		//Directory creation
		File f2=new File("Data");
		boolean status3 = f2.mkdir();
		System.out.println(status3);
		
		//inside Directory file will be created.
		File fd=new File("mywork");
		fd.mkdir();
		
		File fdf=new File(fd,"test.txt");
		boolean status4 = fdf.createNewFile();
		System.out.println(status4);
	}
}
