package com.trycatchandfinally;

public class TrywithFinally 
{
	public static void main (String[] args) 
    {   
        try
        {
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("Inside try block");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-finally clause");
    }
}
