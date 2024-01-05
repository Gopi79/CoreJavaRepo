package com.stringsusingmethods;

public class SwapStrings
{
    public static void main(String[] args) 
    {
        String s = "java";
        String t = "programs";
        SwapStrings.swapStrings(s, t);
    }
    static void swapStrings(String s, String t) 
    {
        String temp = s;
        s = t;
        t = temp;
        System.out.println("s: " + s);
        System.out.println("t: " + t);
    }
}

