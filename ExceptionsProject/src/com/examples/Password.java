package com.examples;

public class Password 
{
	public PasswordCheck valid(String psw)throws PasswordException
	{
		if(psw.equals("abc@123"))
			return new PasswordCheck();
		else
		{
			throw new PasswordException("Enter Password is Wrong.!");
		}
			
	}
}
