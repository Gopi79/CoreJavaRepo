package com.stringsusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateCharacters 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter String");
        String str = br.readLine();
        String duplicateChars = FindDuplicateCharacters.findDuplicateCharacters(str);
        System.out.println("Duplicate characters: " + duplicateChars);
    }
    static String findDuplicateCharacters(String str)
    {
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < str.length(); x++) 
        {
            char ch = str.charAt(x);
            boolean isDuplicate = false;
            for (int y = x + 1; y < str.length(); y++)
            {
                char chr = str.charAt(y);
                if (ch == chr) 
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && result.indexOf(Character.toString(ch)) == -1)
            {
                result.append(ch).append(" ");
            }
        }
        return result.toString();
    }
}

