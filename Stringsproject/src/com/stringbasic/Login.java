package com.stringbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Username");
		String Username=new String(br.readLine());
		System.out.println("Enter Password");
		String Password=new String(br.readLine());
		String user= new String("gopikrishna");
		String pass=new String("1234");
		if(Username.equals(user)&&Password.equals(pass))
			System.out.println("Login Successful");
		else
			System.out.println("Invalid Username&Password");
	}
}
