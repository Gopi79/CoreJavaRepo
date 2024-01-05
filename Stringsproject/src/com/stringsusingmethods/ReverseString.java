package com.stringsusingmethods;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "srinivas";
        String reversedStr = ReverseString.reverseString(str);
        System.out.println(reversedStr);
    }
    static String reverseString(String str)
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

