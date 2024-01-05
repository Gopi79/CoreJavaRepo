package com.comparator;

public class Employee implements Comparable
{
	int eid;
	String ename;
	int Experiance;
	int salary;
	
	public Employee(int eid,String ename,int Experiance,int salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.Experiance=Experiance;
		this.salary=salary;
	}
	public String toString()
	{
		return ename+"---"+eid+"---"+Experiance+"---"+salary;
	}
	public int compareTo(Object obj)
	{
		//Based on ID
		/*
		 * int id1=this.eid; int id2=((Employee)obj).eid; if(id1<id2) { return -1; }
		 * else if (id1>id2) { return 1; } else { return 0; }
		 */
		//Based on Experiance
		
		 int Experiance1=this.Experiance;
		 int Experiance2=((Employee)obj).Experiance;
		 if(Experiance1<Experiance2)
		 {
			 return -1;
		 }
		 else if(Experiance1>Experiance2)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0; 
		 }
		//Based on salary
		/*
		 * int salary1=this.salary; int salary2=((Employee)obj).salary;
		 * if(salary1<salary2) { return -1; } else if (salary1>salary2) { return 1; }
		 * else { return 0; }
		 */
	}
}
