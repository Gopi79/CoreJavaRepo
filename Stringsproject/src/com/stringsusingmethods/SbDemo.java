package com.stringsusingmethods;

public class SbDemo
{
    public static void main(String[] args)
    {
        String firstPart = "Welcome to ";
        String secondPart = "vtalent";
        StringBuffer result = SbDemo.concatenateStrings(firstPart, secondPart);
        System.out.println(result);
    }
    static StringBuffer concatenateStrings(String str1, String str2)
    {
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        return sb;
    }
}

