package com.assignments;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintwriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw = new PrintWriter("f1.txt");
		pw.write("this is my f1 file data");
		pw.flush();
		pw.close();
	}
}
