package com.programe20strings;

public class CountNumberofWordsinString 
{
	public static void main(String[] args) 
	{
        String str = "Java is a programming language.";
        str = str.trim();
        String[] strarr = str.split(" ");
        System.out.println("Number of words: " +strarr.length);
    }
}