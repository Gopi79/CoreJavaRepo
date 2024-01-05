package com.filebasic;

import java.io.File;

public class ListDirectoryContents
{
	public static void main(String[] args)
	{
		String directoryPath = "D:\\PersonalJavafolder";
		File directory = new File(directoryPath);
		if (directory.exists() && directory.isDirectory())
			listContents(directory);
		else
			System.out.println("The specified path is not a valid directory.");
	}
	public static void listContents(File directory)
	{
		File[] files = directory.listFiles();
		if (files != null)
		{
			for (File file : files)
			{
				if (file.isFile())
					System.out.println("File: " + file.getName());
				else if (file.isDirectory())
					System.out.println("Directory: " + file.getName());
			}
		}
	}
}
