package com.programe20strings;

public class CounttheOccurrencesofEachCharacter 
{
	    public static void main(String[] args) 
	    {
	        String input = "Hello, World!";
	        int[] charCounts = new int[256];
	        for (int i = 0; i < 256; i++) 
	        {
	            charCounts[i] = 0;
	        }
	        int inputLength = input.length();
	        for (int i = 0; i < inputLength; i++) 
	        {
	            char ch = input.charAt(i);
	            int charValue = (int) ch;
	            charCounts[charValue]++;
	        }
	        for (int i = 0; i < 256; i++) 
	        {
	            if (charCounts[i] > 0) 
	            {
	                char ch = (char) i;
	                System.out.println("'" + ch + "': " + charCounts[i]);
	            }
	        }
	    }
}
