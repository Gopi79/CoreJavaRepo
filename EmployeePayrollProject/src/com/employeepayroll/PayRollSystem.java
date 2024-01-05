package com.employeepayroll;

import java.util.ArrayList;

public class PayRollSystem 
{
	private ArrayList<Employee> employeeList;

	public PayRollSystem()
	{
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employee employee)
	{
		employeeList.add(employee);
	}
	
	public void removeEmployee(int id)
	{
		Employee employeeToRemove=null;
		for(Employee employee:employeeList)
		{
			if(employee.getEid()==id)
			{
				employeeToRemove=employee;
				break;
			}
		}
		if(employeeToRemove!=null)
		{
			employeeList.remove(employeeToRemove);
		}
	}
	
	public void displayEmployee()
	{
		for(Employee employee:employeeList)
		{
			System.out.println(employee);
		}
	}
}
