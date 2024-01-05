package com.encap;

public class Edetails 
{
	public static void main(String[] args)
	{
		Employe emp=new Employe();
		emp.setEid(101);
		emp.setName("Krishna");
		emp.setSal(30000);
		emp.setLoc("Hyderbad");
		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		System.out.println(emp.getLoc());
	}
}
