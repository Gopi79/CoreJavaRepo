package com.methods;

public class Person3
{
	int id;
	String name;
	Person3[] m2()
	{
		Person3 p1 = new Person3();
		p1.id = 101;
		p1.name = "Raju";
		Person3 p2 = new Person3();
		p2.id = 102;
		p2.name = "Rani";
		Person3 p3 = new Person3();
		p3.id = 103;
		p3.name = "Anil";
		Person3[] arr = { p1, p2, p3 };
		return arr;
	}
	void m1(Person3 p1, Person3 p2) 
	{
		System.out.println(p1.id + "--" + p1.name);
		System.out.println(p2.id + "--" + p2.name);
	}
	public static void main(String[] args)
	{
		Person3 p = new Person3(); 
		Person3 p1 = new Person3(); 
		p1.id = 101;
		p1.name = "Raju";
		Person3 p2 = new Person3(); 
		p2.id = 102;
		p2.name = "Rani";
		p.m1(p1, p2);
		Person3[] arr = p.m2();
		for (Person3 person : arr)
		{
			System.out.println(person.id + "--" + person.name);
		}

	}
}