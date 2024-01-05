package com.trywithfinall;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method starts.");
		try {
		    System.out.println("Inside try");
		} finally {
		    System.out.println("Inside finally");
		}
		System.out.println("Main method ended.");
	}
}
