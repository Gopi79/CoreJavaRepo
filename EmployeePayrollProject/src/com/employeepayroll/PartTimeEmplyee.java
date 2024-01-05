package com.employeepayroll;

public class PartTimeEmplyee extends Employee
{
	private int hoursWork;
	
	private double hourlyRate;
	
	public PartTimeEmplyee(int eid, String ename,int hoursWork,double hourlyRate)
	{
		super(eid, ename);
		
		this.hoursWork=hoursWork;
		
		this.hourlyRate=hourlyRate;
	}

	@Override
	public double calculateSalary()
	{
		return hoursWork*hourlyRate;
	}
}
