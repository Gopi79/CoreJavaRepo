package com.stringsusingmethods;

public class StringContainsOnlyLetters
{
    public static void main(String[] args)
    {
        String str = "Helloworld";
        if (StringContainsOnlyLetters.containsOnlyLetters(str))
            System.out.println("String contains letters");
        else
            System.out.println("String does not contain letters");
    }
    static boolean containsOnlyLetters(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')))
                return false;
        }
        return true;
    }
}
