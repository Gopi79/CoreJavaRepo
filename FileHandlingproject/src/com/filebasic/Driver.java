package com.filebasic;

import java.io.File;

public class Driver 
{
	public static void main(String[] args)
	{
		File f=new File("D:\\PersonalJavafolder");
		String[] arr = f.list();
		for(String name:arr)
		{
			System.out.println(name);
		}
	}
}
