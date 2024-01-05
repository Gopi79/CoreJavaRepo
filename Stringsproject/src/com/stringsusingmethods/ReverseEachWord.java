package com.stringsusingmethods;

public class ReverseEachWord 
{
    public static void main(String[] args) 
    {
        String s = "hello hi java";
        String reversed = ReverseEachWord.reverseEachWord(s);
        System.out.println(reversed);
    }
    static String reverseEachWord(String input)
    {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord);
            if (i < words.length - 1)
                result.append(" ");
        }
        return result.toString();
    }
}

