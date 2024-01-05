package com.programe20strings;

public class ReverseEachWordOfAString 
{
	    public static void main(String[] args) 
	    {
	        String input = "Hello World Java";
	        char[] chars = input.toCharArray();
	        int length = chars.length;
	        int wordStart = 0;
	        for (int i = 0; i < length; i++) 
	        {
	            if (chars[i] == ' ')
	            {
	                reverseWord(chars, wordStart, i - 1);
	                wordStart = i + 1;
	            }
	            else if (i == length - 1) 
	            {
	                reverseWord(chars, wordStart, i);
	            }
	        }
	        String reversedString = new String(chars);
	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String: " + reversedString);
	    }
	    static void reverseWord(char[] chars, int start, int end) {
	        while (start < end) 
	        {
	            char temp = chars[start];
	            chars[start] = chars[end];
	            chars[end] = temp;
	            start++;
	            end--;
	        }
	    }
}
