package com.stringsusingmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Username");
        String username = br.readLine();
        System.out.println("Enter Password");
        String password = br.readLine();
        if (Login.isLoginValid(username, password))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Username & Password");
    }
    static boolean isLoginValid(String username, String password)
    {
        String expectedUsername = "gopikrishna";
        String expectedPassword = "1234";
        return username.equals(expectedUsername) && password.equals(expectedPassword);
    }
}

