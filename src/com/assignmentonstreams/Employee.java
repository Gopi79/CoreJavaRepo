package com.assignmentonstreams;

public class Employee 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int year;
	private double sal;
	
	public Employee(int id, String name, int age, String string, String dept, int year, double sal)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = string;
		this.dept = dept;
		this.year = year;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "{id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", year=" + year + ", sal=" + sal + "}";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDept() {
		return dept;
	}
	public int getYear() {
		return year;
	}
	public double getSal() {
		return sal;
	}
	
	
}
