package com.has_arelation;

public class Login 
{
	private String userName;
	private String passWord;
	public Login(String userName, String passWord)
	{
		this.userName = userName;
		this.passWord = passWord;
	}
	String loginInfo()
	{
		return userName+"\n"+passWord;
	}	
}
