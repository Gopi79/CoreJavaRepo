package com.programe20strings;

public class CountVowelsandConsonantsinaString 
{
	    public static void main(String[] args) 
	    {
	        String input = "Hello World";
	        int vowelCount = 0;
	        int consonantCount = 0;
	        input = input.toLowerCase();
	        int length = input.length();
	        for (int i = 0; i < length; i++) 
	        {
	            char ch = input.charAt(i);
	            if ((ch >= 'a' && ch <= 'z')) 
	            {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	                {
	                    vowelCount++;
	                } 
	                else 
	                {
	                    consonantCount++;
	                }
	            }
	        }
	        System.out.println("Vowel Count: " + vowelCount);
	        System.out.println("Consonant Count: " + consonantCount);
	    }
}
