package com.telephone;

public class TestPhone 
{
	public static void main(String[] args) 
	{
		/*
		 * Deskphone myPhone=new Deskphone("123456"); myPhone.powerOn();
		 * myPhone.callPhone("123456"); myPhone.answer();
		 */
		
		Mobilephone mymobile=new Mobilephone("1234567");
		mymobile.powerOn();
		mymobile.callPhone("1234567");
		mymobile.answer();
	}
}
