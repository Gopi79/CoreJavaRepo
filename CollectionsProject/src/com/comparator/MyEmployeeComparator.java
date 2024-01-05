package com.comparator;

import java.util.Comparator;

public class MyEmployeeComparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Employee emp1=(Employee)obj1;
		Employee emp2=(Employee)obj2;
		//Based on ID
		/*
		 * String s1=emp1.ename; String s2=emp2.ename; return s1.compareTo(s2);
		 */
		//Based on Experiance
		
		 Integer Ex1=emp1.Experiance;
		 Integer Ex2=emp2.Experiance;
//		 if(Ex1<Ex2)
//			 return+1;
//		 else if(Ex1 > Ex2)
//			 return -100;
//		 else 
//			 return 0;
		 return -Ex1.compareTo(Ex2);
		 
		//Based on Salary
		/*
		 * Integer sal1=emp1.salary; Integer sal2=emp2.salary; // if(sal1<sal2) //
		 * return +1; // else if(sal1 > sal2) // return -100; // else // return 0;
		 * return -sal1.compareTo(sal2);
		 */
	}
}
