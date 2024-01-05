package com.stringsusingmethods;

public class CountNumberOfWordsInString 
{
    public static void main(String[] args) 
    {
        String str = "Java is a programming language.";
        int wordCount = CountNumberOfWordsInString.countWords(str);
        System.out.println("Number of words: " + wordCount);
    }
    static int countWords(String input) 
    {
        input = input.trim();
        String[] words = input.split(" ");
        return words.length;
    }
}

