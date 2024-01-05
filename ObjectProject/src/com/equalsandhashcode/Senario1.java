package com.equalsandhashcode;

public class Senario1 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		
		emp1.setId(1);
		emp1.setName("Ram");
		
		Employee emp2=new Employee();
		
		emp2.setId(1);
		emp2.setName("Ram");
		
		//senario 1
		System.out.println(emp1==emp2);
		
		System.out.println(!emp1.equals(emp2));
	}
}
