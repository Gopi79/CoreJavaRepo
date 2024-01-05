package com.employeepayroll;

public class FullTimeEmployee extends Employee
{
	private double monthlySalary;
	
	public FullTimeEmployee(int eid, String ename,double monthlySalary)
	{
		super(eid, ename);
		this.monthlySalary=monthlySalary;
	}
	
	@Override
	public double calculateSalary()
	{
		return monthlySalary;
	}

}
