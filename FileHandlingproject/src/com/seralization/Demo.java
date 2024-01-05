package com.seralization;

import java.io.Serializable;

public class Demo implements Serializable
{
	public int userid;
	public String password;
	
	public Demo(int userid, String password)
	{
		this.userid = userid;
		this.password = password;
	}
}
