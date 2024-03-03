package com.mapinstreams;

import java.util.Arrays;
import java.util.List;

public class Test 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("srinivas",31,90.00);
		Employee e2=new Employee("shiva",34,58.00);
		Employee e3=new Employee("venkat",25,40.00);
		Employee e4=new Employee("anand",23,34.00);
		Employee e5=new Employee("kumar",35,89.00);
		Employee e6=new Employee("raghu",67,120.00);
		Employee e7=new Employee("basha",34,85.00);
		Employee e8=new Employee("pawan",45,150.00);
		
		List<Employee> emplist=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		
		//emplist.stream().filter(e->e.getSalary()>50.00 && e.getAge()<40).map(e->e.getName()+"-"+e.getSalary()).sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
		
		//emplist.stream().filter(e->e.getName().length()>4).map(e->e.getName()+"-"+e.getAge()+"-"+"-"+(e.getSalary()+20.00)).sorted().forEach(System.out::println);
		
		emplist.stream().sorted((s1,s2)->s1.getSalary()<s2.getSalary()?1:s1.getSalary()>s2.getSalary()?-1:0).map(e->e.getName()+"-"+e.getAge()+"-"+(e.getSalary()+20.00)).forEach(System.out::println);
	}
}