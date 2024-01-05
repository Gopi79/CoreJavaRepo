package com.calc;

public class Test_calc 
{
	public static void main(String[] args) 
	{
		Calculator cl=new Calculator();
		int add=cl.addition(10,20);
		System.out.println(add);
		
		int sub=cl.substraction(20,10);
		System.out.println(sub);
		
		int mul=cl.multiplication(10,2);
		System.out.println(mul);
		
		int div=cl.division(100,10);
		System.out.println(div);
	}
}
