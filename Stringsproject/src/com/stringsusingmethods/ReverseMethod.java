package com.stringsusingmethods;

public class ReverseMethod
{
    public static void main(String[] args)
    {
        String originalString = "vtalent";
        ReverseMethod rm=new ReverseMethod();
        String reversedString = rm.reverseString(originalString);
        System.out.println(reversedString);
    }
    String reverseString(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
}

