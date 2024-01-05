package com.exceptionsprogrames;

public class TestCatch
{
	public static void main(String[] args)
	{
		System.out.println("main( ) method started...");
		try
		{
			System.out.println("try block start");
			String s = "hi";
			int i = s.length();
			System.out.println("try block end");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("first catch");
		}
		catch (NullPointerException ne)
		{
			System.out.println("second catch");
		}
		System.out.println("main( ) method ended...");
	}
}
