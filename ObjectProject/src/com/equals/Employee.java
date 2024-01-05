package com.equals;

public class Employee 
{
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args)
	{
		Employee emp1=new Employee(101, "Jhon");
		Employee emp2=new Employee(101, "Jhon");
		
		System.out.println(emp1.equals(emp2));//false compares address
		System.out.println(emp1==emp2);//false compares address
		
		String s=new String("Ram");
		String st=new String("Ram");
		
		System.out.println(s.equals(st));//true compares content
	}
}
