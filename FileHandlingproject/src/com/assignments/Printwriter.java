package com.assignments;

import java.io.PrintWriter;

public class Printwriter 
{
	public static void main(String[] args)
	{
		PrintWriter pw=new PrintWriter(System.out);
		pw.print("hi");
		pw.println("hello");
		
		pw.flush();
		pw.close();
	}
}
