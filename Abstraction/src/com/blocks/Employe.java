package com.blocks;

public class Employe 
{
	static String name="Raj";
	static int eid;
	static int age;
	static String comapanyname="TCS";
	static
	{
		name="Krishna";
		System.out.println("Employee Name: "+name);
	}
	static
	{
		eid=1241;
		System.out.println("Employee ID: "+eid);
	}
	static
	{
		age=22;
		System.out.println("Employe Age: "+age);
	}
	static
	{
		System.out.println("Employe Company: "+comapanyname);
	}
	static void details()
	{
		System.out.println("Employee Details");
	}
	public static void main(String[] args)
	{
		Employe.details();
		System.out.println("Main method");
	}
	
}
