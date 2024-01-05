package com.constructoroverloading;

public class Employedetails 
{
	public static void main(String[] args)
	{
		Details d=new Details(101, "ram");
		System.out.println(d.id+" "+d.name);
		Details dt=new Details(102, "krishna", "Netflix", 45000, "Hyderbad");
		System.out.println(
				dt.id+" "+
				dt.name+" "+
				dt.company+" "+
				dt.sal+" "+
				dt.loc
				);
	}
}
