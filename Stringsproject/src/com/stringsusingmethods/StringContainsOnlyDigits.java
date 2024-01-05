package com.stringsusingmethods;

public class StringContainsOnlyDigits
{
    public static void main(String[] args)
    {
        String str = "1234";
        if (StringContainsOnlyDigits.containsOnlyDigits(str))
            System.out.println("String contains Digits");
        else
            System.out.println("String contains letters, not Digits");
    }
    static boolean containsOnlyDigits(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9')
                return false;
        }
        return true;
    }
}

