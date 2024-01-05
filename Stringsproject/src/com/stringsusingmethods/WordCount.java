package com.stringsusingmethods;

public class WordCount 
{
    public static void main(String[] args) 
    {
        String s = "hello hi   my    friend";
        WordCount wc=new WordCount();
        int wordCount = wc.countWords(s);
        System.out.println("Number of words: " + wordCount);
    }
    int countWords(String input)
    {
        String[] words = input.split("\\s+");
        return words.length;
    }
}

