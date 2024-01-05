package com.programe20strings;

public class CountOccurrencesofWordsinaString 
{
	    public static void main(String[] args) {
	        String input = "Hello world, hello Java world!";
	        int count = 0;
	        int length = input.length();
	        boolean inWord = false;
	        for (int i = 0; i < length; i++) 
	        {
	            char ch = input.charAt(i);
	            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
	            {
	                if (!inWord) 
	                {
	                    count++;
	                    inWord = true;
	                }
	            }
	            else 
	            {
	                inWord = false;
	            }
	        }
	        System.out.println("Word Count: " + count);
	    }
}
