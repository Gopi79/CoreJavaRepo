package com.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge 
{
	public static void main(String[] args) throws IOException 
	{
		File inputFile1 = new File("A.txt");
		File inputFile2 = new File("B.txt");
		File outputFile = new File("MergeAB.txt");

		BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
		BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));

		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

		String line;
		while ((line = reader1.readLine()) != null)
		{
			writer.write(line);
			writer.newLine();
		}
		
		while ((line = reader2.readLine()) != null) 
		{
			writer.write(line);
			writer.newLine();
		}

		reader1.close();
		reader2.close();
		writer.close();

		System.out.println("Files merged successfully!");
	}
}
