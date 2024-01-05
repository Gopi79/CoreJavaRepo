package com.stringsusingmethods;

public class RemoveDuplicateWordsFromString
{
    public static void main(String[] args)
    {
        String str = "hi java hi hello hi";
        String result = RemoveDuplicateWordsFromString.removeDuplicateWords(str);
        System.out.println("Original String: " + str);
        System.out.println("String with Duplicate Words Removed: " + result);
    }
    static String removeDuplicateWords(String input)
    {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++)
        {
            if (!words[i].isEmpty())
            {
                result.append(words[i]).append(" ");
                for (int j = i + 1; j < words.length; j++)
                {
                    if (words[j].equals(words[i]))
                        words[j] = "";
                }
            }
        }
        return result.toString().trim();
    }
}

