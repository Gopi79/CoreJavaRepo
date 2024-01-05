package com.stringsusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateWords 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the String:");
        String str = br.readLine();
        String[] words = str.split(" ");
        findAndPrintDuplicateWords(words);
    }
    public static void findAndPrintDuplicateWords(String[] words)
    {
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {
                if (words[i].equals(words[j])) 
                {
                    System.out.print(words[i] + " ");
                    words[j] = "";
                }
            }
        }
    }
}

