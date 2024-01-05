package com.stringsusingmethods;

public class Findgandr 
{
    public static void main(String[] args) 
    {
        String str = "java is a programming language";
        int count_g = Findgandr.countCharacter(str, 'g');
        int count_r = Findgandr.countCharacter(str, 'r');
        System.out.println("g's count: " + count_g);
        System.out.println("r's count: " + count_r);
    }
    static int countCharacter(String str, char character) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch == character)
                count++;
        }
        return count;
    }
}
