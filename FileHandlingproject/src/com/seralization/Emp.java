package com.seralization;

import java.io.Serializable;

public class Emp implements Serializable
{
	private static final long serialversionUID = 129348938L;
	transient int empid;
	static int pass;
	String name;
	int age;
	
	public Emp(int empid, String name, int age,int pass) {
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.pass = pass;
	}
}
