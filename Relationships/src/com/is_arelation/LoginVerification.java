package com.is_arelation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginVerification extends Login
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		Login li=new Login();
//		System.out.println("Enter Username:");
		li.setUserName(br.readLine());
//		System.out.println("Enter PassWord:");
		li.setPassWord(br.readLine());
		String user="ram";
		String pass="ram1234";
		if(user.equals(li.getUserName())&& pass.equals(li.getPassWord()))
			System.out.println("Login successfully...");
		else
			System.err.println("Invalid UserName&PassWord..!");
	}
}
