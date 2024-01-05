package com.methods;

public class Drive
{
	public static void main(String[] args)
	{
		Drive d = new Drive();
		
		Student s = new Student();
		s.id = 101;
		s.name = "raju";
		d.print(s);
	}
	void print(Student s1) {
		System.out.println(s1.id + "  " + s1.name);
	}

}
