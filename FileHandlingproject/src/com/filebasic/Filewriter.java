package com.filebasic;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("data.txt");
		
		fw.write("Hi good Morring..!");
		
		fw.write("\n");
		
		fw.write("How are You.?");
		
		fw.flush();
		
		fw.close();
	}
}
