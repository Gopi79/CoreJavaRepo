package com.stringsusingmethods;

public class StringContainsOnlyLettersOrDigits {

    public static void main(String[] args) {
        String str = "Helloworld1232";
        if (StringContainsOnlyLettersOrDigits.containsOnlyLettersOrDigits(str))
            System.out.println("String contains letters and digits");
        else
            System.out.println("String does not contain letters and digits");
    }
    static boolean containsOnlyLettersOrDigits(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                return false;
        }
        return true;
    }
}

