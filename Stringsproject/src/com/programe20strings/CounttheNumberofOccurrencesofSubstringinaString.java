package com.programe20strings;

public class CounttheNumberofOccurrencesofSubstringinaString 
{
	    public static void main(String[] args) 
	    {
	        String input = "Hello, Hello, World! Hello";
	        String substring = "Hello";
	        int count = 0;
	        int inputLength = input.length();
	        int substringLength = substring.length();
	        for (int i = 0; i <= inputLength - substringLength; i++) {
	            boolean isMatch = true;
	            for (int j = 0; j < substringLength; j++)
	            {
	                if (input.charAt(i + j) != substring.charAt(j))
	                {
	                    isMatch = false;
	                    break;
	                }
	            }
	            if (isMatch) 
	            {
	                count++;
	            }
	        }
	        System.out.println("Occurrences of '" + substring + "': " + count);
	    }
}
