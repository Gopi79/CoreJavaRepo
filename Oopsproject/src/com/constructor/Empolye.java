package com.constructor;

public class Empolye
{
	int empid;
	String empname;
	long empsal;
	String empdesg;
	
	//default Constructor
	public Empolye()
	{
		System.out.println("Default Constructor.");
	}
	//Parameterized Constructor
	public Empolye(int empid, String empname, long empsal, String empdesg)
	{
		System.out.println("This is Perameteriszed Constructor.");
		System.out.println(empid+" "+empname+" "+empsal+" "+empdesg);
	}
}
