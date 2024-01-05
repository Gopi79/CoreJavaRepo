package com.employeepayroll;

public class TestEmployee
{
	public static void main(String[] args)
	{
		PayRollSystem payrollSystem=new PayRollSystem();
		
		FullTimeEmployee emp1=new FullTimeEmployee(101, "Ram",80000.00);
		
		PartTimeEmplyee emp2=new PartTimeEmplyee(102,"Raj", 35,250.45);
		
		payrollSystem.addEmployee(emp1);
		
		payrollSystem.addEmployee(emp2);
		
		System.out.println("Employee Details in Initial: ");
		
		System.out.println("======================================");
		
		payrollSystem.displayEmployee();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Removing Employee");
		
		payrollSystem.removeEmployee(102);
		
		System.out.println("---------------------------------------");
		
		System.out.println("After remove Employee Details: ");
		
		System.out.println("=======================================");
		
		payrollSystem.displayEmployee();
	}
}
