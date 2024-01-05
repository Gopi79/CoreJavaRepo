package com.employeepayroll;

public abstract class Employee 
{
	private int eid;
	
	private String ename;
	
	public Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() 
	{
		return eid;
	}

	public String getEname() 
	{
		return ename;
	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString()
	{
		return "Employee [name="+ename+", id="+eid+", salary="+calculateSalary()+"]";
	}
}
