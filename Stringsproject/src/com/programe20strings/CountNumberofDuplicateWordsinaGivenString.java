package com.programe20strings;

public class CountNumberofDuplicateWordsinaGivenString 
{
	    public static void main(String[] args) 
	    {
	        String input = "Hello World Hello Java World World";
	        String[] words = input.split(" ");
	        int length = words.length;
	        boolean[] counted = new boolean[length];
	        int duplicateCount = 0;
	        for (int i = 0; i < length; i++) 
	        {
	            if (counted[i]) 
	            {
	                continue;
	            }
	            int count = 1;
	            for (int j = i + 1; j < length; j++) 
	            {
	                if (words[i].equals(words[j])) 
	                {
	                    count++;
	                    counted[j] = true;
	                }
	            }
	            if (count > 1) 
	            {
	                System.out.println("'" + words[i] + "' appears " + count + " times.");
	                duplicateCount++;
	            }
	        }
	        System.out.println("Total duplicate words: " + duplicateCount);
	    }
}
